package sec02.primitive;

public class Test {
	public static void main(String[] args) {

		// 정수형
		byte b = 0; // 1 byte
		char c = 0; // 2
		short sh = 0; // 2
		int i = 0; // 4
		long l = 0; // 8

		// 실수형
		float f = 0.0f;// 4
		double d = 0.0; // 8

		// 논리형
		boolean bool = true; // 1 byte
		
		// 참조형
		int[] arr = new int[10];
		System.out.println(arr.length);
		String str = "korea";
		System.out.println(str.toString());
//		System.out.println(str);
		System.out.println(arr);
		
	}
}
