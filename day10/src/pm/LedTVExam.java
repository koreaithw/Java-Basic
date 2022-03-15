package pm;

public class LedTVExam {
	public static void main(String[] args) {

		TV tv = new LEDtv();

		tv.turnOn();
		tv.turnOff();
		tv.changeVolume(tv.Max_VOLUME);
		tv.changeChannel(tv.MIN_VOLUME);

	}
}
