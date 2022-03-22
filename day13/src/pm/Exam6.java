package pm;

public class Exam6{

	public static void main(String[] args) {
		Thread vfileThread = new videoThread();
		vfileThread.start();	
		
		Thread afileThread = new audioThread();
		afileThread.start();
		
	}
}

class videoThread extends Thread {
	@Override
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

class audioThread extends Thread{
	@Override
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