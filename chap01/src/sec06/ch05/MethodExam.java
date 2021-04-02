package sec06.ch05;

public class MethodExam {

	public static void main(String[] args) { // 메인 메소드
		int a = 10;
		int b = 20;
	int result = sum(a,b);
	int result2 = minus(b,a);
	System.out.println(result);
	System.out.println(result2);
	
	}
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	public static int minus(int n1,int n2) {
		return n1 - n2;
	}

}
