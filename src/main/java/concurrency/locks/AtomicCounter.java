package concurrency.locks;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic counter.
 *
 * @author Ken Kousen
 */
public class AtomicCounter {

    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

}
