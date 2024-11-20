import java.util.Scanner;
public class EnumJava {

	enum courses
	{
		
		JAVA,AI,ML
	}
	public static void main(String[] args) {
		courses ss=courses.JAVA;
		System.out.println(ss);
		System.out.println(ss.ordinal());
	courses [] arr=courses.values();
	for(courses s:arr)
	{
		System.out.println(s);
	}
		}
		

	}


