package sec06.ch06;

public class OverrideExam {
	public static void main(String[] args) {
		NumBox nb1 = new NumBox(10);
		NumBox nb2 = new NumBox(10);
		System.out.println(nb1 == nb2); //reperence 값 비교는 주소 값 비교다.
		System.out.println(nb1.equals(nb2)); 
	}
}

class NumBox{
	private int num;
	NumBox(int num){
		this.num = num;
	}
	public int getNum() { 
		return num;
	}
	
	@Override      //오버라이딩 사용이유 : 다형성
	public boolean equals(Object obj) {
		NumBox temp = (NumBox)obj;
		
		return this.getNum() == temp.getNum();
	}
	
}