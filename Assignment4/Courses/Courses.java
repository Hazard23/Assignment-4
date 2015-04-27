
public class Courses {
	private String title;
	private short number;
	private String description;
	private String department;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public short getNumber() {
		return number;
	}
	public void setNumber(short number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Courses(String title, short number, String description,
			String department) {
		super();
		this.title = title;
		this.number = number;
		this.description = description;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Courses [Title= " + title + ", Number= " + number
				+ ", Description= " + description + ", Department= " + department
				+",";
	}

}
