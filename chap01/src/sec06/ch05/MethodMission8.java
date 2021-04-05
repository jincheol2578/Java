package sec06.ch05;

public class MethodMission8 {
	public static void main(String[] args) {

		gugudan(9);
		System.out.println("------------");
		gugudan(2, 8);
	}

	private static void gugudan(int num1, int num2) {
		for (int j = num1; j <= num2; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", j, i, j * i);
			}
			System.out.println("------------");
		}
	}

	public static void gugudan(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

}
