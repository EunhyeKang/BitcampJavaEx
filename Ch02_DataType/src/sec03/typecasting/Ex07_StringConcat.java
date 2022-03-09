package sec03.typecasting;
/**
 * [ 자료형 연산 연습 4]
 * 
 * 문자열 형변환
 */
public class Ex07_StringConcat {
	public static void main(String[] args) {
		
		/* '+' 연산자
		 * 숫자 + 숫자 : 덧셈연산 수행
		 * 숫자 + 문자열, 문자열 + 숫자
		 * : 숫자가 문자열로 자동 형변환되어
		 *   결합연산 수행 
		 */
		String str = "";
		
		str =  1  +  2  + "3";		// 33
		str =  1  + "2" +  3;		// 123
		str = "1" +  2  +  3;		// 123
		str = "1" + (2  +  3);		// 15
		System.out.println(str);
	}
}
