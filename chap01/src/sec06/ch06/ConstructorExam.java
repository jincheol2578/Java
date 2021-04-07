package sec06.ch06;

public class ConstructorExam {
	// 생성자 Construct : 객체가 생성될때 무조건 호출 해야한다.
	public static void main(String[] args) {
		Tv tv1 = new Tv();

		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 200;
		tv1.maxVolume = 100;
		tv1.displayState();
		//Samsung 100inch 100Channel 100Volume

		Tv tv2 = new Tv("Lg", 120, 300, 200);
		tv2.displayState();
		//LG 200inch 150Chaneel 200Volume
	}
}

class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	// 기본 생성자
	// 생성자 vs 메소드
	// 생성자는 class와 이름이 같아야함
	// return 타입이 없다.
	// 생성자는 객체 생성할때만 사용 할 수 있다.
	// 기본 생성자는 컴파일러가 만들어준다(생성자가 없을 시)
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}

	Tv() {

	}

	 void volumeUp() {
		currentVolume++;
	}

	 void volumeDown() {
		currentVolume--;
	}

	 void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	 void displayState() {
		 System.out.printf("%s %dinch %dChannel %dVolume\n",
				 brand, inch, maxChannel, maxVolume);
	 }

}
