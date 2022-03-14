package pm;

public class Exam7 {
	public static void main(String[] args) {
		//super 키워드  super() method
//		
//		this 키워드와 this()메서드는 클래스 내부의 특정 구성요소(생성자, 객체) 호출할때 사용했다.
//		생략하면 저동을 추가해 주기도 했다.
//		이와 달리 super 는 모두 부모 클래스와 관련이있다. 따라서 상속 관계에서만 사용을 하게된다.
		
		H h = new J();
		h.abc();
		h.bcd();
		
	}
}
class H{
	void abc() {
		System.out.println("H클래스의 abc()");
	}
	void bcd() {
		
	}
}

class J extends H{
	@Override
	void abc() {
		System.out.println("J클래스의 abc()");
	}
	
}
