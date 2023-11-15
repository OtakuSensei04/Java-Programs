import java.util.*;
public class Guessing
{
    void guess(int a[],int n)
    {
        int r=(int)(Math.random()*10);
        for(int j=0;j<n;j++)
        {
            if(a[j]==r)
            {
                System.out.println("guess of player "+(j+1)+" is right= "+r);
            }
            else
            System.out.println("guess of player "+(j+1)+" is wrong,the guess= "+a[j]);
            
        }
        System.out.println("The correct number is= "+r);
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    Guessing gs=new Guessing();
		System.out.println("Enter number of players:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		System.out.println("Type True to start and false to end game:");
		boolean b=sc.nextBoolean();
		while(b)
		{   i=0;
		    while(i<n)
		    {
		    System.out.println("Enter guess of player "+(i+1));
		    a[i]=sc.nextInt();
		    i++;
		    }
		    gs.guess(a,n);
		    System.out.println("Type True to continue and false to end game:");
		 b=sc.nextBoolean();
		}
	    System.out.println("Thank you for playing ");
	}
}
