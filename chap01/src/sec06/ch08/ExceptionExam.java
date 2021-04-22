package sec06.ch08;

public class ExceptionExam {
	public static void main(String[] args) {
		
		try {
			//에외가 발생될 가능성이 높은 소스를 위치
			int result = 10/0 ;   
			System.out.println("result : " + result);			
		} catch (Exception e) {
			e.printStackTrace(); //콘솔창에 출력
			System.out.println("예외발생");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("끝");
	}
}
