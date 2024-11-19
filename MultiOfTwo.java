import java.util.Scanner;
public class MultiOfTwo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=obj.nextInt()	;
		for( int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("multplication of 2 between 2 to "+n+" :"+i);
			}
			
		}

     
	}

}
