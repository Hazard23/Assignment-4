
public class Basketball extends Sport{
	private byte most3pointersMadeinagame;
	private short mostDunksMadeinaseason;
	public Basketball(String title, String league, byte numberOfTeams,
			String commissioner, byte most3pointersMadeinagame,short mostDunksMadeinaseason) {
		super(title, league, numberOfTeams, commissioner);
		this.most3pointersMadeinagame = most3pointersMadeinagame;
		this.mostDunksMadeinaseason = mostDunksMadeinaseason;
		}
	public byte getMost3pointersMadeinagame() {
		return most3pointersMadeinagame;
	}
	public void setMost3pointersMadeinagame(byte most3pointersMadeinagame) {
		this.most3pointersMadeinagame = most3pointersMadeinagame;
	}
	public short getMostDunksMadeinaseason() {
		return mostDunksMadeinaseason;
	}
	public void setMostDunksMadeinaseason(short mostDunksMadeinaseason) {
		this.mostDunksMadeinaseason = mostDunksMadeinaseason;
	}
	@Override
	public String toString() {
		return  super.toString()+", Most 3 Pointers Made in a game = "
				+ most3pointersMadeinagame + ", Most Dunks Made in a Season = "
				+ mostDunksMadeinaseason + "]";
	}
	
	

}
