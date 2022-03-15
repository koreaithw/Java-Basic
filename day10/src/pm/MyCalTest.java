package pm;

public class MyCalTest {
	public static void main(String[] args) {
		Calculator cal = new MyCal();
		System.out.println(cal.plus(2, 5));
		System.out.println(cal.multiple(2, 4));
		System.out.println(cal.exec(1, 2));
		
		System.out.println(Calculator.exec2(2, 6));
		
	}
}
