import java.util.Scanner;

public class Traingle54321 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows :");
		int number=sc.nextInt();
		
		for(int i=number;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(number-j+1);
			 System.out.println();
			
		}
		

	}

}
