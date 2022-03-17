package pm;

public class Exam6 {
	public static void main(String[] args) {

		
	}
}
class MyException extends Exception{//일반예외
	MyException() {
		
	}
	MyException(String s){
		super(s);
	}
}

class MyRTException extends RuntimeException{//실행예외
	MyRTException() {
		
	}
	MyRTException(String s){
		super(s);
	}
}