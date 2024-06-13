package multithreading;

public class MyThread1 {

    public static void main(String[] args) {
        Thread thread= new Thread("My first Thread");
        thread.start();

        System.out.println(" Name : " + thread.getName());
    }
}
