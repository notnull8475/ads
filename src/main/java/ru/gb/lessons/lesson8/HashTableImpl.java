
package ru.gb.lessons.lesson8;

import java.util.HashMap;
import java.util.HashSet;

public class HashTableImpl<K, V> implements HashTable<K, V> {
    private final Item<K, V>[] data;
    private final Item<K, V> emptyItem;
    private int size;

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;
        private Item<K, V> next;

        Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("key: %s -> value: %s -> next: %s", key, value, next);
        }

    }

    public HashTableImpl(int initialCapacity) {
        this.data = new Item[initialCapacity * 2];
        emptyItem = new Item<>(null, null);
    }

    public HashTableImpl() {
        this(16);
    }

    @Override
    public boolean put(K key, V value) {
        if (size() == data.length) {
            return false;
        }

        int indexFromHashFunc = hashFunc(key);
        int n = 0;

        Item<K, V> current = data[indexFromHashFunc];

        while (current != null && current != emptyItem) {

            if (isKeysEquals(data[indexFromHashFunc], key)) {
                data[indexFromHashFunc].setValue(value);
                return true;
            }
            if (current.next != null) {
                current = current.next;
                continue;
            }
            current.next = new Item<>(key, value);
            return true;
//            indexFromHashFunc += getStepLinear();
//            indexFromHashFunc += getStepQuadratic(n++);
//            indexFromHashFunc += getDoubleHash(key);
//
//            indexFromHashFunc %= data.length;
        }

        data[indexFromHashFunc] = new Item<>(key, value);
//        size++;

        return true;
    }

    private int getDoubleHash(K key) {
        int n = data.length / 2;
        return n - (key.hashCode() % n);
    }

    private int getStepQuadratic(int i) {
        return (int) Math.pow(i, 2);
    }

    private int getStepLinear() {
        return 1;
    }

    private boolean isKeysEquals(Item<K, V> item, K key) {
        if (item == emptyItem) {
            return false;
        }
        return (item.getKey() == null) ? (key == null) : (item.getKey().equals(key));
    }

    private int hashFunc(K key) {
        return Math.abs(key.hashCode() % data.length);
    }

    @Override
    public V get(K key) {
        Item<K, V> item = data[hashFunc(key)];
        while (!isKeysEquals(item, key) && item.next != null) {
            item = item.next;
        }
        return isKeysEquals(item, key) ? item.value : null;
    }

    private int indexOf(K key) {

        int indexFromHashFunc = hashFunc(key);

        int count = 0;
        while (count++ < data.length) {
            if (data[indexFromHashFunc] == null) {
                break;
            }
            if (isKeysEquals(data[indexFromHashFunc], key)) {
                return indexFromHashFunc;
            }
            indexFromHashFunc += getDoubleHash(key);
            indexFromHashFunc %= data.length;
        }

        return -1;
    }

    @Override
    public V remove(K key) {
        Item<K, V> item = data[hashFunc(key)];
        if (isKeysEquals(item, key)) {
            if (item.next!=null) data[hashFunc(key)] = item.next;
            return item.value;
        } else {
            if (item.next!=null) {
                Item<K, V> previous = item;
                item = item.next;
                while (!isKeysEquals(item, key) && item.next != null) {
                    previous = item;
                    item = item.next;
                }
                if (isKeysEquals(item,key)) previous.next = item.next;

            } else return null;
        }
        return item.value;
    }
//    public V remove(K key) {
//        int index = indexOf(key);
//        if (index == -1) {
//            return null;
//        }
//
//        Item<K, V> removed = data[index];
//        data[index] = emptyItem;
//
//        return removed.getValue();
//    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(String.format("%s = [%s]%n", i, data[i]));
        }
        return sb.toString();
    }
}
