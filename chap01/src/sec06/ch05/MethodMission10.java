package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		printMenu(menuNmArr, menuPriceArr);
		int selectedNum = scan.nextInt();
		System.out.println("끝");
	}

	public static boolean chooseMenu(Scanner scan, int len) {
		System.out.println("선택 > ");
		int seletedNum = scan.nextInt();
		return true;
	}
	public static void printMenu(String[] mnArr, int[] priceArr) {
		
	}

	public static void printMenu2(String[] mnArr, int[] priceArr) {
		String str = "<메뉴>\n";
		str += "종료\n";
		for (int i = 0; i < mnArr.length; i++) {
			str += String.format("%d. %s (%,d원)\n", i + 1, mnArr[i], priceArr[i]);
		}
	}

}
