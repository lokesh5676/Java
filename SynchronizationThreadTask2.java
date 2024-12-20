

class Stack extends Thread
{
int stacks=5;
int product;
	public Stack( int product)
	{
	        this.product=product;	
	}
	public synchronized void product()
	{
		String name=currentThread().getName();
	
		if(stacks>=product)	
		{	
			System.out.println(name+" the product saled:"+product);
			stacks-=product;
		}
			else
		{
			System.out.println(name+" sorry product was un available");	
		}	
	}
	public void run()
	{
		product();
	}
}
public class SynchronizationThreadTask2 {

	public static void main(String[] args) {
		Stack s1=new Stack(3);
		
		Thread t1 =new Thread(s1);
		t1.setName("lokesh");
		Thread t2 =new Thread(s1);
		t2.setPriority(10);
		t2.setName("Thiru");
		
		t1.start();
		t2.start();
	
		
		
		

	}

}
