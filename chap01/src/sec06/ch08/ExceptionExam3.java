package sec06.ch08;

public class ExceptionExam3 {
	public static void main(String[] args) {
		Calc2 c = new Calc2();
		int result = 0;
		try {
			
			result = c.div(10, 1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 발생");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("result : " + result);
	}
}

class Calc2 {
	int div (int n1, int n2) throws Exception {
		return n1 / n2;
	}
}
