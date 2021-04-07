package sec06.ch06;

public class AccessExam {
	public static void main(String[] args) {
		Access acc = new Access();
		acc.printNum();
	}
}

class Access{
	private int num;  // private은 같은 클래스에서만 접근이 가능하다.
	
	void printNum() {
		System.out.println("num : " + num);
	}
}