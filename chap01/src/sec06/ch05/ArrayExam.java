package sec06.ch05;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 (같은 타입의 여러 개 변수를 편하게 사용하기 위해 사용)
		//
		int n1, n2, n3, n4, n5, n6, n7, n8;
		n2 = 10;
		
		//변수 크게 분류(원시형(Primary Type), 참조형(Reference Type))
		String[] strArr = new String[10];
		System.out.println("strArr[1] : " + strArr[1]);
		
		int len = 300;
		
		int[] intArr = new int[len];
		System.out.println("intArr[1] : " + intArr[1]);
		System.out.println("--------------------------");
		int[] intArr2 = {10,20,30};
		
		for(int i=0; i<3; i++) {
			System.out.printf("intArr2[%d] : %d\n" , i,intArr2[i]);
		}
	}

}
