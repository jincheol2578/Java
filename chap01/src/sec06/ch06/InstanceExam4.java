package sec06.ch06;

public class InstanceExam4 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.name = "소나타";
		car1.cc = 2000;
		car2.name = "911";
		car2.cc = 5000;
		
		car1.drive();
		car1.stop();
		
		car2.drive();
	}
}
class Car{
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s는 달린다.\n",name);
		
	}
	void stop() {
		System.out.printf("%s는 멈춘다.\n",name);
	}
}
