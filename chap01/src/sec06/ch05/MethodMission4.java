package sec06.ch05;

public class MethodMission4 {
	public static void main(String[] args) {
		int rNum = getRandom(); 
		System.out.println(rNum);
		
		
		int max = 10;
		rNum =getRandomNum(max);
		System.out.println(rNum);
		
		rNum = getRandomNum(5,10);
		rNum = getRandomNum(10,20);
	}
	public static int getRandomNum(int min, int max) {
		int a=max-min+1,b=min;
		int r = (int)(Math.random()*a)+b;
		System.out.println(r);
		return r;
		
	}

	public static int getRandomNum(int max) {
		int num = max;
		int r = (int)(Math.random()*num);
		return r;
	}

	public static int getRandom() {
		int r = (int)(Math.random()*10);
		return r;
	}
}
