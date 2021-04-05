package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		printMenu(menuNmArr, menuPriceArr);
	}

	public static void printMenu(String[] menuNmArr, int[] menuPriceArr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("<메뉴>");
		System.out.println("0. 종료");
		for (int i = 0; i < menuNmArr.length; i++) {
			System.out.printf("%d. %s (%d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
		}
		while (true) {
			System.out.print("선택 > ");
			int scanVal = 0;
			scanVal = scan.nextInt();
			if (scanVal == 0) {
				System.out.println("종료");
				break;
			} else if (scanVal <= menuNmArr.length) {
				System.out.printf("%s를 선택하셨습니다. (%d원)\n", menuNmArr[scanVal], menuPriceArr[scanVal]);
			} else {
				System.out.println("없는 상품입니다.");
				continue;
			}
		}
	}
	
	public static void printMenu2(String[] menuNmArr, int[] menuPriceArr) {
		
	}

}
