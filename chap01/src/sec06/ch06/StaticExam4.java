package sec06.ch06;

public class StaticExam4 {
	public static void main(String[] args) {
		CalcInstance2 ci = new CalcInstance2();
		ci.num1 = 10;
		ci.num2 = 20;
		int result = ci.sum();
		System.out.println(result);

		int result2 = CalcStatic2.sum(10, 20);

		System.out.println(result2);
	}
}

class CalcStatic2 { // 클래스 멤버필드
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance2 { // 인스턴스 멤버필드
	int num1;
	int num2;

	int sum() {
		return num1 + num2;
	}

	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}
