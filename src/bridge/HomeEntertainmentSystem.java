package bridge;

// HomeEntertainmentSystem class to demonstrate the functionality
public class HomeEntertainmentSystem {

    public static void main(String[] args) {
        // TV controlled by a basic remote
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);

        basicRemote.powerOn();
        basicRemote.setChannel(5);
        basicRemote.setVolume(15);
        basicRemote.powerOff();

        System.out.println();

        // Sound System controlled by an advanced remote
        Device soundSystem = new SoundSystemDevice();
        RemoteControl advancedRemote = new AdvancedRemote(soundSystem);

        advancedRemote.powerOn();
        advancedRemote.setVolume(30);
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.powerOff();
    }
}

