package DAY_6;
interface Vechile{
	void vec();
}
interface Musicsystem{
	void mus();
}
interface Gps extends Vechile,Musicsystem{
	void gps();
}
public class engine implements Gps{
	public void vec(){
		System.out.println("it is a bmw vrchile");
	}
	public void mus(){
		System.out.println("it has a good music system");
	}
	public void gps() {
		System.out.println("it has gps");
		
		
		
	}
	

	public static void main(String[] args) {
		engine e1=new engine();
		e1.vec();
		e1.mus();
		e1.gps();
		// TODO Auto-generated method stub
		

	}

}
