import java.util.Scanner;

public class Sqr {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number:");
		int i=obj.nextInt()	;
	int squaroot=(int) Math.sqrt(i);
      int  square=squaroot*squaroot;
      if(square==i)
      {
    	  System.out.println(i+" this value is squre value  and  squaroot of this value "+squaroot);
      }
      else
      {
    	  System.out.println(i+" this value is   not squre value ");
      }
	}

}
