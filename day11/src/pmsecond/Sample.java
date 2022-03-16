package pmsecond;

public class Sample {

	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		Leopard leopard = new Leopard();
		zooKeeper.feed(tiger); // 메서드 오버로딩
		zooKeeper.feed(lion); // 메서드 오버로딩
		zooKeeper.feed(crocodile); // 메서드 오버로딩
		zooKeeper.feed(leopard); // 메서드 오버로딩
		System.out.println(Predator.speed());
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		bouncer.barkAnimal(crocodile);
		bouncer.barkAnimal(leopard);
		
	}

}

interface PredatorBarkerable extends Predator, Barkerable{
	
}

interface Predator {
	public String getFood(); // 메서드만 선언, 구현x

	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	int LEG_COUNT = 4;
	static int speed() {
		return LEG_COUNT * 30;
	}
}

class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements PredatorBarkerable {
	public String getFood() { // 실제 구현
		return "apple";
	}
	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Animal implements PredatorBarkerable {
	public String getFood() { // 실제 구현
		return "banana";
	}
	public void bark() {
		System.out.println("으르렁");
	}
}

class Crocodile extends Animal implements PredatorBarkerable {
	public String getFood() { // 실제 구현
		return "strawberry";
	}
	public void bark() {
		System.out.println("악어");
	}
}

class Leopard extends Animal implements PredatorBarkerable {
	public String getFood() { // 실제 구현
		return "orange";
	}
	public void bark() {
		System.out.println("표범");
	}
}

class ZooKeeper {
	public void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
//	void feed(Predator tiger) {
//		System.out.println("feed apple");
//	}
//	void feed(Predator lion) {
//		System.out.println("feed banana");
//	}
//	void feed(Predator crocodile) {
//		System.out.println("feed strawberry");
//	}
//	void feed(Predator leopard) {
//		System.out.println("feed orange");
//	}
}
interface Barkerable{
	void bark();
}
class Bouncer{
	void barkAnimal(Barkerable animal) {
		animal.bark();
//		if(animal instanceof Tiger) {  //Tiger클래스로 생성한 인스턴스인가?
//			System.out.println("어흥");
//		}
//		else if(animal instanceof Lion) { //Lion 클래스로 생성한 인스턴스인가?
//			System.out.println("으르렁");
//		}
	}
}