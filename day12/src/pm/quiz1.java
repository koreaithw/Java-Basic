package pm;

// 사용자 예외 생성
class OverException extends Exception {

}
// 사용자 예외 생성
class minusException extends Exception {

}

public class quiz1 {

	public static void main(String[] args) {
		C c = new C();
		c.score(101);
		c.score(-1);
		c.score(50);
	}
}

class C {
	//사용자 예외 인스턴스화(사용준비)
	OverException oe = new OverException();
	minusException me = new minusException();

	void score(int num) {
		try {
			if (num > 100) {
				throw oe; //100이상의 값이 들어오면 oe 예외 생성
			} else if (num < 0) {
				throw me;  // 0 미만의 값이 들어오면 me 예외생성
			} else {
				System.out.println("정상적인 값 입니다.");
			}
		}catch(OverException oe) {  //oe 예외 발생시
			System.out.println("예외발생 100점 초과");
		}catch(minusException me) { //me 예외 발생시
			System.out.println(num + " 예외발생 0미만");
		}
		

	}
}
