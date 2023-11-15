import java.util.*;
public class Elements
{
    void display(int n,int atm[],double wgt[],String name[],String sym[],String type[])
    {
        for(int j=0;j<n;j++)
        {
        if(wgt[j]>15)
        {
            System.out.println("atm no:"+atm[j]);
            System.out.println("name:"+name[j]);
            System.out.println("Symbol:"+sym[j]);
            System.out.println("class:"+type[j]);
            System.out.println("atm wgt:"+wgt[j]);
        }
        }
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    Elements el=new Elements();
		System.out.println("Enter number of elements to be entered:");
		int n=sc.nextInt();
		int atm[]=new int[n];
		double wgt[]=new double[n];
		String name[]=new String[n];
		String sym[]=new String[n];
		String type[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    System.out.println("Enter atm no.");
		    atm[i]=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter elemt name:");
		    name[i]=sc.nextLine();
		    System.out.println("Enter Symbol:");
		    sym[i]=sc.nextLine();
		    System.out.println("Enter type:");
		    type[i]=sc.nextLine();
		    System.out.println("Enter atm wgt.");
		    wgt[i]=sc.nextDouble();
		}
		el.display(n,atm,wgt,name,sym,type);
	}
}
