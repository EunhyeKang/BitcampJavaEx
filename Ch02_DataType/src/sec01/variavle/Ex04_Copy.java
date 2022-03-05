package sec01.variavle;

public class Ex04_Copy {

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		System.out.println("a=" + a + ",b="+b);
		
		int x=3;
		int y=5;
		System.out.println("x="+x+",y="+y);
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x=" + x + ",y="+y);
		

	}

}
