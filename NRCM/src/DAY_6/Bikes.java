package DAY_6;
interface KTM{
	void duke();
}
interface Yamaha{
	void r15();
}
interface BMW extends KTM,Yamaha{
	void rr();
}
class Royalenfiled {
	public void interceptor() {
		System.out.println("interceptor has 650 cc engine");
	}
}

public class Bikes extends  Royalenfiled implements BMW {
	public void duke() {
		System.out.println("duke belongs to ktm");
	}
	public void r15()
	{
		System.out.println("r15 belongs to yamaha");
	}
	public void rr() {
		System.out.println("s1000rr belongs to bmw");
	}

	public static void main(String[] args) {
	 Bikes b1=new Bikes();
	 b1.duke();
	 b1.r15();
	 b1.rr();
	 b1.interceptor();

	}

}
