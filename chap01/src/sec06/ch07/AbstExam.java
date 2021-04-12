package sec06.ch07;

public class AbstExam {
	public static void main(String[] args) {
//		Animal animal = new Animal();  //추상화 클래스는 객체화 X
		
		Animal ani = new Cat();
		ani.breath();
		ani.howling();
	}
}
