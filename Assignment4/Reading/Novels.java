
public class Novels extends ReadingMaterial  {
	private String author= "J. R. R. Tolkien";
	private String publisher = "George Allen and Unwin";
	
	
public Novels(String title, String editor, short pageNumber) {
		super(title, editor, pageNumber);}

@Override
public String toString() {
	return "Novels ["+super.toString()+ ", Author= " + author + ", Publisher= " + publisher+ 
		" ]" ;
}

}
