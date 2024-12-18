import java.util.Scanner;

public class ThreadTask2Average extends Thread {
	public void run()
	{
		float sum=0,avg=0;
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the Array:");
		float[] arr=new float[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			sum=arr[i]+sum;
		}
		avg=sum/arr.length;
		System.out.println(avg);
	}
	

	public static void main(String[] args) {
		ThreadTask2Average t2=new ThreadTask2Average();
		t2.start();
	

	}

}
