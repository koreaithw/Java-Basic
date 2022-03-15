package pm;

public class Taxi implements Meter {
	public void start() {
		System.out.println("운행을 시작합니다");
	}
	public static int BasedFee = 3000;
	public int stop(int distance) {
		int fare = BasedFee + distance * 2;
		return fare;
	}
}
