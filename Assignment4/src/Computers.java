
public class Computers extends ElectronicEquipment {
	private String OperatingSystem;

	public Computers(float weight, float cost, short powerUsage,
			String manufacturer,String OperatingSystem) {
		super(weight, cost, powerUsage, manufacturer);
		this.OperatingSystem = OperatingSystem;
		}
	public String getOperatingSystem() {
		return OperatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return  "Computers ["+super.toString()+ ", Operating System = " + OperatingSystem
				+ "]";
	}
	
	

}
