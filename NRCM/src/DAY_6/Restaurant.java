package DAY_6;
interface Tables{
	void chairs();
}
interface Food {
	void order();
}
interface Waiter{
	void water();
}
class Reception implements Tables,Food,Waiter{
	public void biryani() {
		
	System.out.println("almost every restaurant serves biryani");
}
}
interface Parking{
	void valet();
}
public class Restaurante extends Reception implements Parking {
	public void chairs() {
		
	System.out.println("restaurants are good place to eat");
	}
	public void order() {System.out.println("almost every restaurant will have customers");
	
		
	}
	public void water() {
		System.out.println("waiter will take our order");

	}
	public void valet() {
		System.out.println("every restaurant has a valet parking");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante r1=new Restaurante ();
		r1.chairs();
		r1.order();
		r1.water();
		r1.biryani();
		r1.valet();
		
		

	}

}
