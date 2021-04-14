package sec06.ch07;

public interface RemoteControl {
	int AGE = 10;
	
	public abstract void volumeUp(); //abstract 앞에는 항상 public 붙음 생략 가능
	abstract void volumeDown();
	void chkVolume();
}
