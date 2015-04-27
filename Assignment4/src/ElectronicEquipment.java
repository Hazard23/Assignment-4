
public class ElectronicEquipment {
	private float weight;
	private float cost;
	private short powerUsage;
	private String manufacturer;
	public ElectronicEquipment(float weight, float cost, short powerUsage,
			String manufacturer) {
		super();
		this.weight = weight;
		this.cost = cost;
		this.powerUsage = powerUsage;
		this.manufacturer = manufacturer;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public short getPowerUsage() {
		return powerUsage;
	}
	public void setPowerUsage(short powerUsage) {
		this.powerUsage = powerUsage;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Weight= " + weight+" pounds" + ", Cost= $" + cost
				+ ", PowerUsage= " + powerUsage+"v" + ", Manufacturer= "
				+ manufacturer ;
	}


}
