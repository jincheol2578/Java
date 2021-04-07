package sec06.ch06;

public class ConstructorExam2 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		//일렉트로 50inch 100Channel 50Volume
	}
}

class Tv2 {
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
	// this. 멤버변수 호출, 메소드호출
	// this(); 생성자호출
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}

	Tv2() {
		this("일렉트로", 50,100,50);
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
		System.out.printf("%s %dinch %dChannel %dVolume\n", brand, inch, maxChannel, maxVolume);
	}

}
