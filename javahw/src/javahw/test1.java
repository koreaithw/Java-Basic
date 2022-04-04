package javahw;

import java.util.HashSet;

class set{
	HashSet<Integer> hs = new HashSet<Integer>();
	HashSet<Integer> hs1 = new HashSet<Integer>();
	
	
	public HashSet<Integer> hash() {
		for(int i=0;i<5;i++) {
			hs.add(i+1);
		}
		for(int i=0;i<5;i++) {
			hs1.add(i+3);
		}
		System.out.println(hs);
		System.out.println(hs1);
		hs.removeAll(hs1);
		
		return hs;
	}
}
class revers{
	public int rev(int a) {
		int index=0;
		if(a<0) index=1;
		String str = String.valueOf(a);
		String str1="";
		int b = str.length();
		for (int i = b-1; i >=index ; i--) {
			str1+=str.charAt(i);
		}
		int res = Integer.valueOf(str1);
		return res;
	}
	
}
public class test1 {
	
	public static void main(String[] args) {
		set s = new set();
		System.out.println(s.hash().toString());
		
		revers r = new revers();
		System.out.println(r.rev(-123));
		System.out.println(r.rev(123));
	}
}
