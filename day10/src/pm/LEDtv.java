package pm;

public class LEDtv implements TV {
	
	@Override
	public void turnOn() {
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("볼륨조절");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("채널 조절");
	}

}
