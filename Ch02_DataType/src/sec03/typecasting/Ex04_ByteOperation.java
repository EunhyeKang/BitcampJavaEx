package sec03.typecasting;


public class Ex04_ByteOperation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int i = 100, j = 27;
		
//		피연산자가 변수가 아니므로 int 타입으로 형변환을 하지 않는다.
		byte sum1 = 100 + 27;
		System.out.println("sum1 = " + sum1);
		
		byte sum2 =  (byte) (i + j+1);
		System.out.println("sum2 = " + sum2);
		
		byte b1 = 10,  b2 = 20;
		int  b3 = b1 + b2;
		
//		타입변환이 줄면 성능이 향상된다.
		int  i1 = 10, i2 = 20;
		int  i3 = i1 + i2;
	}

}
