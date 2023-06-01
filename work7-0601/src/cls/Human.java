package cls;

//DTO(Data Transfer Object)
public class Human {
	private int number;
	private String name;
	private double height;
	
	public Human() {
		
	}

	public Human(int number, String name, double height) {
		this.number = number;
		this.name = name;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Human [number=" + number+ ",name=" + name+ ", height="+height + "]"; 
	}
}
