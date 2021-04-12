package sec06.ch07;

public class PolyMission {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
		
		blowKlaxson(car1);
		blowKlaxson(car2);
		blowKlaxson(car3);
		blowKlaxson(car4);
	}
	//Bus, LocalBus는 openDoor 호출
	//그외에는 hoot호출
	public static void blowKlaxson(Car car) {
		if(car instanceof Bus) {
			Bus bus = (Bus)car;
			bus.openDoor();
		}else {
			car.hoot();
		}
	
	}

}
