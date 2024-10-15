package bridge;

public class SoundSystemDevice implements Device {
    private boolean power;
    private int volume;

    @Override
    public void powerOn() {
        power = true;
        System.out.println("Sound System is now ON.");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("Sound System is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System doesn't support channel switching.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound System volume set to " + volume);
    }
}
