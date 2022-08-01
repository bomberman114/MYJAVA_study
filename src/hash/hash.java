package hash;

import java.util.HashMap;
import java.util.Map;

public class hash {

	public static void main(String[] args) {
		//1번문제
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "첫 번째 타자");
		map1.put(2, "두 번째 타자");
		map1.put(3, "세 번째 타자");
		map1.put(4, "네 번째 타자");
		map1.put(5, "다섯 번째 타자");
		System.out.println("해시 첫번째 문제");
		for (int i = 1; i < map1.size() + 1; i++) {
			System.out.println(map1.get(i));
		}
		System.out.println(map1);
		//2문제
		Map<String, String> map2 = new HashMap<String, String>();

		map2.put("1", "첫 번째 타자");
		map2.put("2", "두 번째 타자");
		map2.put("3", "세 번째 타자");
		map2.put("4", "네 번째 타자");
		map2.put("5", "다섯 번째 타자");
		System.out.println("해시 두번째 문제");

		for (String s : map2.keySet()) {

			System.out.println(s + "=" + map2.get(s));
		}
		//3번문제
		Map<Object, String> map3 = new HashMap<Object, String>();
		map3.put(1, "첫 번째 타자");
		map3.put(2, "두 번째 타자");
		map3.put(3, "세 번째 타자");
		map3.put(4, "네 번째 타자");
		map3.put(5, "다섯 번째 타자");

		System.out.println("해시 세번째 문제");
		for (Object s : map3.keySet()) {

			System.out.println(s + "=" + map3.get(s));
		}
	}

}
