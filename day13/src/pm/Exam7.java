package pm;

public class Exam7{
	
	public static void main(String[] args) {
//		쓰레드 2번째 사용방법
//		Runnable 인터페이스를 수현한 클래스를 정의한다.
//		run()을 실제 구현하면서 여기에 쓰레드의 작업 내용을 작성한다.
//		앞에서 정의한 클래스를 이용해서 Runnable객체를 생성한다,
//		문제는 Runnable 객체의 내부에는 start()메서드가 존재 하지 않기 때문에 start()를 가진 Thread객체를 생성해야한다.
		Runnable audio = new aThread();
		Thread thread1 = new Thread(audio);
		thread1.start();  // Thread 객체에 audio객체를 넣어서 run()메서드를 호출함
		
		Runnable video = new vThread();
		Thread thread2 = new Thread(video);
		thread2.start(); // Thread 객체에 video객체를 넣어서 run()메서드를 호출함
	}
}
class vThread implements Runnable{
	@Override  //Runnable 에있는 run() 메서드를 무조껀 구현해야한다. interface 이기 때문
	public void run() { //비디오 쓰레드

		int[] intArray = { 1, 2, 3, 4, 5 }; // 비디오 프레임
		for (int e : intArray) {
			System.out.print("비디오 프레임" + e);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e2) {}
		}
	}
}

class aThread implements Runnable{
	@Override  //Runnable 에있는 run() 메서드를 무조껀 구현해야한다.  interface이기 때문
	public void run() { // 자막 쓰레드

		String[] strArray = { "하나", "둘", "삼", "넷", "오" };// 자막
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		for (String e : strArray) {
			System.out.println(" - 자막번호" + e);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
			}
		}
	}
}
