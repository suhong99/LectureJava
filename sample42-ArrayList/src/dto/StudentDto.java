package dto;

public class StudentDto {
	private int no;
	private String name;
	private double height;
	
	public StudentDto() {
		
	}

	public StudentDto(int no, String name, double height) {
		super();
		this.no = no;
		this.name = name;
		this.height = height;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "StudentDto [no=" + no + ", name=" + name + ", height=" + height + "]";
	}
	
}
