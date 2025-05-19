package DAY_6;
interface Zomato{
	void pizza();
}
interface Swiggy extends Zomato{
	void biryani();
}

public class Fooddelivery implements Swiggy {
	public void pizza() {
		System.out.println("pizza is round");
	}
	public void biryani(){
		System.out.println("biryani is famous in hyderabad");
	}
public static  void main(String[] args) {
	Fooddelivery f1=new Fooddelivery();
	f1.pizza();
	f1.biryani();
}
}
