package sec06.ch04;

public class SwitchMission3 {

	public static void main(String[] args) {
		int season = (int)(Math.random()*12)+1;
		System.out.println(season + "월");
		switch (season) {
		case 1: case 2: case 12:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
			default:
				System.out.println("가을");
			
		}
	}

}
