package sec06.ch04;

public class Exercise05 {
	public static void main(String[] args) {
		int n1, n2;

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				n1 = 4 * x;
				n2 = 5 * y;
				if (n1 + n2 == 60) {
					System.out.printf("(%d,%d)\n", x, y);  
				}

			}
		}
		System.out.println("끝!");
	}
}
