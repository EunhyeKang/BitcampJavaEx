package sec03.typecasting;
/**
 * [ 강제(명시적)형변환 ]
 * 타입 캐스팅(Type Casting)
 */

public class Ex03_TypeCasting {
	public static void main(String[] args) {
		
//		숫자<---->문자 형변환 
		System.out.println(65);
		System.out.println((char)65);	// 'A'
		System.out.println((int)'A');	// 65
		
		System.out.printf("Integer출력: %d\n", 65);
		System.out.printf("Char   출력: %c\n", 65);

//      문자열 형변환
		String str = "123";
		System.out.println(str + 4);   			 // 1234
		/*  str   +   4          문자열 > int
		 * "123"  +  "4"         자동 형변환
		 * "1234"
		 */
		System.out.println("1" + 2 +  3  + "4"); // 1234
		System.out.println( 1  + 2 + "3" +  4 ); // 334
		
//		문자열을 숫자로 계산하고 싶을 때
		System.out.println(Integer.parseInt(str) + 4); // 127
	}

}
