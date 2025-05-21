package DAY_8;
import java.util.*;
public class Prior {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(12);
		q1.offer(43);
		q1.offer(76);
		q1.offer(76);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);

	}

}
