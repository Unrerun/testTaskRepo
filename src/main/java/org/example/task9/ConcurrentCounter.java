package org.example.task9;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Реализуйте потокобезопасный счетчик с методами:
 * - increment() - атомарно увеличивает значение
 * - decrement() - атомарно уменьшает значение
 * - getValue() - возвращает текущее значение
 * - reset() - сбрасывает значение
 * <p>
 * Протестируйте в многопоточной среде
 */
public class ConcurrentCounter {

    private final AtomicInteger counter = new AtomicInteger(0);

    private synchronized void increment() {
        counter.incrementAndGet();
    }

    private synchronized void decrement() {
        counter.decrementAndGet();
    }

    private synchronized int getValue() {
        return counter.get();
    }

    private synchronized void reset() {
        counter.set(0);
    }

}

// Напишите параметризованные тесты, проверяющие:
// 1. Корректность инкремента/декремента
// 2. Потокобезопасность при 1000 вызовов из 10 потоков
// 3. Корректность reset()