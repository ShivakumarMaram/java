package DAY_6;
interface TV{
	void remote();
}
class Fan implements TV{
	public void air() {
		System.out.println("fan gives coo, air");
	}

 public void remote() {
	System.out.println("we use remote to control tv");
}
}
interface AC{
	void wind();
}
class Bed implements AC{
	public void blanket() {
		System.out.println("beds will be in bedroom");
	}


public void wind() {
	System.out.println("ac gives cool air");
}
}
interface Cooler{
	 void breeze();
}
public class Home implements Cooler{
	void food(){
		System.out.println("we cook food in kichen");
		}
 public void breeze() {
		System.out.println("cooler use water");
	}
public static void main(String[] args) {
		Home h1=new Home();
		Fan f1= new Fan();
		Bed b1=new Bed();
		f1.remote();
		f1.air();
		b1.wind();
		b1.blanket();
		h1.breeze();
		h1.food();
		
		
		// TODO Auto-generated method stub

	}

}
