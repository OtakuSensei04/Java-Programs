import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    if(i%10==0)
		    {
		        System.out.print(i+"\t");;
		    System.out.println(" ");
		    }
		    else
		    {
		        System.out.print(i+"\t");;
		    }
		}
	}
}
