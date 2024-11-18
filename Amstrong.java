import java.util.Scanner; 
public class Amstrong {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the your number:");
		int a=obj.nextInt();
		
		int i=0,j,tot=0,b;
		b=a;
		while(b>i)		{
			j=b%10;
			tot=(j*j*j)+tot;
			b=b/10;
		}
		if(a==tot) {
			System.out.println("its amstrong number:"+a);
		}
		else {
			System.out.println("its not amstrong number:"+a);
			
		}
		
		

	}

}
