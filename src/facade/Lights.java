package facade;

// Smart device: Lights
public class Lights {
    public void turnOn() {
        System.out.println("Lights are turned ON.");
    }

    public void turnOff() {
        System.out.println("Lights are turned OFF.");
    }

    public void dim(int level) {
        System.out.println("Lights are dimmed to " + level + "%.");
    }
}

