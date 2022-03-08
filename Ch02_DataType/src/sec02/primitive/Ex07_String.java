package sec02.primitive;

public class Ex07_String {
	public static void main(String[] args) {
		String name = "bitcamp";   // 문자열리터럴
		String job  = "programmer";
		//name(주소를 저장하는 공간) = 주소값;
		System.out.println(name);
		job = name;//객체가대입되는게 아니라 객체가가르치는 번지수. 주소가 저장되는것임
		System.out.println(job);
		
		
//		참조타입과 기본타입의 구분 : 변수.메소드/필드  
		int len = name.length();
		System.out.println("name 길이 : " + len);
		System.out.println("name : " + name.toUpperCase());
		System.out.println(job.substring(0, 7));
		
//		문자열 덧셈 연산
		String str1 = "I am ";
		String message = str1 + "a" + " " + job;
		System.out.println(message);
		
	}
}
