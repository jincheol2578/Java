package sec06.ch06;

public class VariadicArguments {

	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		
		cal.sum(10,20);
		cal.sum(10,20,50,60,70);
		cal.sum(10,20,60,70,80,90);
	}

}
class Calc2{
	int sum(int... vals) { // 가변인자를 사용하면 갯수 제한없이 받을 수 있다. (배열로바뀜)
		int sum=0;
		for(int i = 0; i<vals.length; i++) {
			sum += vals[i];
			
		}
		System.out.println(sum);
		return sum;
		
	}
}