package pm;

public class Exam7 {

//	public void sayNick(String nick) throws FoolException {
//		if ("fool".contentEquals(nick)) {
//			throw new FoolException(); // 강제 예외발생
//		}
//		System.out.println("당신의 별명은 " + nick + " 입니다");
//	}

	public void sayNick(String nick) {
		try {
			if ("fool".contentEquals(nick)) {
				throw new FoolException(); // 강제 예외발생
			}
			System.out.println("당신의 별명은 " + nick + " 입니다");
		} catch (FoolException e) {
			System.out.println("FoolException 에러 발생");
		}

	}

	public static void main(String[] args) {

		Exam7 ee = new Exam7();
//		try {
//			ee.sayNick("fool");
//			ee.sayNick("genious");
//		} catch (FoolException e1) {
//			System.out.println("FoolException 에러 발생");
//		}
		ee.sayNick("fool");
		ee.sayNick("genious");
	}
}
