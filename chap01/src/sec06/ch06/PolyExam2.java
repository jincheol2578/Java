package sec06.ch06;

public class PolyExam2 {
//	1. 부모타입은 자식객체 주소값을 참조 할 수 있다.
//	2. 자식타입은 부모객체 주소값을 참조 할 수 없다.
	public static void main(String[] args) {
		Animal ani1 = new Hamster();  
		Animal ani2 = new Animal(); 
		//Animal 타입의 변수는 Animal 클래스와 자식 클래스(Hamster,cat) 주소값을 참조가능.
//		Hamster ham = ani2;  자식타입은 부모객체 주소 참조 X 
		Hamster ham = (Hamster)ani1;
		
		System.out.println("끝");
	}
}
