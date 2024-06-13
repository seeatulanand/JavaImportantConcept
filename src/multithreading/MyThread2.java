package multithreading;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Now the thread is running ...");
    }

    public static void main(String[] args) {
        Runnable r1= new MyThread2();

        Thread thread= new Thread(r1,"My New Thread");
        thread.start();

        System.out.println("Thread name : "  + thread.getName());
    }


}
