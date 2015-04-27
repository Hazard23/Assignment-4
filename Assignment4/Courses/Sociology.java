
public class Sociology extends Courses{
	private byte memorizedTerms;

	public Sociology(String title, short number, String description,
			String department, byte memorizedTerms) {
		super(title, number, description, department);
		this.memorizedTerms = memorizedTerms;
		}
	public byte getMemorizedTerms() {
		return memorizedTerms;
	}
	public void setMemorizedTerms(byte memorizedTerms) {
		this.memorizedTerms = memorizedTerms;
	}
	@Override
	public String toString() {
		return super.toString() +" Memorized Terms= " + memorizedTerms +  "]";
	}
	

}
