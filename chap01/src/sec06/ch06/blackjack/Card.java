package sec06.ch06.blackjack;

public class Card {
	//카드패턴 문자열 값을 저장할수있는 pattern 멤버필드
	//카드심볼 문자열 값을 저장할 수 있는 symbol 멤버필드
	//멤버필드는 은닉화

	private String pattern;
	private String symbol;
	
	
	public Card(String pattern, String symbol){
		this.pattern = pattern;
		this.symbol = symbol;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return String.format("%s (%s)", pattern,symbol);
		}
}
