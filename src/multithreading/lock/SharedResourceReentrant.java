package multithreading.lock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    public void producer(ReentrantLock lock){
        try {
            lock.lock();
            System.out.println("Lock aquired..." +Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (Exception e) {

        }
        finally {
            System.out.println("Lock realeased ..."+Thread.currentThread().getName());
            lock.unlock();
        }

    }
}
