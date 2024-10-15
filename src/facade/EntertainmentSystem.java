package facade;

// Smart device: EntertainmentSystem
public class EntertainmentSystem {
    public void turnOn() {
        System.out.println("Entertainment system is ON.");
    }

    public void turnOff() {
        System.out.println("Entertainment system is OFF.");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}

