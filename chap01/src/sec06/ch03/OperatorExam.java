package sec06.ch03;

public class OperatorExam {

	public static void main(String[] args) {
		// 산술 연산자
		int n1 = 10;
		int n2 = 3;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 / n2);
		System.out.println((double) n1 / n2);
		System.out.println(n1 * n2);

		int result2 = 3 + 4 + 5 * 6;
		System.out.println("result2: " + result2);
		
		int mod = 10 % 3;
		System.out.println("mod : " + mod);
		
		int odd = 3 % 2; 
		int even = 2 % 2;
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
		System.out.println("-------------------");
		int n3 = -1;
		System.out.println("n3 : " + (-n3));

	}

}
