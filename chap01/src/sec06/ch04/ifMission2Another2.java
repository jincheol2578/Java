package sec06.ch04;

public class ifMission2Another2 {

	public static void main(String[] args) {
		String gender = "남";
		int height = 176;
		
		String displayGender = "여자", displayResult = "평균";
		
		int stand = 0;
		final int STAND_MAN = 175;
		final int STAND_WOMAN = 163;
		stand = STAND_WOMAN;
		
		
		if (gender.equals("남")) {
			stand = STAND_MAN;
			displayGender = "남자";
		}
		if (height < stand) {
			displayResult = "평균 이하";
			 
		}else if (height > stand){
			displayResult = "평균 초과";
		}
		System.out.printf("%s - %dcm : %s\n", displayGender, height, displayResult);
	}

}