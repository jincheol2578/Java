package sec06.ch04;

public class WhileMission {

	public static void main(String[] args) {
		// 1~100 결과 구하기.
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
