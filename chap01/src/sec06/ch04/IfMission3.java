package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int) (Math.random() * 40) + 61;
		System.out.println("SCORE : " + SCORE);
		// SCORE의 값은 81~100점 사이의 값이 된다.(실행할때마다 달라짐)
		int num = SCORE % 10;
		String rank = "D";
		String rank2 = "";
		
		
		// 91~100 A (97점 이상은 "A+", 96~94 "A", 93~91 "A-"
		// 81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-"
		// 71~80 C (77점 이상은 "C+", 76~74 "C", 73~71 "C-"
		// 나머지 D
		if (num >= 7 || num == 0) {
			rank2 = "+";
		}else if(num <= 3) {
			rank2 = "-";
		}
		
		if (SCORE > 90) {
			rank = "A"
					;
		}else if(SCORE > 80) {
			rank = "B";
		}else if(SCORE > 70){
			rank = "C";
		}else { 
			rank2 = "";
		}
		System.out.println(rank+rank2);
		
//		if (SCORE >= 97) {
//			System.out.println("A+");
//		}else if(SCORE >= 94) {
//			System.out.println("A");
//		}else if(SCORE >= 91) {
//			System.out.println("A-");
//		}else if(SCORE >= 87) {
//			System.out.println("B+");
//		}else if(SCORE >= 84) {
//			System.out.println("B");
//		}else if(SCORE >= 81) {
//			System.out.println("B-");
//		}

		
	}
}
