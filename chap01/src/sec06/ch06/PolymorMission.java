package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster ham = new Hamster();
		
		cry(cat);
		cry(pig);
		cry(ham);
		

	}

	public static void cry(Animal ani) {
		ani.howling();
		
	}
}
class Pig extends Animal{
	@Override
	void howling() {
		System.out.println("꿀 ~ 꿀~");
	}
}
class Hamster extends Animal{
	@Override
	void howling() {
		System.out.println("찍");
	}
}
