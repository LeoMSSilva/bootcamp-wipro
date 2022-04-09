package OOP1;

public class Television {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.showVolumeAndChannel();
		remoteControl.increaseOrDecreaseVolume(false);
		remoteControl.increaseOrDecreaseVolume(false);
		remoteControl.increaseOrDecreaseVolume(true);
		remoteControl.increaseOrDecreaseChannel(false);
		remoteControl.increaseOrDecreaseChannel(true);
		remoteControl.increaseOrDecreaseChannel(true);
		remoteControl.setChannel(60);
		remoteControl.showVolumeAndChannel();
	}

}
