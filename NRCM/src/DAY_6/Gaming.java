package DAY_6;
interface Pubg{
	void tdm();
}
interface Freefire{
	void rank();
}
class Templerun {
	void coins() {
		System.out.println("temple run is a never ending game");
	}
}
class GTA extends Templerun implements Pubg,Freefire{
	void guns() {
		System.out.println("GTA is a gangstar game");
	}
}
public class Gaming extends GTA {
	public void tdm() {
		System.out.println("pubg is baned in india for few months");
	}
	public void rank() {
		System.out.println("freefire is same like pubg");
	}
	

	public static void main(String[] args) {
		Gaming g1=new Gaming();
		g1.tdm();
		g1.rank();
		g1.coins();
		g1.guns();
		// TODO Auto-generated method stub

	}

}
