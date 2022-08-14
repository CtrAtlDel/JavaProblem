package com.cache.operative;

import java.util.HashMap;
import java.util.Map;

public class CacheRepository<K, V> {
    Map<K, V> map;

    public CacheRepository(Map<K, V> map) {
        this.map = map;
    }

    public boolean add(K key, V value){
        
    }
}
