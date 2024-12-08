class Employee {
	String name;
	String address;
	int salary;
	String jobtitle;
	Employee(String name,String address,int salary,String jobtitle){
		
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.jobtitle=jobtitle;
		
	}
	void display()
	{
		System.out.println("Name :"+name+"\n"+"Adress :"+address+"\n"+"Salary :"+salary+"\n"+"Jobtitle :"+jobtitle);
	}
	
}
class Manager extends Employee
{
	Manager(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
		super.display();
	}
	
	void bonus( int salary,int bonus)
	{
		System.out.println("Bonus:"+((salary/100)*bonus));
	}
	void performance(String Performance)
	{
		System.out.println("Manager Performance:"+Performance);
	}
	void Projects(String Project)
	{
		System.out.println("Manager Project:"+Project);
		System.out.println();
	}
}
class Developer extends Employee
{
	Developer(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
		super.display();
	}
	void bonus(int salary,int bonus)
	{
		System.out.println("Bonus:"+((salary/100)*bonus));
	}
	void performance(String Performance)
	{
		System.out.println("Developer Performance:"+Performance);
	}
	void Projects(String Project)
	{
		System.out.println("Developer Project:"+Project);
		System.out.println();
	}
}
class Programmer extends Employee
{
	Programmer(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
		super.display();
		
	}
	void bonus(int salary,int bonus)
	{
		System.out.println("Programmer:"+((salary/100)*bonus));
	}
	void performance(String Performance)
	{
		System.out.println("Programme Performance:"+Performance);
	}
	void Projects(String Project)
	{
		System.out.println("Programme Project:"+Project);
		System.out.println();
	
}
	
}
public class InheritanceTest1 
{
	public static void main(String[] args)
	{
		Manager m1=new Manager("LOKESH","134,MANGALAM",12000,"MANAGER");
		m1.bonus(12000,50);
		m1.performance("GOOD");
		m1. Projects("LIBRARY MANAGEMENT SYSTEM");

		Developer d1=new Developer("THIRU ","134,CHENNAI",10000,"DEVELOPER");
		d1.bonus(10000,40);
		d1.performance("GOOD");
		d1. Projects("LIBRARY MANAGEMENT SYSTEM");
	

		Programmer p1=new Programmer("NITHISH","134,PORKKUNAM",9000,"PROGRAMMER");
		p1.bonus(9000,30);
		p1.performance("GOOD");
		p1. Projects("LIBRARY MANAGEMENT SYSTEM");
	
	

	}
}