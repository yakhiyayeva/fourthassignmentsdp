package facade;

// SmartHomeApp to demonstrate the Facade pattern
public class SmartHomeApp {

    public static void main(String[] args) {
        // Create individual smart devices
        Lights lights = new Lights();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        // Create the SmartHomeFacade
        SmartHomeFacade smartHome = new SmartHomeFacade(lights, thermostat, securitySystem, entertainmentSystem);

        // Simulate arriving home
        smartHome.arriveHome();

        // Simulate movie mode
        smartHome.movieMode("Inception");

        // Simulate night mode
        smartHome.nightMode();

        // Simulate leaving home
        smartHome.leaveHome();
    }
}

