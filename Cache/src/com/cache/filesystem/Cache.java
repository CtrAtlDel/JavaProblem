package com.cache.filesystem;

public interface filesystem<K, V> {
    void create(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);

    V get(K key);

    int getSize();

    boolean clean();

    default void usingCache() {
        System.out.println("Using cache");
    }
}
