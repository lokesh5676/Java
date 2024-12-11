
public class AverageofArray {

	public static void main(String[] args) {
		int sum=0;
		int arr[]= {2,4,6,7};
		float average;
		int a=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		average=sum/a;
		System.out.println("The average of arr:"+average);
		

	}

}
