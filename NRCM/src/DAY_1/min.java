package DAY_1;

public class min {
	public static void main (String[] args) {
		int arr[]= {4,2,5,7,1};
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min:"+min);
	}
   
}
