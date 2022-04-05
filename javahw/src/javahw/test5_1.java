package javahw;

public class test5_1 {
	public static void main(String[] args) {
		reverse r = new reverse();
		System.out.println(r.rev(-123));
		System.out.println(r.rev(123));
		System.out.println(r.rev(121));
	}
}

class reverse{
	public boolean rev(int a) {
		int index=0;
		if(a<0) index=1;      //들어온 값이 음수일때 -가 붙으므로 그 인덱스를 1부터 시작
		String str = String.valueOf(a);//값을 스트링으로 바꿈
		String str1="";
		int b = str.length(); // 스트링으로 바꾼 값의 길이체크
		for (int i = b-1; i >=index ; i--) { //부호 빼고 거꾸로 바꿈
			str1+=str.charAt(i); //하나씩 거꾸로 더함
		}
		int res = Integer.valueOf(str1);  //숫자로 바꿈
		
		if(res==a){  //거꾸로된 숫자와 들어온 숫자가 같으면 true 반환
			return true;
		}            //다르면 false 반환
		return false;
	}
}