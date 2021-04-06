package sec06.ch06;

public class InstanceExam3 {
	public static void main(String[] args) {
		int mainNum = 10;
		Box box = new Box();
		box.num = 10;
		
		changeNum(mainNum);
		System.out.println(mainNum);
		changeBoxNum(box);
		System.out.println(box.num);
	}
	public static void changeNum(int num) {
		num =20;
	}
	public static void changeBoxNum(Box box) {
		box.num = 20;
	}
}
class Box{
	int num;
}
