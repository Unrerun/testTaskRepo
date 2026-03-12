package org.example.task4;

//Реализуй класс LRUCache<K, V> на основе LinkedHashMap. Кэш должен иметь фиксированный размер (capacity). При достижении размера, должен удаляться самый давно использованный элемент.

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final int capacity;
    private LinkedHashMap<K, V> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {

            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }

        };
    }

    public void put(K key, V value) {
        System.out.println("Put " + key + " " + value);
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public String toString() {
        return cache.toString();
    }
}

