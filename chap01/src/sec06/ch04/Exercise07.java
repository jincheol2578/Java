package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 0;
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> " );
			int scanVal = scanner.nextInt();
			if(scanVal == 1) {
				System.out.print("예금액> ");
				balance += scanner.nextInt();
			}else if (scanVal == 2) {
				System.out.print("출금액> " );
				balance -= scanner.nextInt();
			}else if (scanVal == 3) {
				System.out.println("잔고> " + balance);
			}else if (scanVal == 4) {
				System.out.println("프로그램 종료");
				break;
				
			}else {
				System.out.println("1,2,3,4중 하나만 입력하세요");
			}
		}

	}

}
