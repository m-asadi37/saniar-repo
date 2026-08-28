package pack1;

public class Barista extends Thread {

    private String order;

    public Barista(String order) {
        this.order = order;
    }

    @Override
    public void run() {
        processOrder(order);
    }

    private void processOrder(String order) {
        System.out.println("Starting: " + order);
        try {
            Thread.sleep(3000); // Simulating brewing time (3 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + order);
    }

}
