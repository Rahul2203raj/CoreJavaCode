package world;     //Its my package used to store dot class file.
import java.util.*;  //its package used  to take iput from user.
public class Fibbo
{         
	 public static void main(String []args)   //its main function
	 {   	 
	    int a=-1,b=1;
	   Scanner ref= new Scanner(System.in);
		 System.out.print("enter the no."); 
     		 int n=ref.nextInt();
		 for(int i=0;i<n;i++)
		 {	int c=a+b;
	        
		  System.out.print(+c+",");
		  a=b;
		  b=c;
		  }
	 }
}
