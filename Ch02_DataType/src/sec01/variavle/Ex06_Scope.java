package sec01.variavle;

public class Ex06_Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1 = 15;
		System.out.println("v1 = " + v1);
		
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
			System.out.println("v2 = " + v2);
		}
		
		// System.out.println("v2 = " + v2);
//		지역변수 괄호밖에서 사용못함 
	}

}
