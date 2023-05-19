package jump_to_java;

import java.util.ArrayList;

public class DataStructure {
	
	private void ExampleArray() {
		int[] odd = {1,3,5,7,9};
		String[] weeks = {"월","화","수","목","금","토","일"};
		
		String[] week = new String[7];
		week[0] = "월";
		week[1] = "화";
		
		//String[] week = new String[]; -> Corrupted Error
		
		// 반복문으로 출력할 떄
		
		for(int i = 0; i < week.length;i++) {
			System.out.println(week[i]);
		}
		
		
	}
	private void ExampleList() {
		//리스트 자료형에서는 ArrayList, Vector, LinkedList 등의 자료형이 존재
		
		//ArrayList (import java.util.ArrayList)
		
		//add 메서드를 이용하여 데이터를 저장할 수 있다.
		
		/*
		 * ArrayList<String> pitches = new ArrayList<>();
		 * 
		 * 위처럼 제네릭스를 사용하지 않으면 warning 발생
		 * */
		
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		//get 메서드를 이용하여 특정 인덱스이 값 추출 가능
		System.out.println(pitches.get(1));
		
		//size 메서드를 이용하여 ArrayList의 개수 확인 가능
		System.out.println(pitches.size());
		
		//contains 메서드는 리스트 안에 해당 항목이 있는지 판별하여 그 결과를 boolean으로 리턴
		System.out.println(pitches.contains("142"));
		
		/*
		 * remove 메서드는 2가지 방식이 있다.
		 * remove(객체),remove(인덱스)
		 * remove(객체) 삭제 결과는 boolean으로 리턴
		 * remove(인덱스) 삭제 결과는 해당 항목으로 리턴
		 * */
		 

	}
	
	
	public static void main(String[] args) {
		
	}
}
