package sec03.typecasting;
/**
 * 강제(명시적)형변환
 * 타입 캐스팅(Type Casting)
 */
public class Ex02_ExplicitConversion {
	public static void main(String[] args) {
	
		double pi = 3.141592653589793238462643;
		/* demotion(double -> int) 발생 시 값 손실 발생
		 * 컴파일 에러
		 * Type mismatch: cannot convert from double to int
		 */
		int num = (int) pi;  // 강제 형변환
		System.out.println("num = " + num);
		
		
		short s = 1000;//리터럴상수값이라..? short의 범위를 벗어나지 않으므로 에러처리.
		short ss = 30000;
		byte by = 5;
		//float f = 5.0;
		
	//	short sss = s+ss;
		short sss = (short)(s+ss);
		int sssint = s+ss;
		System.out.println("여기 s+ss = " + sss);
		System.out.println("여기 s+ss = " + sssint);
		
		
		
		
		/* 값 손실의 예시
		 */
		int i = 127;
		i = 1000000;	 
		byte b = (byte) i;
		System.out.println("b = " + b);
		/*     b    =                i
		 * 00000000 = 00000000000011110100001001000000 (int)
		 * 00000000 = xxxxxxxxxxxxxxxxxxxxxxxx01000000 (byte)
		 */
		System.out.println("01000000 = " + 0b01000000);
		
		/* 변수는 입력값이 언제, 어떻게 바뀔지 모르니
		 * 입력값의 허용 범위에 일치하는 자료형으로 선언해야한다!!!
		 */
		
		short s1 = 1;
		short s2 = 2;
//      에러발생 : Type mismatch: cannot convert from int to short
//		원인 : '+' 연산을 위해 s1, s2의 값을 int형으로 변환하여 임시 저장
//		       덧셈 결과 값(int)을 (short)에 대입(int-->short)
//		short s3 = s1 + s2; // (x) 
//		int   s3 = s1 + s2; // (O)
		short s3 = (short) (s1 + s2); // 명시적 형변환
		
		System.out.println("s3 = " + s3);
	}
}
