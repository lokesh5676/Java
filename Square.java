import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=obj.nextInt()	;	
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				if((i*i)==n)
				{
					System.out.println("the square of number"+n+":"+i);
				}
			}
		}

	}

}
