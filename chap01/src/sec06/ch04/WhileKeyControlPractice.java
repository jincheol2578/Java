package sec06.ch04;

import java.util.Scanner;

public class WhileKeyControlPractice {

	public static void main(String[] args) {
		int speed = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1:증속 2:감속 3:중지");
		
		while(true) {
			int val = scan.nextInt();
			if(val == 1) {
				speed++;
			}else if(val == 2) {
				speed--;
			}else if(val == 3) {
				break;
			}else {
				System.out.println("보기에 있는 숫자만 입력하세요");
			}
			System.out.println("현재속도 : " + speed);
		}
		System.out.println("종료되었습니다.");
		scan.close();
	}

}
