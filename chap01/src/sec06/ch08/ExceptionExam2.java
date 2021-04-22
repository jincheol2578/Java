package sec06.ch08;

public class ExceptionExam2 {
	public static void main(String[] args) {
		Calc calc = new Calc();
		float result = calc.div(10,2);
		
		System.out.println(result);
	}
}

class Calc {
	float div (int n1, int n2) {
		int result = 0;
		try {
			result = n1 / n2;
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 발생");
		} finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("try 밖 실행");
		return result;
	}
}
