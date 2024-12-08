class   Vehicle1
{
	String model;
	int year;
	String fueltype;
	int maximumspeed;
	
Vehicle1(String model,int year,String fueltype,int maximumspeed)
{
	this.model=model;
	this.year=year;
	this.fueltype=fueltype;
	this.maximumspeed=maximumspeed;
}
void display()
{
	System.out.println("Model :"+model+"\n"+"Year :"+year+"\n"+"FuelType :"+fueltype+"\n"+"MaximumSpeed :"+maximumspeed);
}
}

class Truck1 extends Vehicle1
{
	Truck1(String model,int year,String fueltype,int maximumspeed)
	{
		super( model,year,fueltype,maximumspeed);
		super.display();
	}
	void fueldistance(int litre)
	{
		System.out.println("Truck distance by Petrol :"+30*litre+" kilometer");
	}
	
}
class Car1 extends Vehicle1
{
	Car1(String model,int year,String fueltype,int maximumspeed)
	{
		super(model,year,fueltype,maximumspeed);
		super.display();
	}
	void fueldistance(int litre)
	{
		System.out.println("car distance by Petrol :"+40*litre+"kilometer");
	}
	void chargedistance(int chargePercentage)
	{
		System.out.println("car distance by charger :"+35*chargePercentage+" kilometer");
	}
	
}
class MotorCycle extends Vehicle1
{
	MotorCycle(String model,int year,String fueltype,int maximumspeed)
	{
		super(model,year,fueltype,maximumspeed);
		super.display();
	}
	void fueldistance(int litre)
	{
		System.out.println("Motorcycler distance by Petrol :"+60*litre+"kilometer");
	}
	void chargedistance(int chargePercentage)
	{
		System.out.println("MotorCycle distance by charger :"+0.9*chargePercentage+" kilometer");
	}
}
public class InheritanceTest2 {

	public static void main(String[] args) {
		MotorCycle m1=new MotorCycle("ktm",2023,"petrol",122);
m1.fueldistance(5);
m1.chargedistance(50);
	}

}
