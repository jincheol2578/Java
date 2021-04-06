package sec06.ch06;

public class InstanceExam {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog2 = new Dog();
		dog.name = "뽀삐";
		dog2.name = "천이";
		dog2.bark();
		dog.bark();
	}
}
class Dog{
	String name;
	String jong;
	int age;
	
	void bark() {
		System.out.printf("%s는 멍멍\n",name);
	}
}