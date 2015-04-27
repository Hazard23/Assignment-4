
public class GameConsole extends ElectronicEquipment{
	private String exclusives;

	public GameConsole(float weight, float cost, short powerUsage,
			String manufacturer, String exclusives) {
		super(weight, cost, powerUsage, manufacturer);
		this.exclusives = exclusives;
			}
	public String getExclusives() {
		return exclusives;
	}
	public void setExclusives(String exclusives) {
		this.exclusives = exclusives;
	}
	@Override
	public String toString() {
		return "GameConsole [" + super.toString()+", Exclusives = " + exclusives 
				 + "]";
	}
	

}
