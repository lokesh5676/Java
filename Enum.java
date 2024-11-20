import java.util.Scanner;



public class Enum {
	enum courses
	{
		
		JAVA,AI,ML
	}
	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
		System.out.println("enter youyr course:");
		String enums=s.nextLine();
		
		courses lang=courses.valueOf(enums);
		
		switch(lang)
		{
		case JAVA:
			System.out.println("your select java");
			break;
		case AI:
			System.out.println("your select AI");
			break;
		case ML:
			System.out.println("your select ML");
			break;
		default:
			System.out.println("your select wrong input");
			break;
		// TODO Auto-generated method stub

	}
	}

}
