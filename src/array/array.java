package array;

import java.util.ArrayList;
import java.util.List;

public class array {

	public static void main(String[] args) {
		// 1번문제
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		System.out.println("어레이 1번 문제 입니다.");
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		System.out.println(arr1);
		List<Integer> arr2 = new ArrayList<Integer>();
		// 2번문제
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		System.out.println("어레이 2번 문제입니다.");
		for (

				int i = 0; i <= arr2.size(); i++) {
			if (0 == arr2.get(i) % 2) {
				System.out.println(arr2.get(i));
			}

		}
		// 3문제
		List<Integer> arr3 = new ArrayList<Integer>();

		arr3.add(1);
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		arr3.add(5);
		System.out.println("어레이3번문제입니다.");
		for (

				int i = 0; i <= arr3.size(); i++) {
			if (0 == arr3.get(i) % 2) {
				System.out.println(arr3.get(i) * 2);
			}

		}
		// 4번문제
		List<String> arr4 = new ArrayList<String>();

		arr4.add("1");
		arr4.add("2");
		arr4.add("3");
		arr4.add("4");
		arr4.add("5");
		System.out.println("어레이4번문제입니다.");
		for (int i = 0; i <= arr4.size(); i++) {
			if (Integer.valueOf(arr4.get(i)) % 2 == 1) {
				System.out.print(arr4.get(i) + "-");
				System.out.println(Integer.valueOf(arr4.get(i)) + 2);
			} else {
				System.out.println("짝수입니다.");
			}

		}
//		5번문제
		List<String> arr5 = new ArrayList<String>();
		arr5.add("사과");
		arr5.add("수박");
		arr5.add("바나나");
		arr5.add("참외");
		arr5.add("딸기");
		System.out.println("어레이 5번 문제 입니다.");
		for (int i = 0; i <= arr5.size(); i++) {
			if (arr5.get(i) == "사과") {
				System.out.println(arr5.get(i) + "는 맛있어요");
			} else if (arr5.get(i) == "수박") {
				System.out.println("아보카도");
			} else if (arr5.get(i) == "딸기") {
				System.out.println(arr5.get(i) + "는 맛있어요");
			} else
				System.out.println(arr5.get(i));

		}
		//6번문제
		List<Integer> arr6 = new ArrayList<Integer>();
		arr6.add(12);
		arr6.add(23);
		arr6.add(3);
		arr6.add(40);
		arr6.add(15);
		arr6.add(26);
		arr6.add(27);
		arr6.add(8);
		arr6.add(93);
		arr6.add(10);
		System.out.println("어레이 6번문제 입니다.");
		int i = 0;
		while (i <= arr6.size()) {
			int a = arr6.get(i);
			i++;
			int s = arr6.get(i);
			System.out.println(String.format("%d 는 %d 보다%d만큼 작다", a, s, a - s));

		}
	}

}
