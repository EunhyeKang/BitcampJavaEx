package sec01.variavle;

public class Ex03_Use {

	public static void main(String[] args) {
		int hour=3;
		int minute =5;
		
		System.out.println(hour + "시간" + minute + "분");
		
		String str = hour + "시간" + minute + "분";
		System.out.println(str);
		System.out.printf("%s",str);//출력 형식지정 가능
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총"+ totalMinute +"분");
	}

}
