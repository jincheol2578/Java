package sec06.ch06.blackjack;

public class CardMain {
	public static void main(String[] args) {
		CardDeck cd =new CardDeck();
		
	}
	public static void println(String str) {
		System.out.println(str);
	}
	public static void println(Object obj) {
		System.out.println(obj);
		String str = obj.toString();
		println(str);
	}
	
}
