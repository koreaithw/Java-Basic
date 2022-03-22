package pm;

public class Exam5 extends Thread{
//		 쓰레드 클래스를 상속받아서 run()메소드를 오버라이딩

//		step 1 클래스를 정의
//		step 2 객체를 생성
//		step 3 쓰레드 실행
	@Override
	public void run() {
		
		String[] strArray= {"하나","둘","삼","넷","오"};//자막
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			
		}
		for(String e:strArray) {
			System.out.println(" - 자막번호"+ e);
			try {
				Thread.sleep(200);
			}catch(InterruptedException e1) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		//객체 생성 및 시작
		Thread smiFileThread = new Exam5();
		smiFileThread.start(); // start()를 통해서 run()메서드를 실행시킴 시킬때 Thread.sleep()를 줘서 메인보다 조금 늦게 실행되도록 설정
		
		int[] intArray= {1,2,3,4,5}; //비디오 프레임
		
		for(int e:intArray) {
			System.out.print("비디오 프레임"+e);
			try {
				Thread.sleep(200);
			}catch(InterruptedException e2) {
				
			}
		}
		
//		이전에 단일 쓰레드로 실행했던 비디오 프레임과 자막을 출력하는 프로그램을 멀티 쓰레드로 변경하였다.
//		출력하고자 하는 작업은 비디오 프레임을 번호와 자막의 동시출력이다.
//		프로그램이 처음 실행될 때 이미 main쓰레드가 실행되고 있으므로 이 2개의 작업을 동시에 실행하기 위해서는 
//		적어도 하나 이상의 쓰레드를 추가로 생성하여 실행해야 한다.
//		
//		 Thread클래스를 상속받아서 클래스를 정의했고,
//		 객체를 생성하여 start()에서드로 실행하였다.
//		
//		main 쓰레드와 smiFileThread를 사용하여 각각 비디오 번호와 자막번호를 출력했다.
//		참고로 멀티 쓰레드는 독립적으로 실행되기 때문에 먼저 start()메서드로 호출이 되었다 하더라도.
//		나중에 실행된 쓰레드 보다 늦게 실행 될 수있다.
//		이런 이유로 자막 번호가 항상 비디오 번호 뒤에 나오도록 쓰레드에 Thread.sleep(10)을 추가해서 
//		0.01초 늦게 출력되도록 했다.
	}
}

