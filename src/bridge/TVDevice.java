package bridge;

public class TVDevice implements Device {
    private boolean power;
    private int channel;
    private int volume;

    @Override
    public void powerOn() {
        power = true;
        System.out.println("TV is now ON.");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("TV is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }
}



