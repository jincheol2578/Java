package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] StrArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스", "우유" };
		int[] intArr = { 1000, 1200, 1300, 1500, 2000, 5000, 3000 };
		int price = 0;
		System.out.print("돈을 주입해 주세요. : ");
		price = scan.nextInt();
		System.out.println("<메뉴>");
		System.out.println("0. 종료");
		for (int i = 0; i < StrArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i + 1, StrArr[i], intArr[i]);
		}
		System.out.println("----------------------");
		while (true) {
			System.out.print("선택 > ");
			int scanVal = scan.nextInt();
			int selectedIdx = scanVal - 1;
			if (scanVal == 0) {
				System.out.printf("종료 - 남은금액은 : %,d원\n", price);
				break;
			} else if (scanVal < 0 || scanVal > StrArr.length) {
				System.out.println("잘못된선택입니다.\n");
				continue;
			} else if (price < intArr[selectedIdx]) {
				System.out.printf("금액이 부족합니다. ",price);
				continue;
			}
			price -= intArr[selectedIdx];
			System.out.printf("%s를 선택하셨습니다. (남은 금액 %,d원)\n", StrArr[selectedIdx], price);
		}
	}
}
