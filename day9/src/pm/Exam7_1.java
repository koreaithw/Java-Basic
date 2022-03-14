package pm;

public class Exam7_1 {
	public static void main(String[] args) {
//		부모 클래스에 init() 메서드가 있고 , 그 메서드에 500 줄 코드가 있다.
//		그런데 자식 클래스는 그 부모 클래스의 기능에다가 어떤 1줄만 추가하고 싶을때
//		super 가없다면 자식클래스에는 부모클래스의 메서드에 있는 500줄과 1줄을 모두 작성해야한다.
//		그런데 super를 사용하면 자식 클래스의 메서드에서 부모 클레스의 메서드를 호출하고 1줄만 작성하면 된다.
	}
}

class U{
	void init() {
		//500줄의 메서드
	}
}
class I extends U{
	void init() {
		
	}
}
class K extends U{
	void init() {
		super.init();
	}
}