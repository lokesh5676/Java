import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=obj.nextInt();
		if(a%2==0)
		{
			System.out.println("this even number:"+a);
		}
		if(a%2==1) {
		System.out.println("this is odd number:"+a);
		}
		// TODO Auto-generated method stub

	}

}
