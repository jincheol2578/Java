package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String answer = null;
		do {
			System.out.print("성별 : ");
			String gender = scan.next();

			System.out.print("키 : ");
			int height = scan.nextInt();

			String result = chk(gender, height);
			System.out.println(result);

			System.out.print("계속 하시겠습니까? (y,n)");
			answer = scan.next();
 
		} while (answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}

	public static String chk(String gender, int height) {
//		int man = 175;
//		int woman = 163;
		String result = "평균";
//
//		if (gender.equals("남")) {
//			if (man < height) {
//				result = "평균이상";
//			} else if (man > height) {
//				result = "평균이하";
//			}
//		} else if (gender.equals("여")) {
//			if (woman < height) {;
//				result = "평균이상";
//			} else if (woman > height) {
//				result = "평균이하";
//			}
//		} 
		int stand = 0;
		
		switch (gender) {
		case "남": stand = 175; break;
		case "여": stand = 163; break;
		default: return "성별을 잘 못 입력하셨습니다.";
		}
		
		if(height >stand) {
			result = "평균초과";
		}else if (height <stand) {
			result = "평균이하";
		}
		return String.format("성별: %s, 키: %dcm, %s", gender, height, result);

	}

}
