import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DateAndTimeYask1 {
	void display()
	{
		
	}

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
System.out.println("Enter the date:");
String m1=sc.next();
System.out.println("Enter the month:");
String m2=sc.next();
System.out.println("Enter the year:");
String m3=sc.next();
int  dd=Integer.parseInt(m1);
int mm=Integer.parseInt(m2);
int yyyy=Integer.parseInt(m3);

String datestr=(dd+4)+"/"+(mm+4)+"/"+(yyyy+4);


		 SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		
		
	 		
		 try
		 {
			
			 Date date=sdf.parse(datestr);
			 System.out.println("INPUT DATE:"+sdf.format(date));

		 } catch(Exception e)
		 {
			 System.out.println("Invalid format");
		 }
		

	}

}
