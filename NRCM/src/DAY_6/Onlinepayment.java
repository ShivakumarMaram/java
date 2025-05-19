package DAY_6;
interface  Paytm {
	void pay();
}
interface Gpay{
	void payment();
}
class Phonepay{
	void blnc(){
		System.out.println("phoneoay is an inddian payment app");
	}
	
}

public class Onlinepayment extends Phonepay implements Paytm,Gpay {
	public void pay() {
		System.out.println("paytm gives rewards on each payment");
	}
	public void payment() {
		System.out.println("gpay belongs to google");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onlinepayment o1=new Onlinepayment();
		o1.pay();
		o1.payment();
		o1.blnc();
	}

}
