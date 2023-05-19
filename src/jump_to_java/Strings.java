package jump_to_java;

import java.util.ArrayList;

public class Strings {
	//equals는 두개의 문자열이 동일한지를 비교하여 결과값을 리턴
	private void ExampleEquals() {
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a == b); //두개의 자료형이 동일한 객체인지를 판별할 때 사용
	}
	
	private void ExampleIndexOf() {
		//indexOf는 문자열에서 특정 문자열이 시작되는 위치(인덱스)를 리턴
		String a = "Hello Java";
		System.out.println(a.indexOf("java"));
	}
	private void ExampleContains() {
		//contains는 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴
		String a = "Hello Java";
		System.out.println(a.contains("Java"));
	}
	private void ExampleCharAt() {
		//charAt은 문자열에서 특정 위치의 문자(char)를 리턴
		String a = "Hello Java";
		System.out.println(a.charAt(6));
	}
	private void ExampleReplaceAll() {
		//replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 이용
		String a = "Hello Java";
		System.out.println(a.replaceAll("Java", "World"));
		
	}
	private void ExampleSubString() {
		//substring은 문자열 중 특정 부분을 뽑아낼 경우에 이용
		String a = "Hello Java";
		System.out.println(a.substring(0,4));
	}
	private void ExampleToUpperCase() {
		//toUpperCase는 문자열을 모두 대분자로 변경할 때 사용
		//소문자는 to LowerCase를 사용
		String a = "Hello Java";
		System.out.println(a.toUpperCase());
	}
	private void ExampleSplit() {
		//split 매서드는 문자열을 특정 구분자로 나누어 문자열 배열로 리턴하는 메서드이다.
		String a = "a:b:c:d";
		String[] result = a.split(":");
	}
	private void ExampleStringFormating() {
		/*
		 *  %s -> 문자열(String)
		 *  %c -> 문자 1개(char)
		 *  %d -> 정수(int)
		 *  %f -> 부동소수(float,double)
		 *  %o -> 8진수
		 *  %x -> 16진수
		 *  %% -> 문자 % 자체
		 * */
		
		//숫자 바로 대입
		System.out.println(String.format("I eat %d apples", 3));
		
		//문자열 바로 대입
		System.out.println(String.format("I eat %s apples.", "five"));
		
		//숫자 값을 나타내는 변수로 대입
		int number = 3;
		System.out.println(String.format("I eat %d apples.", number));
		
		//2개 이상의 값 넣기
		number = 10;
		String day = "three";
		System.out.println(String.format("I ate %d apples. So I was sick for %s days", number,day));
	
		
		//포맷 코드와 숫자 함게 사용하기
		
		//포맷 코드 앞에 숫자를 이용하면 전체 길이가 10인 문자열 공간에 대입된 값을 으른쪽 정렬 후 나머지 공간은 공백
		System.out.println(String.format("%10s", "hi"));
		
		//숫자를 음수로 이용하면 왼쪽 정렬
		System.out.println(String.format("%-10s","hi"));
		
		//소수점 포현
		//'.' 의 의미는 소수점 포인트를 말하고 그 뒤의 숫자는 소수점 뒤에 나올 숫자의 개수
		System.out.println(String.format("%.4f", 3.421234123));
		
		//만약 소수점 네 번째 자리까지만 표시하고 전체 길이가 10개인 문자열 공간에서 오른쪽 정렬한 출력은 아래와 같음
		System.out.println(String.format("%10.4f", 3.1234213));
		
		//System.out.printf
		
		//println이 아닌 printf를 사용하면 String.format() 없이 포매팅된 문자 출력 가능
		
		System.out.printf("I eat %d apples.",3);
		
	}
	

	public static void main(String[] args) {
		
	}
	
	
}
