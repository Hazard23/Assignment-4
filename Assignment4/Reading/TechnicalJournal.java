
public class TechnicalJournal extends ReadingMaterial {
	private String manuscriptTitle = "Modeling the time series of relative humidity variation in Sistan and Baluchestan";

	public TechnicalJournal(String title, String author, short pageNumber) {
		super(title, author, pageNumber);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "TechnicalJournal ["+super.toString()+ ", ManuscriptTitle= " + manuscriptTitle
				+  "]";
	}

}
