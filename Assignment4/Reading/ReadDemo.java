
public class ReadDemo {

	public static void main(String[] args) {
	 Novels novel = new Novels("The Lord of The Rings","Jamie Selkirk",(short)500);
	 TextBook txtbook = new TextBook("Java: An Introduction to Problem Solving and Programming", "Marcia Horton",(short)962);
	 Magazine mags = new Magazine("Miss Vogue","Alexandra Shulman",(short)35);
	 TechnicalJournal techjrnal = new TechnicalJournal("Technical Journal of Engineering and Applied Sciences", "Dr. Khaled Nabi Zaki Rashed", (short)14 );
	
	 System.out.println(novel);
	 System.out.println(txtbook);
	 System.out.println(mags);
	 System.out.println(techjrnal);
	 
	}

}
