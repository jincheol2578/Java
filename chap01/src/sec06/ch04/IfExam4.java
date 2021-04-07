package sec06.ch04;

public class IfExam4 {

	public static void main(String[] args) {
		//삼항식
		
		System.out.println(abs(-8));
		System.out.println(abs(8));
	}

	public static int abs(int val) {
//		if (val <0) {
//			return -val;
//		}
//		return val;
		return val < 0 ? -val : val;
	}
}
