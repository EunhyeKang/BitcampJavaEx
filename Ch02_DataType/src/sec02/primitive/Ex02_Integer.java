package sec02.primitive;

public class Ex02_Integer {

	public static void main(String[] args) {

		System.out.println("n진수 -> 십진정수(decimal)");
		int var1 = 0b1011; // 2 진수
		int var2 = 0206; // 8
		int var3 = 365; // 10
		int var4 = 0xB3; // 16

		System.out.println("0b1011 = " + var1);
		System.out.println("0206   = " + var2);
		System.out.println("365    = " + var3);
		System.out.println("0xB3   = " + var4);

		System.out.println();
		System.out.println("십진정수(decimal) -> n진수");
		String str1 = Integer.toBinaryString(11);
		String str2 = Integer.toOctalString(134);
		String str3 = Integer.toString(365);
		String str4 = Integer.toHexString(179);

		System.out.println("11    = " + str1);
		System.out.println("134   = " + str2);
		System.out.println("365   = " + str3);
		System.out.println("179   = " + str4);

		System.out.println("int 최대값: " + Integer.MAX_VALUE);
		System.out.println("int 최소값: " + Integer.MIN_VALUE);

	}

}
