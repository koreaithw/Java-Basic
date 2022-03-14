package pm;

public class Exam7_2 {
	public static void main(String[] args) {
		//모든 생성자의 첫줄에는 반드시 this()또는 super()가 있어야 한다.
		//없으면 자동으로 자바가 삽입한다.
		//즉 상속관계에 있을 때 생성자를 호출하면 항상 부모 클래스의 생성자가
		//호출 된다는 것이다. 자식 클래스로 객체를 생설할 때는 부모 클래스의 객체도 만들어진다.
		V x = new XZ();
	}
}


class V{
	V(){
		System.out.println("V생성자");
	}

}
class XZ extends V{
	XZ(){
		System.out.println("XZ생성자");
	}
}