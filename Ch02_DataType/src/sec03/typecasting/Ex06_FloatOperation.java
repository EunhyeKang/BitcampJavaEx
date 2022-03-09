package sec03.typecasting;

public class Ex06_FloatOperation {
	public static void main(String[] args) {
		
		double fd = 1.2f + 3.4; // 1.2f -> double
		System.out.println("ds = " + fd);
		
		float  ff = 1.2f + 3.4f;
		System.out.println("ff = " + ff);
		
		int i    = 10;
		double d = 5.5;
//		int    total = i + d;
		double total = i + d; // 10.0 + 5.5
		System.out.println("total = " + total);
		
		System.out.println(1/2);		// 0
//		System.out.println(1.0/2);
//		System.out.println(1/2.0);
//		System.out.println(1.0/2.0);
		

		int x = 1;
		int y = 2;
//		int result = x / y;
		double result = x / y;//	
		
		System.out.println("result =  " + result);
		
		
		double result2 = x / (double)y;
		System.out.println("result2 = " + result2);
	}
}
