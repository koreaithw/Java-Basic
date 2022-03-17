package pm;

public class Exam6 {
	public static void main(String[] args) {
		B b =new B();
		b.bcd_1();
		b.bcd_2();
	}
}
class MyException extends Exception{//일반예외
	public MyException() {
		super();
	}
	MyException(String s){
		super(s);
	}
}

class MyRTException extends RuntimeException{//실행예외
	public MyRTException() {
		super();
	}
	MyRTException(String s){
		super(s);
	}
}

class B{
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메시지:MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메시지:MyRTException");
	
	void abc_1(int num) {
		try {
			if(num>70) {
				System.out.println("정상작동");
			}else {
				throw me1; //예외발생    --->예외를 강제로 발생시킴.
			}
		}catch (MyException e) {
			System.out.println("예외 처리 1");
			
		}
	}
	void bcd_1() {
		abc_1(65);
	}
	
	void abc_2(int num) throws MyException{
		if(num>70) {
			System.out.println("정상작동");
		}else {
			throw me1; //예외발생    --->throws MyException 예외를 호출하는곳에서 처리하길 바람
		}
	}
	void bcd_2() {
		try {
			abc_2(65);			
		}catch (MyException e) {
			System.out.println("예외 처리 2");
		}
	}
}