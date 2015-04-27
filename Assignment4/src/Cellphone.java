
public class Cellphone extends ElectronicEquipment {
	private String Carrier;
	public Cellphone(float weight, float cost, short powerUsage,
			String manufacturer, String Carrier) {
		super(weight, cost, powerUsage, manufacturer);
		this.Carrier = Carrier;
	}
	public String getCarrier() {
		return Carrier;
	}
	public void setCarrier(String carrier) {
		Carrier = carrier;
	}
	@Override
	public String toString() {
		return "Cellphone ["+super.toString() +", Carrier = " + Carrier +  "]";
	}

	
}
