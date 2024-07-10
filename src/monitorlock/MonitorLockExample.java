package monitorlock;

public class MonitorLockExample {

    public synchronized void task1(){

        try {
            System.out.println("Inside task1");
            Thread.sleep(10000);
            System.out.println("Task 1 completed");
        }catch (Exception exception){

        }
    }
    public synchronized void task2(){
        System.out.println("task 2 but before synchronized");
        synchronized (this){
            System.out.println("task 2 inside synchronized");
        }
    }

    public synchronized void task3(){
        System.out.println("Inside task3...");
    }
}
