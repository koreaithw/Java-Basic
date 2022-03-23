package pm;

public class Exam6 {
//		********************************
//		제네릭을 사용하면 모든 타입의 상품을 저장할 수도 있으면서도 잘못된 캐스팅을 할때 문법오류를 발생시키는
//		문제를 사전에 예방 할 수 있다.
//		********************************
//		제네릭 클래스와 제네릭 인터페이스 정의
//		
//		(제네릭 클래스)
//		public class MyClass<T>{
//			private T t;
//			public T get() {
//				return T;
//			}
//			public void set(T t) {
//				this.t =t;
//			}
//		}
//		
//		(제네릭 인터페이스)
//		public interface MyInterface<K,V>{
//			public abstract void setKey(K k);
//			public abstract void setValue(V v);
//			public abstract K getKey();
//			public abstract V getValue();
//	
//		제네릭 클래스인 MyClass<T> 는 제네릭 타입 변수 1개를 가지고 있다.
//		이 제네릭 타입은 필드 타입 getter메서드의 리턴타입, setter 메서드의 입력타입에 사용됐다.
//		
//		제네릭 인터페이스인 MyInterface<K,V> 는 2개의 제네릭 타입변수를 가지고있고, 각각 setter와 getter
//		메서드의 입력과 리턴타입으로 사용됐다.
//		
//		제네릭 클래스라고 해도 역시 클래스의 객체 생성등의 기능을 모두 가지고 있다.
//		다만 클래스명 다음에 제네릭 타입을 명시한다는 점에서 차이가 있다.
//		즉 객체를 생성할때 제네릭 타입변수에 실제 타입을 대입하게 되는것이다.
		
//		MyClass<String> mc2 = new MyClass<String>();
		//String 타입을 저장하거나 꺼내올 수 있는 객체로 지정
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<Integer>();
		mc2.set(100);
		System.out.println(mc2.get());
		
//		MyClass<Integer> mc3 = new MyClass<Integer>();
//		mc3.set("안녕");  //------>에러발생
//		System.out.println(mc2.get());
//		
//		단순하게 하나의 클래스로 다양한 타입의 객체를 저장하고 관리 할수 있도록 하는것은 Object타입의 필드를
//		사용하는 것 만드로도 가능하다. 하지만 모든 객체는 Object 타입이기 때문에 실수로 엉뚱한 객체를
//		저장하더라도 오류를 발생하지는 않는다.(실행오류, ClassCaseException)이 발생하기 때문
//		getter메서드로 꺼내온 값도 Object 타입이므로 항상 다운캐스팅을 수행 해야만 했다.
//		하지만 제네릭 클래스를 사용한 mc1, mc2 생성 예를 보면 입 출력이 각각 객체를 생성할때 정해진 타입으로
//		확정되기 때문에 setter 메서드를 사용할 때 입력타입을 정확히 확인 할 수도 있고 출력도 해당 타입으로
//		리턴이 되기 때문에 다운 캐스팅 자체가 필요없어진다.
		
	}
}

//제네릭 클래스
class MyClass<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t =t;
	}
}


//public interface MyInterface<K,V>{
//	public abstract void setKey(K k);
//	public abstract void setValue(V v);
//	public abstract K getKey();
//}
