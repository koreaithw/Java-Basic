package pm;

public class TaxiExam {
	public static void main(String[] args) {

		 Meter taxi = new Taxi();

	        taxi.start();
	        taxi.afterMidnight();
	        taxi.stop(10);
	}
}
