package sec06.ch04;

public class Exercise04 {
	public static void main(String[] args) {
		
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			System.out.printf("(%d,%d)\n",a, b);
			if(a+b == 5) {
				break;
			}
		}System.out.println("끝");
	}
}
 