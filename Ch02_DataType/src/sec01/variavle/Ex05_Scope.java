package sec01.variavle;

/**
 * [ 변수의 사용 범위 ]
 * 중괄호{ } 블록 내에서 선언된 변수는 해당 중괄호{ } 블록 내에서만 유효한다.
 */

public class Ex05_Scope {
	@SuppressWarnings("unused")//경고뜨는거 사용안
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 1;
		
		if(true) {
			int var2 = 2;		
		}
		
		for (int i=0; i<3; i++) {
			int var3=3;
		}
		
		System.out.println("var="+var1);
	
//		System.out.println("var2="+var2);
//		System.out.println("var3="+var3);
		//var2,var3 -> loal변수 지역변수.
//*******매우중요  local변수! 지역변수! 자기 구역에서밖에 사용못함/.

	}

}
