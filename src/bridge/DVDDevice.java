package bridge;

public class DVDDevice implements Device {
    private boolean power;
    private int volume;

    @Override
    public void powerOn() {
        power = true;
        System.out.println("DVD Player is now ON.");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("DVD Player is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD Player doesn't support channel switching.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD Player volume set to " + volume);
    }
}

