package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {
	public static void main(String[] args) {
		/*
		 * 콘솔에 출력할 내용.
		 * 
		 * <메뉴> 1. 콜라 (1,000원) 2. 사이다 (1,200원) 3. 환타 (1,300원)
		 * 
		 */
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스", "우유" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 5000, 3000 };
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			
			System.out.println("<메뉴>");
			for (int i = 0; i < menuNmArr.length; i++) {
				System.out.printf("%d. %s (%,d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
				
			}
			int scanVal = scan.nextInt();
			System.out.println("선택>");
			
			
			if (scanVal == 0) {
				System.out.println("종료");
				break;
			}else if(scanVal <= menuNmArr.length) {
				System.out.printf("%s를 선택하셨습니다.\n",menuNmArr[scanVal-1]);
			}else {
				System.out.println("잘 못 선택하셨습니다.");
			}
				
		}
	}
}
