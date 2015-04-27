
public class Baseball extends Sport{
	private byte mostStrikeOutsinagame;
	private byte mostHomeRunsinagame;
	public Baseball(String title, String league, byte numberOfTeams,
			String commissioner,byte mostStrikeOutsinagame,byte mostHomeRunsinagame) {
		super(title, league, numberOfTeams, commissioner);
		this.mostStrikeOutsinagame = mostStrikeOutsinagame;
		this.mostHomeRunsinagame = mostHomeRunsinagame;
	
	}
	public byte getMostStrikeOutsinagame() {
		return mostStrikeOutsinagame;
	}
	public void setMostStrikeOutsinagame(byte mostStrikeOutsinagame) {
		this.mostStrikeOutsinagame = mostStrikeOutsinagame;
	}
	public byte getMostHomeRunsinagame() {
		return mostHomeRunsinagame;
	}
	public void setMostHomeRunsinagame(byte mostHomeRunsinagame) {
		this.mostHomeRunsinagame = mostHomeRunsinagame;
	}
	@Override
	public String toString() {
		return super.toString()+", Most Strike Outs In A Game = " + mostStrikeOutsinagame
				+ ", Most Home Runs in a game = " + mostHomeRunsinagame
				+ "]";
	}
	
}
