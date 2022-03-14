package pm;

class Animal {
	void cry() {

	}
}
class Bird extends Animal {
	void cry() {
		System.out.println("짹짹");
	}
}
class Cat extends Animal {
	void cry() {
		System.out.println("야용");
	}
}
class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}

public class Exam6 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal bird = new Bird();
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		animal.cry();
		bird.cry();
		cat.cry();
		dog.cry();
		
		Animal[] animals = {bird,cat,dog};
		for(Animal e: animals) {
			e.cry();
		}
		for(int i=0;i<animals.length;i++) {
			animals[i].cry();
		}
	}
}
