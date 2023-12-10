import java.util.*;
public class Main
{
    void dupli(int[] a,int n)
    {
        boolean bol=true;
        int k=0,l=0,t=-1,f=0,zero=0;
        int b[]=new int[n];
        int c[]=new int[n];
       // for(l=0;l<n;l++)
      //  b[l];
       // for(l=0;l<n;l++)
      //  c[l];
        for(k=0;k<n;k++)
        {
            bol=true;
            for(l=0;l<n;l++)
            {
                if(a[k]==0)
                {
                    zero+=1;
                    if(zero!=1)
                    {
                        if(a[k]==b[l])
                        {
                           // System.out.println("Not Zero Hi "+k+"Not Zero Hi "+l);
                             bol=false;
                    
                        }
                    }
                    else if(zero==1)
                    {
                       // System.out.println("Zero Hi "+k+"Zero Hi "+l);
                        bol=true;
                        break;
                    }
                }
              else if(a[k]==b[l])
               {
                  // System.out.println("Hi "+k+"Hi "+l);
                    bol=false;
                    break;
               }
            }
            while(bol)
               {
                 //  System.out.println("Hello "+k+"Hello "+l);
                   t+=1;
                   b[t]=a[k];
                   
                   for(f=0;f<n;f++)
                   {
                      if(b[t]==a[f])
                      {
                          c[t]+=1;
                       }
                    }
                    bol=false;
               }
               
            
            
        }
        System.out.println("Duplicated elements and counts: ");
        for(l=0;l<=t;l++)
        {
            System.out.println(b[l]+" = "+c[l]);
        }
    }
    
	public static void main(String[] args)
	{
	    Main obj=new Main();
	    int i=0,j=0,t=0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of integer array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter integer array:");
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		obj.dupli(a,n);
	}
}
