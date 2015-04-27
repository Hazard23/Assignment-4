
public class Math extends Courses {
	private byte numberOfExams;
	public Math(String title, short number, String description,
			String department, byte numberOfExams) {
		super(title, number, description, department);
		this.numberOfExams = numberOfExams;
	
	}
	public byte getNumberOfExams() {
		return numberOfExams;
	}
	public void setNumberOfExams(byte numberOfExams) {
		this.numberOfExams = numberOfExams;
	}
	@Override
	public String toString() {
		return  super.toString() + " Number of Exams= " + numberOfExams+ "]";
	}
	
}
