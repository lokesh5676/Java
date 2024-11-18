import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the your tables:");
		
		int a=obj.nextInt();
	for(i=1;i<=10;i++)
	{
	  System.out.println(i+"*"+a+"="+i*a);
	}

	}

}
