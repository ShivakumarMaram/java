package DAY_6;
interface Landrover{
	void defender();
	
}
interface Mahindra{
	void xuv700();
}
interface Thar {
	void thar4x4();
}
interface Tata extends Landrover,Mahindra,Thar
{
	void nexon();
}
public class SUVcars implements Tata {
	public  void defender() {
		System.out.println("defender belongs to landrover");
	}
	public void xuv700() {
		System.out.println("xuv700 belongs to mahindra");
	}
	public void thar4x4() {
		System.out.println("thar belongs to mahinddra");
	}
	public void nexon() {
		System.out.println("nexon belongs to tata");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUVcars s1=new SUVcars ();
		s1.defender();
		s1.xuv700();
		s1.thar4x4();
		s1.nexon();


	}

}
