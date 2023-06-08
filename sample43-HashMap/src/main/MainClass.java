package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
//		List<String> list = new LinkedList<String>();
//		list.add(new String("giants"));
//		list.add(new String("tigers"));
//		list.add(new String("twins"));
//		
//		list.remove(1);
//		String team = new String("bears");
//		list.set(1, team);
//		
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		/*
		 HashMap : = 사전
		 			사과 : apple
		 			key: value -> 1pair
		 			Tree 구조   0~-n-1이 아니다
		 			key는 중복을 허용하지 않음
		 			
		 TressMap : HashMap + Sorting
		 */
		
//		HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String>hashMap = new HashMap<Integer, String>();
		
		//추가
		hashMap.put(111, "백십일"); //list에선 add
		hashMap.put(222, "이백이십이");
		hashMap.put(333, "삼백삼십삼");
		
		//값을 취득
		//value =key
		
		String value = hashMap.get(333);
		System.out.println(value);
		//삭제
//		value = hashMap.remove(222);
//		System.out.println(value);

		//검색
		
		boolean b= hashMap.containsKey(new Integer(333));
		System.out.println("b : "+ b);
		if(b==true) {
			String v = hashMap.get(333);
			System.out.println("v : " + v);
		}
		//수정
		hashMap.replace(222,  "200+ 22");
		//값을 모두 출력
		//순서대로 출력되는건 아님
		// Iterator : 반복자(주소) , key값 사용
		Iterator<Integer> it = hashMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println("key: "+ key);
			String val = hashMap.get(key);
			System.out.println(" value : "  + val);
		}
		
		Map<String,String>hMap = new HashMap<String, String>();
		//과일명 4개추가
		hMap.put("과일1", "사과");
		hMap.put("과일2", "배");
		hMap.put("과일3", "수박");
		hMap.put("과일4", "망고");
		String valueFt = hMap.get("과일1");
		System.out.println("valueFt : " +valueFt);
		//삭제
		hMap.remove("과일3");
		//검색

		boolean f= hashMap.containsKey(new String("과일2"));
		System.out.println("f : "+ f);
		if(f==true) {
			String vf = hMap.get("과일2");
			System.out.println("vf : " + vf);
		}
		//수정
//		hMap.replace("과일4",  "고무고무열매");
		hMap.put("과일4",  "고무고무열매");

		//모두찾기
		Iterator<String> fruitIt = hMap.keySet().iterator();
		while(fruitIt.hasNext()) {
			String key=fruitIt.next();
			System.out.println("key: "+ key);
			String val = hMap.get(key);
			System.out.println(" value : "  + val);
		}
		
		//HashMap 에서 TreeMap
		TreeMap<String, String> tMap = new TreeMap<String, String>(hMap);
		
		//Sorting 오름차순
//		Iterator<String> itt = tMap.keySet().iterator();
		
		Iterator<String> itt = tMap.descendingKeySet().iterator();

		while(itt.hasNext()) {
			String k = itt.next();
			String v = tMap.get(k);
			System.out.println("key : "+ k + " value : "+v);
		}
		
		//Map 활용
		//String, Integer, Object 다 담고 싶을 떄
		Map<String,Object> userMap = new HashMap<String,Object>();
		List<String> list = new ArrayList<String>();
		userMap.put("info", "Hello World");
		userMap.put("counting", 1024);
		userMap.put("list", list);
		
	}

}
