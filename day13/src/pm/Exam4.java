package pm;

public class Exam4 {
//		쓰레드
//		규모가 작은 프로젝트라도 쓰레드를 사용하지 않ㅇ르때가 거의 없을 정도로 쓰임새가 매우 많으므로
//		꼭 이해하자,
//		
//		쓰레드란
//		프로그램을 작성하다 보면 어쩔 수 없이 동시에 수행해야 하는 일들이있다.
//		예를 들어 비디오 재생 프로그램을 만든다고 할때 화면 재생과 오디오 재생이 동시에 실행이 되어야한다.
//		이렇게 여러개의 작업이 동시에 수행 되기 위해서 한정된 cpu를 여러개의 작업으로 나누어 사용해야 하는데
//		이것이 바로 쓰레드 이다.
//		
//		프로그램 &프로세스 *쓰레드
//		 
//		프로그램은 하드에 저장된 파일들의 모음
//		프로세스는 메모리 상에 로딩된 프로그램
//		쓰레드는 동일한 프로그램을 메모리에 2번이상 로딩
//	
//		쓰레드
//		cpu를 사용하는 최소단위
//		프로세스만 cpu를 사용할 수 있는데, 자세히 보면 실제 cpu를 사용하는것은 프로세스 내부의 쓰레드 이다.
//		
//		자바에서의 쓰레드
//		프로그램이 메모리로 로딩되고 그 로딩된 프로세스 내부에는 쓰레드가 있는 것이다.
//		바로 작성한 프로그램을 실행하면 메모리로 로딩되어 프로세스 상태가 된다.	}
//		.class을 실행하면 자바 가상머신은 main 쓰레드를 생성한다.
//		즉 프로그램이 처음 실행되면 시작시첨에 main 쓰레드 하나만 존재한다. main()메서드에서 작성한 내용이 바로
//		main 쓰레드에서 동작한다. 그런데 만약 main쓰레드의 내부에서 2개의 쓰레드를 생성해서 실행하면 동시에
//		개의 쓰레드가 동작하게 되는데 이것을 멀티 쓰레드 프로세스 라고 한다.
//		
//		멀티쓰레드의 필요성
//		쓰레드는 cpu를 사용하는 최소단위라고 위에서 말했다.
//		그러면 멀티 쓰레드는 2개이상의 쓰레드가 동시에 cpu를 사용한다는 의미이다
//		멀티쓰레드가 필요한 이유는 무엇인가
//		비디오와 자막을 화면에 동시에 출력할 떄를 생각해보자
//		자막은 비디오 프레임이 맞춰 출력되어야한다.
//	
//		만약 만일 쓰레스로 2개의 작업을 처리하면 각각의 작업은 순차적으로 처리된다.
//		먼저 시작된 작업이 완전히 종료가 된 후에야 두번째 작업이 실행된다.
//		하지만 멀티 쓰레드는 동시성 또는 병렬성을 가지고 처리된다.
//		
//		쓰레드 생성방법
//		2가지 방법
//		1.쓰레드 클래스를 상속받아 run()메서드를 오버라이딩 하는 방법.
//		2. 1단계 -Runnable 인터페이스를 구현 Runnable 객체를 생성한다.
//		 . 2단계 -쓰레드 객체를 생성 할 때, 1단계에서 생성한 Runnable 객체를 생성자에 전달해 준다.
//		
//		사실 2가지 생성방법 모두 run() 메서드를 재 정의(override)하여 Thread 객체를 생성한다
//		
//		쓰레드 실행 방법
//		
//		객체를 어떤 방법으로 샐행하던 쓰레드 객체 내의 start()에서드를 호출한다.
//		여기서 재정의한 메서드는  run()인데 run()의 내용을 실행하기 위해서는 반드시 start()메서드를 호출해야
//		한다는 점을 명심하자. 주의할 점은 start()메서드로 한번 실행된 쓰레드 객체는 재사용 할 수 없다는 것이다,
//		만약 다시 실행하려면 객체를 다시 생성해야만 한다.
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	
	
	public static void main(String[] args) {
		
		int[] intArray= {1,2,3,4,5}; //비디오 프레임
		String[] strArray= {"하나","둘","삼","넷","오"};//자막
		
		for(int e:intArray) {
			System.out.println("비디오 프레임"+e);
		}
		for(String e:strArray) {
			System.out.println("자막번호"+ e);
		}
		
	}
}
