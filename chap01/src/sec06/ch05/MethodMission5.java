package sec06.ch05;

public class MethodMission5 {
	public static void main(String[] args) {
		int star = (int)(Math.random()*5)+1;
		
		printStarLine(star); //*****
		System.out.println("\n------------");
		printStarSqure(star); 
		System.out.println("------------");
		printStarTri(star);
	}
	public static void printStarLine(int i) {
		for(int a = 0; a < i; a++ ) {
			System.out.print("*");
		}
	}
	public static void printStarSqure(int a) {
		for(int i = 0; i<a; i++) {
			printStarLine(a);
			System.out.println();
		}
	}
	public static void printStarTri(int i) {
		for(int a=1; a<=i; a++) {
			printStarLine(a);
			System.out.println();
		}
	}
	
}
