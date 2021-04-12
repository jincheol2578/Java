package sec06.ch06.blackjack;

public class CardDeck {

	private final Card[] CARD_ARR;// final은 주소값만 못바꿈 52는바꿀수있다

	private static final String[] CARD_PATTERN = { "Spades", "Hearts", "Dimonds", "Clubs" };
	private static final String[] CARD_SYMBOL = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	// 카드패턴 Spades, Hearts, Diamons, Clubs
	// 카드심볼 A234567810JQK
	// 52개의 객체를 담을 수 있는 은닉화 된 전역 배열 상수 존재
	public CardDeck() {// final이여도 생성자에서 값주면된다.
		CARD_ARR = new Card[CARD_PATTERN.length * CARD_SYMBOL.length];
		card();
	}

	public void card() {

		int count = 0;
		for (int i = 0; i < CARD_PATTERN.length; i++) {
			for (int j = 0; j < CARD_SYMBOL.length; j++) {
				Card card = new Card(CARD_PATTERN[i], CARD_SYMBOL[j]);
				CARD_ARR[count++] = card;
			}
		}

//		for (String pattern : CARD_PATTERN) {
//			for (String symbol : CARD_SYMBOL) {
//				CARD_ARR[count++] = new Card(pattern, symbol);
//			}
//		}

	}

	private int getRandomIdx() {
		return (int) (Math.random() * CARD_ARR.length);
	}

	public Card getOneCard() {
		int idx = 0;
		int max = 0;
		Card a = null;
		if (max < CARD_ARR.length) {
			do {
				idx = getRandomIdx();
				a = CARD_ARR[idx];
			} while (a == null);
		}
		max++;
		CARD_ARR[idx] = null;
		return a;
	}

	public void printAll() {
		for (Card c : CARD_ARR) {
			System.out.println(c);
		}

	}
}
