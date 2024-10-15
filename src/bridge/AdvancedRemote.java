package bridge;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Advanced Remote: Mute the device.");
        device.setVolume(0);
    }
}
