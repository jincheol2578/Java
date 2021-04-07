package sec06.ch06;

public class OverloadingExam {
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(5,10);
		calc.sum(5,10,5);
		calc.sum(10,20,"30");
		
		
	}
}

class Calc{
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}
	void sum(int d1, int d2, String d3) {
		System.out.println(d1 + d2 + d3);
	}
}
