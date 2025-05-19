package DAY_1;

public class firstname {
	private String firstName;
	private String lastName;
	private String emailId;
	private Long phoneNumber;
	
	public void setfirstName(String fn){
	    firstName=fn; 
	    }
	
	public void setlastName(String ln) {
		lastName=ln;
	}
	public void setemailId(String em) {
		emailId=em;
	}
	public void setphoneNumber(Long pn) {
		phoneNumber=pn;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getemailId() {
		return emailId;
	}
	public Long getphoneNumber() {
		return phoneNumber;
	}
	
	public static void main(String[] args) {
		firstname a1=new firstname();
		a1.setfirstName("vamshi");
		a1.setlastName("krishna");
		a1.setemailId("m.shivakumar123 ");
		a1.setphoneNumber(6300218510L);
		System.out.println(a1.getfirstName() );
		System.out.println(a1.getlastName());
		System.out.println(a1.getemailId());
		System.out.println(a1.getphoneNumber());
		
		
		
		
	
		
	}
	
	
	
	
	
	


}
