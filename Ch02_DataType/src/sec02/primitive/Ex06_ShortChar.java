package sec02.primitive;

public class Ex06_ShortChar {
	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 ='가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		System.out.println(c1);//비트열읽어서 65를 가지고 온다음~ c1,c2,c3다 동일
		System.out.println(c2);//근데 문자가 char타입으로 선언되어있으므르
		System.out.println(c3);//꺼내서 표현할때 디코딩 해주는것임
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
