package sec03.typecasting;
/**
 * [ 자료형 연산 연습 5]
 * 
 * 문자열, 숫자간의 타입변환
 */
public class Ex08_StringConversion {
	public static void main(String[] args) {
		
		/* 정수 입력데이터를 문자열로 받는 경우
		 * 산술 연산이 필요할 때
		 * String To Integer
		 */
		String data1 = "20";
		String data2 = "30";
		
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		//int num3 = Integer.MAX_VALUE;
		int result1 = num1 + num2;
		System.out.println("result1 = " + result1);
		//System.out.println(num3);
		
		/* 
		 * Integer To String
		 */
		int integer1 = 20;
		int integer2 = 30;
		
		String str1 = String.valueOf(integer1);
		String str2 = String.valueOf(integer2);
		String result2 = str1 + str2;
		System.out.println("result2 = " + result2);
		
		/* 실수 입력데이터를 문자열로 받는 경우
		 * 산술 연산이 필요할 때
		 * String To Double
		 */
		String s1 = "20.12";
		String s2 = "30.34";
		
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double r1 = d1 + d2;
		System.out.println("r1 = " + r1);
		
		/* Double To String
		 */
		double d3 = 20.22;
		double d4 = 30.33;
		
		String s3 = String.valueOf(d3);
		String s4 = String.valueOf(d4);
		String r2 = s3 + " / " + s4;	// 문자열 결합 연산
		System.out.println("r2 = " + r2);
		
	}
}
