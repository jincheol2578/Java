package sec06.ch07;

public abstract class Animal {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract  void howling(); //추상메소드 구현부가 없음. 
	public void breath() {
		
	}
	
}
//자식 클래스는 부모 클래스의 메소드를 무조건 오버라이딩 해야함
//추상화 클래스는 강제성이 있다.
class Cat extends Animal{ 
	public void howling() {
		System.out.println("무~야옹");
	}
}


class Dog extends Animal{
//	@Override
	public void howling() {
		System.out.println("멍~멍");
	}
}

