package bridge;

// BasicRemote with basic functionality
public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    public void powerOn() {
        System.out.println("Basic Remote: Power ON.");
        device.powerOn();
    }

    public void powerOff() {
        System.out.println("Basic Remote: Power OFF.");
        device.powerOff();
    }
}
