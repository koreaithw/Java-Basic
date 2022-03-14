package pm;

class superA{
	superA(){
		System.out.println("A 생성자");
	}
}

class superB extends superA{
	superB(){
		System.out.println("B 생성자");
	}
}

class superC{
	superC(int a){
		System.out.println("C 생성자");
	}
}

class superD extends superC{
	superD() {
		super(3);
	}
}
public class Exam7_3 {
	public static void main(String[] args) {
		superA a = new superA();
		superD d = new superD();
		superB b = new superB();
	}
}
