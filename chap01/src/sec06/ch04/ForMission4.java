package sec06.ch04;

public class ForMission4 {

	public static void main(String[] args) {
		//2~9사이 랜덤값 추출
		int dan = (int)(Math.random()*8) + 2;
		//콘솔 (dan=2)
		//2 * 1 = 2 
		//2 * 2 = 4
		//2 * 3 = 6
		// ....
		//2*9 = 18
		System.out.println("dan : " + dan);
		for (int i=6; i<15 ; i++) {
			int j = i-5;
			System.out.printf("%d * %d = %d\n",dan,j,(dan*j));
		}
		
		//콘솔 (dan = 4)
		//4 * 1 = 1
		//....
		//4 * 9 = 36
	}

}
