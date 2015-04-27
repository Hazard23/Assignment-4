
public class ElecEquipDemo {

	public static void main(String[] args) {
		Computers comp = new Computers((float)14.1,(float)1499.99,(short)750,"Asus","Windows 8.1");
		GameConsole gamecon = new GameConsole((float)14.0,(float)349.99,(short)250,"Xbox","Halo 5");
		Cellphone cell = new Cellphone((float)0.2875,(float)199.99,(short)15,"Samsung","Sprint");
		DigitalCamera cam = new DigitalCamera((float)1.2,(float)799.99,(short)21,"Nikon",(byte)55);
		
		System.out.println(comp);
		System.out.println(gamecon);
		System.out.println(cell);
		System.out.println(cam);
	
	}

}
