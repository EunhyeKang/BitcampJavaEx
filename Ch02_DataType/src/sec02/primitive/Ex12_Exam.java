package sec02.primitive;

public class Ex12_Exam {
	public static void main(String[] args) {
		/* [성적관리프로그램]
		 * 
		 * 과목 :  국어, 영어, 수학 
		 * 점수 :  100,   90,   80
		 * 총점 :  100  + 90  + 80
		 * 평균 :  총점 / 3
		 */
		
		// 국어
		int kor  = 95;
		
		// 영어
		int eng  = 90;
		
		// 수학
		int math = 75;
		
		// 총점
		int total = kor + eng + math;	// 260
		
		// 평균
		double avg = total / 3;         // 260 / 3 = 86.66
		
		System.out.printf("평균은 %.2f 입니다.\n", avg);
	}
}
