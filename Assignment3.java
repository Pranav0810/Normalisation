import java.lang.Math;
import java.util.*;
public class Assignment3 {
	public static void main(String args[])
	{
		System.out.println("This is Assignment 3");
		
		  int total=0,sum=0,zero=0,one=0,two=0,three=0,four=0,five=0,six=0,x=0,b=0,y=0;
   	  int runs[]=new int[150];
   	  for(int j=0;j<5;j++)
   	  {
   		  System.out.println("Enter the number of balls played by each batsmen" +(j+1));
   		   Scanner sc = new Scanner(System.in);
           b = sc.nextInt();
   	 	  total=b+total;
   		  for(int i=0;i<b;i++)
   	  {	y++;
   		  runs[y] = (int) (Math.random() * 7) + 0;
   	  }
   	  }
   	  
   	 for(int i=0;i<y;i++)
	  {
		  sum=sum+runs[i];
		  if(runs[i]==0)
			  zero++;
		  if(runs[i]==1)
			  one++;
		  if(runs[i]==2)
			  two++;
		  if(runs[i]==3)
			  three++;
		  if(runs[i]==4)
			  four++;
		  if(runs[i]==5)
			  five++;
		  if(runs[i]==6)
			  six++;

	  }
   	 
   	 for(int i=0;i<y;i++)
   	 {
   		 System.out.print(runs[i]+" ");
   	 }
     float average=(float)sum/5;
     float rate=(float)sum*100/total;
	  System.out.println("Total suns scored are:"+ sum);
		  System.out.println("Zeroes     : " + zero);
		        System.out.println("Ones       : " + one);
		        System.out.println("Twos       : " + two);
		        System.out.println("Threes     : " + three);
		        System.out.println("Fours      : " + four);
		        System.out.println("Sixes      : " + six);
		        System.out.println("Average is      : " + average);
		        System.out.println("Strik rate is: "+rate);
	}
}
