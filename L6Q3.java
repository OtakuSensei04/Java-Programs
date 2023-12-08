import java.util.*;

  class Purse
  {
      private int dirham;
      private int fills50;
      private int fills25;
      private int total;
      Purse()
      {
        dirham=0;
        fills50=0;
        fills25=0;
        total=0;
      }
      void add_dirham(int dirham)
      {
          total=total+dirham;
      }
      void remove_dirham(int dirham)
      {
          total=total-dirham;
      }
      void add_fills50(int fills50)
      {
          total=total+(int)((fills50*0.5));
      }
      void remove_fills50(int fills50)
      {
          total=total-(int)((fills50*0.5));
      }
      void add_fills25(int fills25)
      {
          total=total+(int)((fills25*0.25));
      }
      void remove_fills25(int fills25)
      {
          total=total-(int)((fills25*0.25));
      }
      void total_cash()
      {
          System.out.println("Amount after transaction: "+total);
      }
      
  }

public class PurseTester
{
	public static void main(String[] args) 
	{
	    boolean b=true;
	    Purse obj=new Purse();
	    Scanner sc=new Scanner(System.in);
	    
	    int n;
	    while(b)
	    {
	    System.out.println("Enter 1- To add dirhams:");
	    System.out.println("Enter 2- To remove dirhams:");
	    System.out.println("Enter 3- To add fills50:");
	    System.out.println("Enter 4- To remove fills50:");
	    System.out.println("Enter 5- To add fills25:");
	    System.out.println("Enter 6- To remove fills25:");
	    
	    int x=sc.nextInt();
	    switch(x)
	    {
	        case 1:
	            System.out.println("Enter amount of dirhams to add:");
	             n=sc.nextInt();
	            obj.add_dirham(n);
	           // obj.total_cash();
	            break;
	        case 2:
	            System.out.println("Enter amount of dirhams to remove:");
	             n=sc.nextInt();
	            obj.remove_dirham(n);
	          //  obj.total_cash();
	            break;
	        case 3:
	            System.out.println("Enter amount of fills50 to add:");
	             n=sc.nextInt();
	            obj.add_fills50(n);
	            //obj.total_cash();
	            break;
	        case 4:
	            System.out.println("Enter amount of fills50 to remove:");
	             n=sc.nextInt();
	            obj.remove_fills50(n);
	           // obj.total_cash();
	            break;
	        case 5:
	            System.out.println("Enter amount of fills25 to add:");
	             n=sc.nextInt();
	            obj.add_fills25(n);
	           // obj.total_cash();
	            break;
	        case 6:
	            System.out.println("Enter amount of fills25 to remove:");
	             n=sc.nextInt();
	            obj.remove_fills25(n);
	           // obj.total_cash();
	            break;
	            
	        default: System.out.println("Invalid Option");
	    }
	    System.out.println("Enter true to continue or false to end:");
	    b=sc.nextBoolean();
	}
	obj.total_cash();
}
    
}
