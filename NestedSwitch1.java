import java.util.Scanner;
public class NestedSwitch1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your actor name:");
		String actor=obj.nextLine();
		switch(actor)
		{
		case "vijay":
			System.out.println("1.Thuppakki "+"2.Theri"+" 3.Mersal "+"4.Kaavalan "+"5.Sura");
			System.out.println("Enter the  your favourite movie above the list: ");
			System.out.println();
			String Movies=obj.nextLine();
		switch(Movies)
		{
		case "Thuppakki":
			System.out.println("Thuppakki is block buster mobvie");
			break;
		case "Theri":
			System.out.println("Theri is block buster mobvie");
			break;
		case "Mersal":
			System.out.println("Mersal is block buster mobvie");
			break;
		case "Kaavalan":
			System.out.println("Kaavalan is utter flop mobvie");
			break;
		case "Sura":
			System.out.println("Suraa is utter flop mobvie");
			break;
			default:
				System.out.println(" Enter the movie first letter with captiol ans enter the movie only in above list ");
		
		}
		break;
		
		case "kamal":
			System.out.println("1.vikram "+" 2.viswaroobam"+" 3.virumandi"+"4. indian2"+" 5.viswaroobam2");
			System.out.println("Enter the  your favourite movie above the list: ");
			System.out.println();
			String Movies1=obj.nextLine();
		switch(Movies1)
		{
		case "Vikram":
			System.out.println("Vikram is block buster mobvie");
			break;
		case "Viswaroobam":
			System.out.println("Viswaroobam is block buster mobvie");
			break;
		case "Virumandi":
			System.out.println("Virumandi is block buster mobvie");
			break;
		case "Indian2":
			System.out.println("Indian2 is utter flop mobvie");
			break;
		case "Viswaroobam2":
			System.out.println("Viswaroobam is utter flop mobvie");
			break;
		default:
			System.out.println(" Enter the movie first letter with captiol ans enter the movie only in above list ");
	
			
		}
		break;
		
		case "rajini":
			System.out.println("1.Enthiran "+"2. 2.0"+" 3.Jailer"+" 4.Kochadaiyan"+"5. Annaththa");
			System.out.println("Enter the  your favourite movie above the list: ");
			System.out.println();
			String Movies2=obj.nextLine();
		switch(Movies2)
		{
		case "Enthiran":
			System.out.println("Enthiran is block buster mobvie");
			break;
		case "2.0":
			System.out.println("2.0 is block buster mobvie");
			break;
		case "Jailer":
			System.out.println("Jailer is block buster mobvie");
			break;
		case "Kochadaiyan":
			System.out.println("Kochadaiyan is utter flop mobvie");
			break;
		case "Annaththa":
			System.out.println("Annaththa is  flop mobvie");
			break;
		default:
			System.out.println(" Enter the movie first letter with captiol ans enter the movie only in above list ");
	
		
		}
		break;
		
	}
	}

}
