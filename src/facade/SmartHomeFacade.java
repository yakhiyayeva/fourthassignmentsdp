package facade;

// Facade: SmartHomeFacade
public class SmartHomeFacade {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Lights lights, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    // Method for when you leave the home
    public void leaveHome() {
        System.out.println("\nLeaving home...");
        lights.turnOff();
        thermostat.setTemperature(18); // Set to energy-saving mode
        securitySystem.arm();
        entertainmentSystem.turnOff();
    }

    // Method for when you arrive home
    public void arriveHome() {
        System.out.println("\nArriving home...");
        lights.turnOn();
        thermostat.setTemperature(22); // Set to a comfortable temperature
        securitySystem.disarm();
    }

    // Method for night mode
    public void nightMode() {
        System.out.println("\nNight mode...");
        lights.dim(10);
        thermostat.setTemperature(20); // Set to a cooler temperature for sleeping
        securitySystem.arm();
    }

    // Method for movie mode
    public void movieMode(String movie) {
        System.out.println("\nMovie mode...");
        lights.dim(20); // Dim lights for a movie experience
        entertainmentSystem.turnOn();
        entertainmentSystem.playMovie(movie);
    }
}

