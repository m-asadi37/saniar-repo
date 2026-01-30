package ex1;

public class Engine {

    private int hPower;
    private String model;

    public Engine(int hPower, String model) {
        this.hPower = hPower;
        this.model = model;
    }

    public int gethPower() {
        return hPower;
    }

    public void sethPower(int hPower) {
        this.hPower = hPower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
