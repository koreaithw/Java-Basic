package pm;

class FoolException extends RuntimeException {
	//default 기본생성자 생성 
	//상속을 받고있으므로 부모의 생성자로 호출한다. super(); 생략.
	
}

public class Exam6_1 {

	public void sayNick(String nick) throws FoolException{
		if ("fool".contentEquals(nick)) {
			throw new FoolException(); // 강제 예외발생
		}
		System.out.println("당신의 별명은 " + nick + " 입니다");
	}

	public static void main(String[] args) {
		Exam6_1 e = new Exam6_1();
		try {
			e.sayNick("fool");			
		}catch(FoolException e1) {
			System.out.println("에러 발생");
		}
		e.sayNick("genious");
	}
}

