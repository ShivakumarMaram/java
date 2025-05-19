package cdc2;
class bike{
	void speed() {
		System.out.println("120kmph");
	}
}
class interseptor extends bike{
	void CC() {
		System.out.println("650cc");
	}
}
class exhoust extends interseptor{
	void RE() {
		System.out.println("twin exhoust");
	}
	
}

public class inh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        exhoust h1=new exhoust() ;
        h1.speed();
        h1.CC();
        h1.RE();
     
        
	}

}
