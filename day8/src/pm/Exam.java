package pm;

import java.util.Arrays;

class A{
	public void print() {
		int[] a = {1,3,4,5,6};
		int[] b = new int[2];
		for(int i=0;i<a.length-1;i++) {
			if((a[i]+a[i+1])%2==0) {
				b[0]=a[i];
				b[1]=a[i+1];

			}
			
		}
		System.out.println(Arrays.toString(b));
	}
}
public class Exam {
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}
