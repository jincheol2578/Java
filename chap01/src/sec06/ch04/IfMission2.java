package sec06.ch04;

public class IfMission2 {
	// 여 평균키 : 163
	// 남 평균키 : 175

	public static void main(String[] args) {
		String gender = "남";
		int height = 175;
		
		int stand = 0;
		final int STAND_MAN = 175;
		final int STAND_WOMAN = 163;
		stand = STAND_MAN;
		
		System.out.println(gender);
		if (gender.equals("여")) {
			stand = STAND_WOMAN;
		}
		if (height < stand) {
			System.out.println("평군 미만");
		}else if (height == stand) {
			System.out.println("평균");
		}else {
			System.out.println("평균 초과");
		}
	}
}
