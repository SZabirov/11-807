package com.company.equals.simplemap;

public class SimpleMap<K, V> implements Map<K, V> {
    private static final int SIZE = 10;
    private Entry[] entries;
    private int count;

    public SimpleMap() {
        this.entries = new Entry[SIZE];
        this.count = 0;
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
                return;
            }
        }
        entries[count++] = new Entry(key, value);
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                return (V) entries[i].value;
            }
        }
        return null;
    }

    class Entry<I, E> {
        I key;
        E value;

        public Entry(I key, E value) {
            this.key = key;
            this.value = value;
        }
    }
}
