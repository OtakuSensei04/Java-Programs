import java.util.*;

  class Car
  {
       String Vehicle_id;
       float[] Cost;
       float Total=0;
       float Grand_total;
      
      void calc_total(String Vehicle_id,float[] Cost)
      {
          this.Vehicle_id=Vehicle_id;
          this.Cost=Cost;
          for(int j=0;j<3;j++)
          this.Total=this.Total+Cost[j];
      }
      void calc_grand_total()
      {
          this.Grand_total=this.Total-(this.Total*0.1f);
          
      }
      
  }

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no. of employees: ");
	    int n=sc.nextInt();
	    Car[] obj=new Car[n];
	    Main cr=new Main();
	     String Vehicle_id;
         float[] Cost;
        // float Total;
        // float Grand_total;
         int i=0,j=0;
	    for(i=0;i<n;i++)
	    {
	        obj[i]=new Car();
	        System.out.println("Enter Vehicle id: ");
	         sc.nextLine();
	        Vehicle_id=sc.nextLine();
	       
	        System.out.println("Enter Vehicle's base, exercise duty and sales tax: ");
	        Cost = new float[3];
	        for(j=0;j<3;j++)
	        {
	        Cost[j]=sc.nextFloat();
	        }
	        obj[i].calc_total(Vehicle_id,Cost);
	        obj[i].calc_grand_total();
	    }
	   
            int hh=cr.highest_grand_price(obj,n);
           // System.out.println("hh= "+hh);
          System.out.println("Highest Grand Total: "+obj[hh].Grand_total);
          System.out.println(" Vehicle id: "+obj[hh].Vehicle_id);
	        
	        System.out.println(" Vehicle's base, exercise duty and sales tax: ");
	        for(int p=0;p<3;p++)
	        {
	        System.out.println(obj[hh].Cost[p]);
	        }
      
    }
     int highest_grand_price(Car[] obj,int n)
      {
          
          int ff=0;
          float max=obj[0].Grand_total;
          for(int k=0;k<n-1;k++)
          {
              if(obj[k].Grand_total<obj[k+1].Grand_total)
              {
              max=obj[k+1].Grand_total;
              ff=k+1;
              }
          }
          return ff;
      }
}
