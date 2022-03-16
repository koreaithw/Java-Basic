package pm;

public class Exam7 {
	public static void main(String[] args) {
//		예외문법은 크게 3가지 요소로 구성된다.
//		try {
//			//일반예외, 실행 예외 발생 가능 코드
//		}catch(Exception e) {
//			//예외 발생시 처리
//		}finally{
//			//예외 발생 여부와는 무관하게 실행하는 코드.
//		}
//		
//		try {
//			System.out.println(3/0);  -->예외 발생 -->자바 (예외 클래스로 객체 생성)
//		}catch(Exception e) {                        ArithmeticException excep = new ArithmeticException();
//			System.out.println("숫자 0으로 안댐");  <-- 실행(객체를 던져줌)
//		}finally{
//			System.out.println("끝");
//		}
//		
//		1개의 catch()블록으로 2개의 예외를 동시에 처리하도록 통합해보자. 둘중 어떤 예외가 발생 하더라도
//		하나의 예외 처리로 해결 할 수 있다.
//		
//		try {
//			System.out.println(3/1);   
//			int num = Integer.parseInt("10A");
//		}catch(ArithmeticException | NumberFormatException e) {     
//			System.out.println("예외가 발생했습니다");
//		}finally{
//			System.out.println("끝");
//		}
//		finally는 항상 실행되는 블록이다. 그런데 또 다른 기능은 리소스를 해제하는 것이다.
//		리소스 해제는 더이상 사용하지 않는 자원은 반납하는 것을 의미한다.
//		예를 들면 파일을 열어서 사용을 한 뒤에 닫아야 다른 프로글매이 이 파일은 사용할 수 있다.
//		finally {}블록에서 리소스를 해제하는 역할로도 사용한다.
	}
}
