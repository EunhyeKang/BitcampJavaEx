package sec01.variavle;

public class Ex08_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.s1);
		A.staticMethod();
		
		System.out.println();
		A a = new A();
		System.out.println(a.m1);
		a.instanceMethod();
	}

}


class A{
	
	static int s1;
	int m1;
	
	public A() {
		// 생성자초기화
		s1 = 0; m1 = 1;
	}
	
	static void staticMethod() {
		System.out.println("s1 = " + s1);
	}
	
	void instanceMethod() {
		int i=0;
		System.out.println("m1 = " + m1);
		System.out.println("i = " + i);
	}
}