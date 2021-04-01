package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {
		int sum = 0;//0~10사이 랜덤값
		
		int val=(int)(Math.random()*11);
		System.out.println("val : " + val);
		while (val != 0) {
			sum = sum+  val;
			val=(int)(Math.random()*11);
			System.out.println("val : " + val);
		}
		System.out.println(sum);
		
	}
}
