class Vehicle
{
	String make;
	String model;
	int year;
}
class Car extends Vehicle
{
	int trunksize;
	   public  void getdetails (String m,String mo,int y,int t)
	   {
		 make=m;
		 model=mo;
		 year=y;
		 trunksize=t;
	   }
	   public void displaycar()
	   {
		   System.out.println("car make: "+make+"\n"+make+"car model: "+model+"\n"+"year: "+year+"\n"+"Trunksize: "+trunksize);
	   }
}
class Truck extends Vehicle
{
	int playoldCapacity;
	   public  void getdetailsTruck(String m,String mo,int y,int p)
	   {
		 make=m;
		 model=mo;
		 year=y;
		 playoldCapacity=p;
	   }
	   public void displayTruck()
	   {
		   System.out.println("Truck make: "+make+"\n"+make+"Truck model: "+model+"\n"+"year: "+year+"\n"+" playoldCapacity: "+ playoldCapacity);
	   }
}

public class TaskInheritance1 extends Truck{

	public static void main(String[] args) {
	Car c=new Car();
	  c.getdetails("petrol", "RolsRoyel", 2004, 21);
	  c.displaycar();
		TaskInheritance1 t1=new  TaskInheritance1();
        t1.getdetailsTruck("petrol", "Mahindra Furio 17 BS6", 2003, 1500);
		t1.displayTruck();
	
		
		
		

	}

}
