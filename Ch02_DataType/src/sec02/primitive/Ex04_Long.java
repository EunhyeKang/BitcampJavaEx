package sec02.primitive;

import java.text.DecimalFormat;

public class Ex04_Long {
	public static void main(String[] args) {
		
		System.out.println("Long 최대값 :  " + Long.MAX_VALUE);
		System.out.println("Long 최소값 : "  + Long.MIN_VALUE);
		
//	    변수타입  =    리터럴 타입
		long var1 = 10; 		// int
		long var2 = 20L;		// long
//		long var3 = 10000000000;//int형 21억...
		long var4 = 10000000000L;
		
		System.out.println("var4 = " + var4);
		
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("var4 = " + df.format(var4));
		
		short s = 32767;
		/*
		float f1 = 3.14f;
		//  float f1 = 3.14;   double
		double d1 = 3.140;
		
		short s = 4;
		
		
		*/
		
	}
}
