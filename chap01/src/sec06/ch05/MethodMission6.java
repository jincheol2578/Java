package sec06.ch05;

public class MethodMission6 {
	public static void main(String[] args) {
		int score = getRandomScore(50, 100);
		// 50~100사이의 랜덤숫자 나오도록 셋팅
		char grade = getGrade(score);
		// 90=A
		// 80=B
		// 70=C
		// 60=D
		// 나머지=E
		char grade2 = getGrade2(score);
		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}

	public static char getGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else {
			return 'E';
		}
	}

	public static char getGrade2(int score) {
		int num = score % 10;
		if (num > 7 || score == 100) {
			return '+';
		} else if (num < 4) {
			return '-';
		} else {
			return 0;
		}
	}

	public static int getRandomScore(int i, int j) {
		int random = (int) (Math.random() * (j - i + 1)) + i;
		return random;
	}

}
