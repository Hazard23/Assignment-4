
public class Sport {
	private String title;
	private String league;
	private byte numberOfTeams;
	private String commissioner;
	public Sport(String title, String league, byte numberOfTeams,
			String commissioner) {
		super();
		this.title = title;
		this.league = league;
		this.numberOfTeams = numberOfTeams;
		this.commissioner = commissioner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public byte getNumberOfTeams() {
		return numberOfTeams;
	}
	public void setNumberOfTeams(byte numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}
	public String getCommissioner() {
		return commissioner;
	}
	public void setCommissioner(String commissioner) {
		this.commissioner = commissioner;
	}
	@Override
	public String toString() {
		return "Sport [Title = " + title + ", League = " + league
				+ ", Number Of Teams = " + numberOfTeams + ", Commissioner = "
				+ commissioner;
	}
	
}
