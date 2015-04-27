
public class Hockey extends Sport {
	private byte mostPowerPlayGoalsInASeason;

	public Hockey(String title, String league, byte numberOfTeams,
			String commissioner,byte mostPowerPlayGoalsInASeason) {
		super(title, league, numberOfTeams, commissioner);
		this.mostPowerPlayGoalsInASeason = mostPowerPlayGoalsInASeason;
				
	}
	public byte getMostPowerPlayGoalsInASeason() {
		return mostPowerPlayGoalsInASeason;
	}
	public void setMostPowerPlayGoalsInASeason(byte mostPowerPlayGoalsInASeason) {
		this.mostPowerPlayGoalsInASeason = mostPowerPlayGoalsInASeason;
	}
	@Override
	public String toString() {
		return super.toString()+", Most Power Play Goals In A Season = "
				+ mostPowerPlayGoalsInASeason  + "]";
	}
	

}
