package sec01.variavle;

public class Ex07_Constants {

	static final double PI = 3.141592;
//  static 붙으면 클래스변수 !!!

	public static void main(String[] args) {

		int size = 10;

		System.out.println("size = " + size);

		size = 100;
		System.out.println("size = " + size);

		final int MAX_SIZE = 100;
		System.out.println("MAX_SIZE = " + MAX_SIZE);
		

//		final double PI;
		// PI = 3.141592;위에 static final 선언했으니 재할당 불가

		// PI=300.14; final이란 키워드는 변수를 상수화시켜놓은것이기때문에
		/*
		 * 한번세팅해놓으면 다른대입 , 할당 못하게 막아놓음 그런데 위에 final을 지워버리면 일반변수가 되기때문에 대입이가능해짐
		 * 
		 */
		System.out.println("원주율 :" + Ex07_Constants.PI);
		
		System.out.println(Integer.MAX_VALUE);
	}

}
