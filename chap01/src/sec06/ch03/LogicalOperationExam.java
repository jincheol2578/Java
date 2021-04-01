package sec06.ch03;

public class LogicalOperationExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// &&(AND) ||(OR) !(NOT)

		boolean res1 = true && true && false; // 1개만 false 여도 false
		System.out.println("res1 : " + res1);

		boolean res2 = (10 > 2) || false || false; // 1개만 false 여도 false
		System.out.println("res2 : " + res2);

		int n = 2;
		boolean res = false && (1 < n++); // &&는 앞부분이 false때 뒷쪽은 연산x Dead code
		System.out.println("n : " + n);

	}

}
