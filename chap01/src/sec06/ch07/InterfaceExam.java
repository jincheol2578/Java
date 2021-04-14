package sec06.ch07;

public class InterfaceExam {
	public static void main(String[] args) {
		RemoteControl rc1 = new LGTv();
		RemoteControl rc2 = new SamsungTv();
//		rc.welcome();
		rc1.volumeUp();
		rc2.volumeUp();
		rc1.chkVolume();
		rc2.chkVolume();
	}
}
