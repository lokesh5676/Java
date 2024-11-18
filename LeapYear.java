import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the year:");
		int a=obj.nextInt();
		if((a%400==0)||((a%4==0)&&(a%100!=0)))
		{
			System.out.println("its leap year:"+a);
		}
		else {
			System.out.println("its not leap year:"+a);
		}

	}

}
