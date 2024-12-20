


		class Bank extends Thread{
		    int available_balance=10000;
		    int withdrawl_balance;
		    
		    Bank(int withdrawl_balance){
		        this.withdrawl_balance=withdrawl_balance;
		    }
		    
		    public synchronized void withdraw(){ // method is  synchronized

		        String thread_name=currentThread().getName();
		        if(withdrawl_balance<=available_balance){
		            System.out.println(thread_name+" withdraw money:"+""+withdrawl_balance);
		            available_balance-=withdrawl_balance;
		        }else{
		            System.out.println(thread_name+" your account has Insufficient balance");
		        }
		    }
		    
		    public void run(){
		        withdraw();
		    }
		    
		   
		    
		}

		public class SynchronizationThreadTask1
		{
		    public static void main(String[] args) {
		        Bank b1=new Bank(10000); // has one lock

		        Thread t1=new Thread(b1);
		        t1.setName("Shubham");
		        Thread t2=new Thread(b1);
		        t2.setName("Vikram");
		        t1.start();
		        t2.start();
		        
		     //   Bank b2=new Bank(10000);// has one lock

		     //   Thread t3=new Thread(b2);
		       // Thread t4=new Thread(b2);
		      ///  t3.setName("Inder");
		      ///  t4.setName("Kamlesh");
		       //.start();
		       /// t4.start();
		    }
		
		

	}


