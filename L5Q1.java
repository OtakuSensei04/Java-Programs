import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of voters:");
		int n=sc.nextInt();
		int[] votes=new int[n];
		int[] spoilt=new int[1];
		for(int i=0;i<5;i++)
		{
		 
		    
		    votes[i]=0;
		   
		    
		}
		spoilt[0]=0;
		for(int i=0;i<n;i++)
		{
		    System.out.println("Enter contestant no:-");
		    int x=sc.nextInt();
		    if((0<x)&&(x<6))
		    votes[x-1]=votes[x-1]+1;
		    else
		    spoilt[0]=spoilt[0]+1;
		}
		for(int i=0;i<5;i++)
		System.out.println("Number of votes for "+(i+1)+":- "+votes[i]);
		System.out.println("Number of spoilt votes "+spoilt[0]);
	}
}
