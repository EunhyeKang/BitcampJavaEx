package sec03.typecasting;

public class Ex01_ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;   // 00001010
		int  b = a;    
		
		byte x  = 65;
		int  y  = 100;
		int result = x + y;
		
		System.out.println("result1 = " + result);
		System.out.println("result2 = " + 0b00000000000000000000000010100101);
		
		double num1 = 30;
		/*   double = int 다른 자료형의 대입연산
		 *   double = double (30 -> 30.0)
		 */
		System.out.println("num1 = " + num1);
		System.out.println(59L + 34.5); // long형 정수 59L -> double형 59.0
		
	}

}
