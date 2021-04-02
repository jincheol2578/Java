package sec06.ch05;

public class MethodMission3 {
	public static void main(String[] args) {
		sumAllFromTo(5, 10);
		sumAllFromTo(2, 4);
		sumAllFromTo(4, 2);
	}

	private static void sumAllFromTo(int i, int j) {
		int sum = 0;
		int a = i;
		int b = j;
		if (i > j) {
			a = j;
			b = i;
		}
		for (int n1 = a; n1 <= b; n1++) {

			sum += n1;
		}
		System.out.println(sum);
	}
}
