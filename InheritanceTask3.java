class GymMemberberShip
{
	String membername;
    String membershiptype;
    int duration;
    public GymMemberberShip(String membername,String membershiptype , int duration)
    {
    	this. membername= membername;
       this.membershiptype=membershiptype;
       this.duration=duration;
    	
    }
}
class PremiumMemberShip extends GymMemberberShip
{
   String personaltrainer;
   String spa;
   public PremiumMemberShip(String membername,String membershiptype , int duration, String personaltrainer, String spa)
   {
	   super(membername,membershiptype,duration);
	   this.personaltrainer=personaltrainer;
	   this.spa=spa;
	   
   }public void dsiplay()
   {
	   System.out.println("MemberName: "+membername+"\n"+"membershiptype: "+membershiptype+"\n"+"duration: "+duration+"HOURS"+"\n"+"personaltrainer: "+personaltrainer+"\n"+"SPA: "+spa);
   }
   
   public void Calculatemember(String membertypes,int amount)
   {
    switch(membertypes)
    {
    case "month":
    	  System.out.println(amount-(amount/100)*2.5);
    	  break;
    case "year":
    	  System.out.println(amount-(amount/100)*5);
    	  break;
    	  default:
    		  System.out.println("enter the month or year");
    	
    }
    

}
}
public class InheritanceTask3 {

	public static void main(String[] args) {
		PremiumMemberShip p=new PremiumMemberShip("Lokesh","monthly",2,"Thiru","Available");
		
		p.dsiplay();
		p.Calculatemember("month", 20000);
		
	}
		

}
//