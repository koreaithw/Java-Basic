package pm;

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
	}

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

class Tiger extends Animal implements Predator {
	public String getFood() { // 실제 구현
		return "apple";
	}
}

class Lion extends Animal implements Predator {
	public String getFood() { // 실제 구현
		return "banana";
	}
}

class Crocodile extends Animal implements Predator {
	public String getFood() { // 실제 구현
		return "strawberry";
	}
}

class Leopard extends Animal implements Predator {
	public String getFood() { // 실제 구현
		return "orange";
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
