
public class DigitalCamera extends ElectronicEquipment {
	private byte maxFocalLength;

	public DigitalCamera(float weight, float cost, short powerUsage,
			String manufacturer, byte maxFocalLength) {
		super(weight, cost, powerUsage, manufacturer);
		this.maxFocalLength = maxFocalLength;
		}
	public byte getMaxFocalLength() {
		return maxFocalLength;
	}
	public void setMaxFocalLength(byte maxFocalLength) {
		this.maxFocalLength = maxFocalLength;
	}
	@Override
	public String toString() {
		return "DigitalCamera ["+super.toString()+", Max Focal Length = " + maxFocalLength
				+ "mm"+ "]";
	}
	
}
