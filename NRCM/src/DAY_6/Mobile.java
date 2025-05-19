package DAY_6;
interface Samsung{
	void s23();
}
class Vivo{
	public void y20() {
		System.out.println("vivo is from chaina");
	}

}
class Oppo extends Vivo implements Samsung{
	public void s23() {
		System.out.println("s23 belongs to samsung");
	}
}
class Redmi {
	public void note10() {
		System.out.println("poco belongs to redmi");
	}
}
public class Mobile extends Redmi{
	public void nord() {
		System.out.println("oneplus belongs to oppo");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile();
		Oppo o1=new Oppo();
		m1.note10();
		m1.nord();
		o1.s23();
		o1.y20();
		

	}

}
