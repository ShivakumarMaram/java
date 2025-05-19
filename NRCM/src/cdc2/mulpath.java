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
class duke extends bike{
	void price() {
		System.out.println("price 2.30l");
	}
	
}
class pulser extends bike{
	void model(){
		System.out.println("n150");
		
	}
}

public class mulpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        exhoust h1=new exhoust() ;
        interseptor i1=new interseptor();
        duke d1=new duke();
        pulser p1=new pulser();
       
        i1.CC();
        i1.speed();
     
        
	}

}




