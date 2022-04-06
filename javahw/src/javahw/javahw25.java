package javahw;

public class javahw25 {
	
	public static int versionChecking(String v1, String v2) {
		
		String[] ver1 = v1.split("\\."); //.을 기준으로 스플릿 해서 배열에 넣음
		String[] ver2 = v2.split("\\.");
		
		int v1l = ver1.length; 
		int v2l = ver2.length; 
		
		int  ml = (v1l <= v2l) ? v2l:v1l; // 두 배열의 길이 중 큰값을 정함
		int n,m;
		
		for (int i = 0; i < ml; i++) { //두배열중 최고의 길이까지 구함
			// 인덱스가 넘어가게 되면 0 으로 간주.
			// 001 과 1과 동일하기 위해서 integer 값으로 바꿈
			if(i<v1l) n = Integer.valueOf(ver1[i]); else n=0; 
			if(i<v2l) m = Integer.valueOf(ver2[i]);	else m=0;
			
			if(n<m) { //버전1<버전 2
				return -1;
			}else if(n>m) { //버전 1>버전2
				return 1;
			}
		}
		return 0; //나머지경우
	}
	
	public static void main(String[] args) {
		System.out.println(versionChecking("1.01", "1.001"));
		System.out.println(versionChecking("1.0", "1.0.0"));
		System.out.println(versionChecking("0.1", "1.1"));
		System.out.println(versionChecking("1.0.1", "1"));
		
	}
}


