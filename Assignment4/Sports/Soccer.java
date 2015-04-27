
public class Soccer extends Sport {
	private short mostGoalsScoredInASeason;

	public Soccer(String title, String league, byte numberOfTeams,
			String commissioner,short mostGoalsScoredInASeason) {
		super(title, league, numberOfTeams, commissioner);
		this.mostGoalsScoredInASeason = mostGoalsScoredInASeason;
		
	}
	public short getMostGoalsScoredInASeason() {
		return mostGoalsScoredInASeason;
	}
	public void setMostGoalsScoredInASeason(byte mostGoalsScoredInASeason) {
		this.mostGoalsScoredInASeason = mostGoalsScoredInASeason;
	}
	@Override
	public String toString() {
		return super.toString() +", Most Goals Scored In A Season = " + mostGoalsScoredInASeason
				+  "]";
	}
	
}
