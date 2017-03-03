package nl.jcore.java8demo.streaming;

import java.time.Instant;
import java.util.*;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class Streaming {
    private final class Transaction {
        private final Instant timestamp;

        public Transaction(final Instant timestamp) {
            this.timestamp = timestamp;
        }

        public Instant getTimestamp() {
            return timestamp;
        }
    }

    private final class User {
        private final String name;
        private final int age;
        private final List<Transaction> transactions;

        public User(final String name, final int age) {
            this.name = name;
            this.age = age;
            this.transactions = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public boolean hasTransactions() {
            return !transactions.isEmpty();
        }

        public List<Transaction> getTransactions() {
            return transactions;
        }
    }

    private List<User> getUsers() {
        return new ArrayList<>();
    }

    public List<String> java7StreamingEquivalent() {
        final List<String> result = new ArrayList<>();
        for (final User user : getUsers()) {
            if (user.age >= 18) {
                result.add(user.getName());
            }
            if (result.size() >= 10) {
                break;
            }
        }
        return result;
    }

    public Map<String, Transaction> java7StreamingMapEquivalent() {
        final Map<String, Transaction> result = new HashMap<>();
        for (final User user : getUsers()) {
            if (user.age >= 18 && user.hasTransactions()) {
                final List<Transaction> transactions = user.transactions;
                result.put(user.getName(), transactions.get(transactions.size() - 1));
            }
            if (result.size() >= 10) {
                break;
            }
        }
        return result;
    }

    public List<String> java8Streaming() {
        return getUsers().stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .limit(10)
                .collect(toList());
    }

    public Map<String, Transaction> java8StreamingMap() {
        final Comparator<User> compareLastTransactionTimestamp = (u1, u2) ->
                Long.compare(getLastTransaction(u1).getTimestamp().toEpochMilli(),
                        getLastTransaction(u2).getTimestamp().toEpochMilli()
                );
        return getUsers().stream()
                .filter(u -> u.getAge() >= 18)
                .filter(User::hasTransactions)
                .sorted(compareLastTransactionTimestamp)
                .limit(10)
                .collect(toMap(User::getName, this::getLastTransaction, (v1, v2) -> v1, LinkedHashMap::new));
    }

    private Transaction getLastTransaction(final User user) {
        return user.transactions.get(user.transactions.size() - 1);
    }
}
