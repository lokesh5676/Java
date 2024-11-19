import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String str1="";
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=obj.nextLine();
		int size=str.length();
		int size1=size-1;
		for( int i=size1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		
			
		}
		
		if(str.equals(str1))
			
		{
			System.out.println("this is polindrome:"+str);
		}
		else {
			System.out.println("this is not polindrome:"+str);
		}
		
		
		
	 

	}

}
