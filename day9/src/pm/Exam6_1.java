package pm;

public class Exam6_1 {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		b.print1();
		b.print2();
		b.print2(1);		
	}
}


class AA {
	void print1() {
		System.out.println("A클래스 print 1 ");
	}
	void print2() {
		System.out.println("A클래스 print 2 ");
	}
}
class BB extends AA{
	@Override///  @ == annotation 컴퓨터가 읽는 주석
	void print1() {    //메서드 오버라이딩
		System.out.println("B클래스 print 1 ");
	}
	void print2(int a) {  //메서드 오버로딩
		System.out.println("B클래스 print 2 ");
	}
}
