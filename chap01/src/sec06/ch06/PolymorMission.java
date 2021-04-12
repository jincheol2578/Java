package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();
		
		System.out.println(hamster instanceof Hamster);
		System.out.println(pig instanceof Hamster);
		
//		Hamster ham = (Hamster)hamster;
//		ham.runRail();
		PolymorMission.cry(cat);
		PolymorMission.cry(pig);
		cry(hamster);
	}
	 //ani로 Hamster 객체 주소값이 들어오면 howling 메소드 말고, runrail 메소드 호출 다른 객체들은 howling 메소드 호출
	public static void cry(Animal ani) {
		if(ani instanceof Hamster) {
			Hamster ham = (Hamster)ani;
			ham.runRail();
		}else {
			ani.howling();
		}
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
	void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
}
