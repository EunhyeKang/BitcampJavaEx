package sec02.primitive;

public class Ex10_FloatDouble {
	public static void main(String[] args) {
		
//		변수타입  = 리터럴 타입
		float  f1 = 3.14f; // 실수리터럴(double)
		double d1 = 3.14;
		System.out.printf("f1 = %.20f\n", f1);
		System.out.printf("d1 = %.20f\n", d1);
		

		float  f2 = 0.1234567890123456789f;
		double d2 = 0.1234567890123456789;
		
		System.out.printf("f2 = %.20f\n", f2);//정밀도(소수점 이하 유효 자릿수)
		System.out.printf("d2 = %.20f\n", d2);
		
		/* f2 = 0.123456		   float 유효자릿수 7 자리
		   d2 = 0.12345678901234   double    "      15자리
		 */
		
//		지수(E)표현식
        float  f3 =  0.012f;   // 1.2 * 10(-2)
		float  f4 = 1.2e-2f;
		System.out.printf("f3 = %.10f\n", f3);
		System.out.printf("f4 = %.10f\n", f4);
		
		double d3 = 30000;    // 3*10(4) 
		double d4 = 3e4;
		System.out.println("d3 = " + d3 + "%");
		System.out.println("d4 = " + d4 + "%");
		
		System.out.println(Float.MAX_VALUE);	
		System.out.println(Float.MIN_VALUE);    
		System.out.println(Double.MAX_VALUE);	
		System.out.println(Double.MIN_VALUE);   
		
		
		
		
	}
}
