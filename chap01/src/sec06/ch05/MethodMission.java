package sec06.ch05;

public class MethodMission {
	public static void main(String[] args) {
		whoisBig(10, 30); // 30이 가장 큽니다.
		whoisBig(10, 9);// 10이 가장 큽니다.
		whoisBig(11, 25);// 25이 가장 큽니다.

		int big = getBigNum(10, 30);
		System.out.println("big : " + big); // big 30

		big = getBigNum(10, 9);
		System.out.println("bog : " + big); // big : 10

	}

	public static void whoisBig(int i, int j) {
		int big = i;
		if (i > j) {
			big = j;
		}
		System.out.printf("%d이 가장 큽니다\n", big);
	}

	public static int getBigNum(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} 
		return n2;
		
	}

}
