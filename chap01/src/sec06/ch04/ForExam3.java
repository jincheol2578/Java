package sec06.ch04;

public class ForExam3 {
	public static void main(String[] args) {
		int[] arr = {2,5,9,10,56};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
		
		for(int val : arr) {   // ( 각 방의 type : 순서가있는 변수 )   index값을 사용못함
			System.out.println(val);
		}
	}
}
