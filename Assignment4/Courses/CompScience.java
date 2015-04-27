
public class CompScience extends Courses {
	private byte numberOfAssignments;

	public CompScience(String title, short number, String description,
			String department, byte numberOfAssignments) {
		super(title, number, description, department);
		this.numberOfAssignments = numberOfAssignments;
}
	public byte getNumberOfAssignments() {
		return numberOfAssignments;
	}

	public void setNumberOfAssignments(byte numberOfAssignments) {
		this.numberOfAssignments = numberOfAssignments;
	}
	@Override
	public String toString() {
		return super.toString() +" Number Of Assignments= " + numberOfAssignments
				 +  "]";
	}
}