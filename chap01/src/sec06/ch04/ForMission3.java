package sec06.ch04;

public class ForMission3 {
	public static void main(String[] args) {
		int star = (int) ((Math.random()*6)+5);
		System.out.println(star);
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
		// star는 5~10 사이 랜덤값
		// star값이 5면 "*****"
	}
}
