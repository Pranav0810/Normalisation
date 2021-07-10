import java.util.Scanner;

public class Assignment1 {
   public static void main(String args[])
   {
	   System.out.println("This is out Assignment 1");
	    double price=1.20;
	    double bill=0;
	    
	    System.out.println("Enter the number of units:");
	    Scanner sc=new Scanner(System.in);
	    int units=sc.nextInt();
	    if(units<100)
	    	bill=price*units;
	    else if(units<300)
	    {
	    	float x=units-100;
	    	bill=x*2+120;
	    }
	    else
	    {
	    	float y= units-100;
//	    	float z=0;
	    	float a=y-200;
	       
	    	bill=120+400+a*3;
	    }
	    
	    
	    System.out.println("The bill incurred is "+ bill);
	    
	    
	    
	    
	    
   }
}


