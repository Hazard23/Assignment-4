
public class CoursesDemo {

	public static void main(String[] args) {
		Math math = new Math("Calculus",(short)173,"PreReq for Calc 2","CT",(byte)4);
		CompScience compsci = new CompScience("Computer Science",(short)201,"PreReq for CompSci 202","CT",(byte)25);
		English eng = new English("English",(short)102,"Last required eng course","CC",(byte)4);
		Sociology soci = new Sociology("Sociology",(short)201,"PreReq for Soci 202","CN",(byte)78);
		
		System.out.println(math);
		System.out.println(compsci);
		System.out.println(eng);
		System.out.println(soci);
		
	}

}
