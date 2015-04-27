
public class ReadingMaterial {
	private String title = "";
	private String editor= "";
	private short pageNumber=0;
	
	public ReadingMaterial(String title, String editor, short pageNumber) {
		super();
		this.title = title;
		this.editor = editor;
		this.pageNumber = pageNumber;
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public short getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(short pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	@Override
	public String toString() {
		return "Title= " + title + ", Editor= " + editor
				+ ", PageNumber= " + pageNumber ;
	}
	
}
