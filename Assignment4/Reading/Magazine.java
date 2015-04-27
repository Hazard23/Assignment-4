
public class Magazine extends ReadingMaterial {
	

	private String cover = "Sean Thomas";
	private String model = "Cressida Bonas";
	public Magazine(String title, String editor, short pageNumber) {
		super(title, editor, pageNumber);
		
	}
	@Override
	public String toString() {
		return "Magazine ["+super.toString()+ ", Cover= " + cover + ", Model= " + model
				+   "]";
	}
	

}
