
public class English extends Courses {
	private byte numberOfEssays;

	public English(String title, short number, String description,
			String department,byte numberOfEssays ) {
		super(title, number, description, department);
		this.numberOfEssays = numberOfEssays;
		}
	public byte getNumberOfEssays() {
		return numberOfEssays;
	}
	public void setNumberOfEssays(byte numberOfEssays) {
		this.numberOfEssays = numberOfEssays;
	}
	@Override
	public String toString() {
		return super.toString()+" Number Of Essays= " + numberOfEssays +  "]";
	}


	

}
