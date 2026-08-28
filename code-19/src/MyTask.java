public class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("start new Thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end new Thread " +Thread.currentThread().getName());
    }
}
