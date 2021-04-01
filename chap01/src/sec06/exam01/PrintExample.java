package sec06.exam01;

public class PrintExample {
	public static void main(String[] args) {
		System.out.println("하하");
		System.out.println("호호");
		System.out.println("후후");
		System.out.println(); 
		System.out.print("하하");
		System.out.print("호호");
		System.out.print("후후");
		System.out.println(); 
		System.out.print("하하\n");
		System.out.print("호호\n");
		System.out.print("후후\n");

		
		char bloodType = 'O';
		int age = 10;
		float weight = 30.4f;
		String name = "홍길동";
		
//		제 이름은 홍길동이며, 나이는 10살이고, 혈액형은 O형이고, 몸무게는 30.4kg입니다.
		System.out.println("제 이름은 " + name + "이며, 나이는 " + age + "살이고, 혈액형은 " + bloodType
				+ "형이고, 몸무게는 " + weight + "입니다.");
		
		System.out.println("제 이름은 홍길동이며, 나이는 10살이고, 혈액형은 O형이고, 몸무게는 30.4kg입니다.");
		
		System.out.printf("제 이름은 %s이며, 나이는 %02d살이고, 혈액형은 %c형이고, 몸무게는 %.1fkg입니다."
				,name ,age, bloodType, weight);
		char ch = 'c';
		System.out.printf("%d : %c", (int)ch, ch );
		
	}
}
