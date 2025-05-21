package DAY_7;
import java.util.*;


	public class objectt{

		public static void main(String[] args) {
			List<Object> l1=new ArrayList<Object>();
			l1.add(12);
			l1.add(34);
			l1.add("hi");
			List<Object> l2=new ArrayList<Object>(l1);
			l2.add(74);
			l2.add(56);
			l2.add(84);
			l2.add(null);
			System.out.println(l2);
			

		}

	}


