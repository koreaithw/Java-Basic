package javahw;

import java.util.Random;
import java.util.Scanner;

public class javahw9 {
	//7-9
	public static int readPlusInt(int n) {
		String rev = String.valueOf(n);
		int res=0;
		int index=0;
		if(n>=0) {
			for(int i=rev.length()-1;i>=index;i--) {
				res = 10*res + (rev.charAt(i)-48);
			}			
		}else {
			index=1;
			for(int i=rev.length()-1;i>=index;i--) {
				res = 10*res + (rev.charAt(i)-48);
			}
		}
		return res;
	}
	
	//7-10
	public static int rand0(int x,int y,int z) {
		return x+y+z;
	}
	public static int rand1(int x,int y,int z) {
		return x+y-z;
	}
	public static int rand2(int x,int y,int z) {
		return x-y+z;
	}
	public static int rand3(int x,int y,int z) {
		return x-y-z;
	}
	
	//7-15
	public static int sumOf(int[] x) {
		int sum=0;
		for(int e:x) {
			sum+=e;
		}
		return sum;
	}
	
	//7-16
	public static int minOfh(int[] height) {
		int min = height[0];
		for (int e:height) {
			if(e<min) {
				min=e;
			}
		}
		return min;
	}
	public static int minOfw(int[] weight) {
		int min = weight[0];
		for (int e:weight) {
			if(e<min) {
				min=e;
			}
		}
		return min;
	}
	
	//7-17
	public static int linearSearch(int[] a,int key) {
		int location=0;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				location=i;
				break;
			}
		}
		return location;
	}
	public static int linearSearchR(int[] a,int key) {
		int location=0;
		for(int i=a.length-1;i>=0;i--) {
			if(key==a[i]) {
				location=i;
				break;
			}
		}
		return location;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		//7-9
		int n;
		int yes=1;
		do {
			System.out.print("양의 정숫값:");
			n = sc.nextInt();
			if(n>0) {
				System.out.println("반대로 읽으면"+readPlusInt(n)+"입니다");
				System.out.print("다시 한 번?<yes...1/no...0>");
				yes = sc.nextInt();
				if(yes==0) {
					break;
				}else if(yes==1) {
					yes=1;
				}
			}
		}while(yes==1);
		
		//7-10
		int no=1;
		System.out.println("암산훈련!!");
		do {
			int r = rd.nextInt(4);
			int x = rd.nextInt(899)+100;
			int y = rd.nextInt(899)+100;
			int z = rd.nextInt(899)+100;
			int res=0;
			int answer=0;
			if(r==0) {
				res = rand0(x,y,z);
				do{
					System.out.print(x+"+"+y+"+"+z+"=");
					answer = sc.nextInt();
					if(answer!=res) {
						System.out.println("틀렸습니다!");
					}else {
						System.out.print("다시 한 번?<yes...1/no...0>:");
						no=sc.nextInt();
						if(no==0) {
							no=0;
							break;
						}
					}
				}while(answer!=res);
			}else if(r==1) {
				res = rand1(x,y,z);
				do{
					System.out.print(x+"+"+y+"-"+z+"=");
					answer = sc.nextInt();
					if(answer!=res) {
						System.out.println("틀렸습니다!");
					}else {
						System.out.print("다시 한 번?<yes...1/no...0>:");
						no=sc.nextInt();
						if(no==0) {
							no=0;
							break;
						}
					}
				}while(answer!=res);
			}else if(r==2) {
				res = rand2(x,y,z);
				do{
					System.out.print(x+"-"+y+"+"+z+"=");
					answer = sc.nextInt();
					if(answer!=res) {
						System.out.println("틀렸습니다!");
					}else {
						System.out.print("다시 한 번?<yes...1/no...0>:");
						no=sc.nextInt();
						if(no==0) {
							no=0;
							break;
						}
					}
				}while(answer!=res);
			}else {
				res = rand3(x,y,z);
				do{
					System.out.print(x+"-"+y+"-"+z+"=");
					answer = sc.nextInt();
					if(answer!=res) {
						System.out.println("틀렸습니다!");
					}else {
						System.out.print("다시 한 번?<yes...1/no...0>:");
						no=sc.nextInt();
						if(no==0) {
							no=0;
							break;
						}
					}
				}while(answer!=res);
			}			
		}while(no==1);
		 
		
		//7-15
		System.out.print("요소 수:");
		int e=sc.nextInt();
		int[] x = new int[e];
		for(int i=0;i<e;i++) {
			System.out.print("x["+i+"]:");
			x[i]=sc.nextInt();
		}
		System.out.println("모든 요소의 합은 "+sumOf(x)+"입니다");
		
		//7-16
		System.out.print("사람 수는:");
		int p= sc.nextInt();
		int[] height = new int[p];
		int[] weight = new int[p];
		System.out.println(p+"명의 신장과 체중을 입력하자.");
		for(int i=0;i<p;i++) {
			System.out.print((1+i)+"번의 신장:");
			height[i] = sc.nextInt();
			System.out.print((1+i)+"번의 체중:");
			weight[i] = sc.nextInt();
		}
		System.out.println("가장 키가 작은 사람의 신장:"+minOfh(height)+"cm");
		System.out.println("가장 마른 사람의 체중:"+minOfw(weight)+"kg");
		
		//7-17
		System.out.print("요소 수:");
		int len = sc.nextInt();
		int[] a = new int[len];
		int count=0;
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.print("찾는 값:");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("해당 값의 요소가 여러개 존재 합니다.");
		}
		System.out.println("가장 앞에 위치한 값은 a["+linearSearch(a,key)+"]에있습니다.");
		System.out.println("가장 뒤에 위치한 값은 a["+linearSearchR(a,key)+"]에있습니다.");
			
		
	}
}
