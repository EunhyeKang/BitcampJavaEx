package sec01.variavle;

public class Ex02_Init {
	
	public static void main(String[] args) {
		int kor = 100;
		int math = 80;
		int eng; // 얜 아직 메모리에 등록 안됨. 값이 할당되어야 메모리에 들어감
		
		System.out.println(kor);
		System.out.println(math);
		
		eng = 90;
		System.out.println(eng);
		
		int total = kor + math + eng;
		System.out.println(total);
		
	}
}
