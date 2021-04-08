package sec06.ch06;

public class InheriExam {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.howling();
		cat.lick();
		
		KoShort ks = new KoShort();
		ks.pee();
	}
}
//모든 클래스는 부모가 있음 extends Object   
//모든 자바객체는 Object를 상속받음 최상위 객체
class Animal{  
	String name;
	int age; 
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void howling() {
		System.out.printf("%s가 운다\n",name);
	}
}

class Cat extends Animal{
	Cat(){
		super("",0);
	}
	void lick() {
		System.out.printf("%s가 핥다\n",name);
	}
	
	@Override
	void howling(){
		System.out.println("야옹");
	}
	
}

class KoShort extends Cat{
	KoShort(){
		super();
	}
	void pee() {
		System.out.printf("%s가 소변을 본다\n", name);
	}
}