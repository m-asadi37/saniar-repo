package pack1;

// Without multithreading - orders process one by one
class CoffeeShop {
    public static void main1(String[] args) {
        String[] orders = {"Latte", "Cappuccino", "Americano", "Mocha"};
        
        for (String order : orders) {
            processOrder(order);
        }
    }

    public static void main(String[] args) {
        String[] orders = {"Latte", "Cappuccino", "Americano", "Mocha"};

        for (String order : orders) {
            Thread t1 = new Barista(order);
            t1.start();
        }

        System.out.println("wait for new orders?");
    }
    
    static void processOrder(String order) {
        System.out.println("Starting: " + order);
        try {
            Thread.sleep(3000); // Simulating brewing time (3 seconds)
        } catch (InterruptedException e) {}
        System.out.println("Completed: " + order);
    }
}