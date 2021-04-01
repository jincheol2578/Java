package sec06.ch04;

public class ForMission8 {

	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 3;
		System.out.println(star);
		for (int i = 0; i < star; i++) {
			for (int j = star; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int i = star; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
