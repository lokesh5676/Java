
public class ThreadTask1OddEven extends Thread{

	 public void run()
	 {  
		 for(int i=0;i<=20;i++)
		 {
			 if(i%2==0)
			 {
				 System.out.println(i+" This is even number");
			 }
			 else
			 {
				 System.out.println(i+" This is odd number"); 
			 }
		 }
		 
	 }
	public static void main(String[] args) {
		ThreadTask1OddEven e1= new ThreadTask1OddEven();
		e1.start();
		
		
		

	}

}
