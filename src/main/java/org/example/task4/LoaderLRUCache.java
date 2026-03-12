package org.example.task4;

public class LoaderLRUCache {
    public static void main(String[] args) {
        int capacity = 5;
        LRUCache<Integer, String> cache = new LRUCache<>(capacity);
        cache.put(1, "Один");
        cache.put(2, "Два");
        cache.put(3, "Три");
        cache.put(4, "Четыре");
        cache.put(5, "Пять");

        System.out.println(cache.get(1));
        cache.put(6, "Шерсть");
        System.out.println(cache);
    }
}
