
public class SumofArray {
	public static void main(String[] args) {
		int sum=0;
		
		int array[]= {2,3,4,5};
		for(int i=0;i<array.length;i++)
		{
			sum=array[i]+sum;
			
		}
		System.out.println(" The sum of array :"+sum);

	}

}
