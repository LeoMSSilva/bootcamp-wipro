package OOP1;

public class RemoteControl {
	private int volume;
	private int channel;

	public RemoteControl() {
		this.volume = 50;
		this.channel = 1;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
		System.out.printf("\nVocê está assistindo ao canal %d.", this.channel);
	}

	public void increaseOrDecreaseVolume (boolean upOrDown) {
		this.volume = upOrDown == true ? this.volume+1 : this.volume-1;
		System.out.printf("\nO volume da televisão está em %d.", this.volume);
	};

	public void increaseOrDecreaseChannel (boolean upOrDown) {
		this.channel = upOrDown == true ? this.channel+1 : this.channel-1;
		System.out.printf("\nVocê está assistindo ao canal %d.", this.channel);
	};

	public void showVolumeAndChannel (){
		System.out.printf("\nVocê está assistindo ao canal %d e o volume da televisão está em %d.", this.channel, this.volume);
	}
}
