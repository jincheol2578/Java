package sec06.ch04;

public class ForMission9 {

	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 5;

		// ____*
		// ___**
		// __***
		// _****
		// *****
//		for (int i = 1; i <= star; i++) {
//			for (int j = star; j > i; j--) {
//				System.out.print("_");
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		} .

		for (int i = star; i > 0; i--) {
			for (int j = 1; j <= star; j++) {
				if (j < i) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
				
			}System.out.println();
		}

	}

}
