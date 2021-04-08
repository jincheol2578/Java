package sec06.ch06;

public class StaticExam2 {
	public static void main(String[] args) {
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		Toy3.makeCount = 1;
		
		System.out.println("장난감 생산 갯수 : " + Toy2.makeCount);
		System.out.println("장난감 생산 갯수 : " + Toy3.makeCount);
	}
}
class Toy3 { 
	static int makeCount;
}
class Toy2 {
	static int makeCount;

	Toy2() {
		makeCount++;
	}
}