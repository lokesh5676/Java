import java.util.Scanner;
public class Triangle111 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows :");
		int number=sc.nextInt();
		int a=1;
		for(int i=number;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(a);
			 System.out.println();
			 a++;
		}
}
}	
