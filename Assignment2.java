import java.lang.Math;
public class Assignment2 {
          public static void main(String args[])
          {
        	  System.out.println("This is Assignment 2");
        	  
        	  int overs=5;
        	  int balls=30;
        	  int runs[]=new int[30];
        	  
        	  for(int i=0;i<runs.length;i++)
        	  {
        		  runs[i] = (int) (Math.random() * 7) + 0;
        	  }
        	  
        	  for(int i=0;i<runs.length;i++)
        	  {
        		  System.out.print(runs[i]+" ");
        	  }
        	  int sum=0,zero=0,one=0,two=0,three=0,four=0,five=0,six=0;
        	  for(int i=0;i<runs.length;i++)
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
        	  float rate=(float)sum*100/30;
        	  
        	  System.out.println("Total suns scored are:"+ sum);
        		  System.out.println("Zeroes     : " + zero);
        		        System.out.println("Ones       : " + one);
        		        System.out.println("Twos       : " + two);
        		        System.out.println("Threes     : " + three);
        		        System.out.println("Fours      : " + four);
        		        System.out.println("Sixes      : " + six);
        		        System.out.println("Strike rate is      : " + rate);
          }
}
