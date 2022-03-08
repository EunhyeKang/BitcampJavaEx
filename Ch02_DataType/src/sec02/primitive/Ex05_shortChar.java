package sec02.primitive;

public class Ex05_shortChar {

		public static void main(String[] args) {
			
			System.out.println("short최대값:" + Short.MAX_VALUE);//3만...
			System.out.println("short최소값:" + Short.MIN_VALUE);//-3만..
			System.out.println();
			System.out.println("char최대값:" + (int)Character.MAX_VALUE);//6.5만..
			System.out.println("char최소값:" + (int)Character.MIN_VALUE);//0
			
			
			short sh = 65;
			char ch = 'A';
			System.out.println("sh = " + sh);
			System.out.println("sh = " + (char)sh);
			System.out.println("ch = " + ch);
			System.out.println("ch = " + (short)ch);
			
		}
}
