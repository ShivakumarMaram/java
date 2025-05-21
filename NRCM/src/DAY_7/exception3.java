package DAY_7;

public class exception3 {
	static void add(int a,int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("MG");
		}
		int c=a/b;
		System.out.println(c);
	}
public static void main(String[] args) {
	try {
		add(10,0);
	}catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}finally {
		System.out.println("coverd all exceptions");
	}
}
}
