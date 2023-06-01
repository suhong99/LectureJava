package cls;

public class Pitcher extends Human{
	private int win;
	private int lose;
	private double defence;
	public Pitcher() {
		
	}
	
	public Pitcher(int number, String name, double height,int win, int lose, double defence) {
		super(number,name,height);
		this.win = win;
		this.lose = lose;
		this.defence = defence;
	}

	@Override //지시문
	public String toString() {
		return "Pitcher [win=" + win + ", lose=" + lose + ", defence=" + defence + "]"+super.toString();
	}
	
}
