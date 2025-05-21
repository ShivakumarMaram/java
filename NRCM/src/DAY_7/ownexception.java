package DAY_7;

class cheppanuException extends Exception{
	public cheppanuException(String message) {
		super(message);
	}
}

public class ownexception {
	public static void  ageCheck(int age) throws cheppanuException{
		
	
	if(age>18) {
		throw new cheppanuException("nenu cheppanu");
	}else {
		System.out.println("na age 18 below bro");
	}
}

	public static void main(String[] args) {
		try {
			ageCheck(12);
		}catch(cheppanuException e) {
		System.out.println(e.getMessage());
		

	}finally {
		System.out.println("coding");
	}

	}
}
