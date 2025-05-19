package DAY_1;

public class strings {
	
	public static void main(String[] args) {
		
		String s1="queen";
		String s2="queen";
		String s3=new String ("queen");
		String s4=new String ("queen");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s4));
	}
	
}
