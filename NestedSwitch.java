import java.util.Scanner;
public class NestedSwitch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter your technical langauge:");
		String course=sc.nextLine();
		switch(course)
		{
		case "python":
			System.out.println("python is simple coding language");
			break;
		case "java":
			System.out.println("java is powerfull  coding language");
			int version=sc.nextInt();
			switch(version)
			
			{
			case 6:
				System.out.println("that is old version");
				break;
			case 7:
				System.out.println("that is between  version");
				break;
			case 8:
				System.out.println("that is new  version");
				break;
			}
			break;
		case "c++":
			System.out.println(" your select c++ vesrion then what version you need ");
			int version1=sc.nextInt();
			switch(version1)
			{
			
		case 9:
			System.out.println("that is old version");
			break;
		case 10:
			System.out.println("that is between  version");
			break;
		case 11:
			System.out.println("that is new  version");
			break;
			
	
		}
			break;

	}
	}
}


