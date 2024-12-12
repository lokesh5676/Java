import java.util.Scanner;

public class PatternInArraytask {
	
	public void leftpattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ")	;		}
			System.out.println();
		}
		System.out.println();
		
	}
	public void Rightpattern(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for(int k=0;k<n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
				}
			System.out.println();
		}
		
	}
	public void Permidpattern(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for(int k=0;k<n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
				}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		PatternInArraytask p= new PatternInArraytask();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int n=sc.nextInt();
		p.leftpattern(n);
		p.Rightpattern(n);
		p.Permidpattern(n);

	}

}
