package pm;

public class Exam4_1 {
	public static void main(String[] args) {
		Human h = new Human();
		h.name="홍길동";
		h.age = 13;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "성춘향";
		s.age = 16;
		s.StudentID = 31312;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "이몽룡";
		w.age = 17;
		w.workerID = 123123;
		w.goToWork();
		
	}
}

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}	
}

class Student extends Human{
	int StudentID;
	void goToSchool() {}
}
class Worker extends Human{
	int workerID;
	void goToWork() {}
}

