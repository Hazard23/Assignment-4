
public class TextBook extends ReadingMaterial {
	private String contributer = "Kenrick Mock";
	private String author = "Walter Savitch" ;
	private String cover= "Joyce Wells";
	public TextBook(String title, String editor, short pageNumber) {
		super(title, editor, pageNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TextBook ["+super.toString()+", Contributer= " + contributer + ", Author= "
				+ author + ", Cover= " + cover+ "]";
	}
	

}
