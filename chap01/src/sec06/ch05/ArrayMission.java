package sec06.ch05;

public class ArrayMission {

	public static void main(String[] args) {
		//정수형 배열 생성(10칸짜리)
		//모든 방에 정수값 20을 셋팅.
		
		int[] intArray = new int[10];
		
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = 20;
		}
		for(int i = 0; i<intArray.length; i++) {
			System.out.printf("intArray[%d] : %d\n" ,i,intArray[i]);
		}
		
	}

}
