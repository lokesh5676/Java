import java.util.Arrays;

public class Tocopy {

public static void main(String[] args) {
     
	int arr[]= {2,3,4,5,6};
	int arr1[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr1[i]=arr[i];
	
	}
	System.out.println( "new array:"+Arrays.toString(arr1));

	
	
	
	
}
}
