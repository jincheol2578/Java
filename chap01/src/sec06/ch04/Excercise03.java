package sec06.ch04;

public class Excercise03 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				System.out.println(sum);
			}
		}
		System.out.println("결과 : " + sum);
	}

}
