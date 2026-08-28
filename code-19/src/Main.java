public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start of main");

        Runnable task = new MyTask();
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(task);
            t1.start();
        }

        System.out.println("end of main");
    }
}
