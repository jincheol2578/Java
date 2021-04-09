package sec06.ch06;

public class PolymorExam {
	public static void main(String[] args) {
		Animal ani_1 = new Cat();
		Cat cat = (Cat)ani_1;
		Animal ani_2 = cat;
		
		//Cat  cat1 = new Animal("",0); 자식 객체는 부모객체를 가르킬수없음
		//메소드는 객체 기준으로 실행된다
		ani_1.howling();
		System.out.println("끝");
	}
}
