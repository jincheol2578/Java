package sec06.ch07;

public class PolyExam {
	// 부모타입은 자식객체 주소값을 참조 할 수 있다.
	// 자식타입은 부모객체 주소값을 참조 할 수 없다.
	// 변수 타입은 메소드 호출 여부만 결정!
	// (자기가 아는것만 호출가능함)
	// 호출이 되었다면 실행되는것은 객체기준!
	public static void main(String[] args) {
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus();
//		Bus bus1 = new Car(); X
		
		Bus bus1 = (Bus)car1;
		bus1.openDoor();
		bus1.hoot();
		
		Car carP = bus1;
		carP.hoot();
		
		
		System.out.println("끝!");
	}
}
