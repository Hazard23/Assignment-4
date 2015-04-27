
public class SportDemo {

	public static void main(String[] args) {
		Basketball basket = new Basketball("BasketBall","NBA",(byte)30,"Adam Silver",(byte)12,(short)244);
		Baseball base = new Baseball("BaseBall","MLB",(byte)30,"Rob Manfred",(byte)20,(byte)4);
		Hockey hock = new Hockey("Hockey","NHL",(byte)30,"Gary Bettman",(byte)34);
		Soccer socc = new Soccer("Soccer","MLS",(byte)20,"Don Garber",(short)144);
		
		System.out.println(basket);
		System.out.println(base);
		System.out.println(hock);
		System.out.println(socc);
		

	}

}
