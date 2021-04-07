package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		Drink[] drinkArr = new Drink[menuNmArr.length];
		
		for (int i = 0; i < drinkArr.length; i++) {
			Drink drink = new Drink(); //for문 밖에있으면 다 같은주소로 들어감
			drink.nm = menuNmArr[i];
			drink.price = menuPriceArr[i];

			drinkArr[i] = drink; 
		}
		printMenu3(drinkArr);

//		printMenu(menuNmArr, menuPriceArr);
//		int selectedNum = scan.nextInt();
//		System.out.println("끝");
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
	public static void printMenu3(Drink[] drinkArr) {
		String str = "<메뉴>\n0. 종료\n";
		for(int i = 0; i<drinkArr.length; i++) {
			Drink item = drinkArr[i];
			str += String.format("%d. %s (%,d원)\n", i+1, item.nm, item.price);
		}
		System.out.println(str);
	}

}
