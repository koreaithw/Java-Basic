package pm;
//different way
class OException extends Exception{
	
}
class MException extends Exception{
	
}
public class quiz2 {
	public static void main(String[] args) {
		AA aa = new AA();
			aa.score(101);
			aa.score(-1);
			aa.score(85);
	}
}
// main에서 던져줘서 try-catch문을 사용하면 오류 발생하면 나머지 메소드는 실행불가
// 다른 클래스에서 직접 예외처리를 하면 에러가 나도 남은 메서드 실행 가능
class AA{
	public void score(int num){
			try {
				if(num>100) {
					throw new OException(); //객체를 만들면서 예외 발생
				}else if(num<0) {
					throw new MException(); //객체를 만들면서 예외 발생
				}else {
					System.out.println("정상값 입니다.");
				}		
			}catch(OException oe) {         
				System.out.println("over 예외");
			}catch(MException me) {
				System.out.println("under 예외");
			}
	}
	
}