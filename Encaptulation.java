package AllProgram;

public class Encaptulation {
private  int rollno;
private String name;
private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
	     return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
	     return age;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
	     return rollno;
	}
	
	
	public static void main(String[] args) {
		Encaptulation e=new Encaptulation();
		e.setAge(32);
		e.setName("lokesh");
		e.setRollno(123);
		System.out.println("Name: "+e.getName());
		System.out.println("Age: "+e.getAge());
		System.out.println("Rollno: "+e.getRollno());


	}

}
