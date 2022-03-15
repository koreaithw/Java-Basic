package javahw;

import java.util.Arrays;

class tar {	//새로운 클래스 생성
	public String print(int[] nums, int target) { //리스트를 리턴하기 위해 String을  반환하는  메서드 생성 매개변수는 list와 integer받음
		int[] res = new int[2];                   //반환한 두 값의 index값을 리스트 형태로 나타내기위해 생성
		for (int i = 0; i < nums.length - 1; i++) {//두개의 값을 비교하기 때문에 out of index error 발생하지 않게 nums.length-1까지
			if ((nums[i] + nums[i + 1]) == target) { // 두개의 값이 찾는 값과 동일할경우
				res[0] = i;                       // 새로운 리스트에 인덱스 값 저장
				res[1] = i + 1;                   // 새로운 리스트에 인덱스 값 저장
			}
		}
		return Arrays.toString(res);              //리스트 형태로 반환
	}
}

public class test {
	public static void main(String[] args) {
		
		tar t = new tar();                         // 객체생성후 인스턴스 변수에 할당
		
		int[] nums = { 2, 7, 11, 15 };             
		int target = 9;
		System.out.println(t.print(nums, target));

		int[] nums1 = { 3, 2, 4 };
		int target1 = 6;
		System.out.println(t.print(nums1, target1));

		int[] nums2 = { 3, 3 };
		int target2 = 6;
		System.out.println(t.print(nums2, target2));

	}
}
