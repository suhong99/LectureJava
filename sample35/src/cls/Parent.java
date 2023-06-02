package cls;

public class Parent {
	protected int number;
	private String name;
	public void method() {
		number =12;
		name="홍길동";
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected void swap() {
		
	}
}
