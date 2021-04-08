package sec06.ch06;

public class StaticExam3 {
	public static void main(String[] args) {
		CalcInstance ci = new CalcInstance();
		
		int result = ci.sum(10, 20);
		int result2 = CalcStatic.sum(10, 10);
		
		System.out.println(result);
		System.out.println(result2);
	}
}
class CalcStatic {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance{
	int sum(int num1, int num2){
		return num1 + num2;
	}
}
