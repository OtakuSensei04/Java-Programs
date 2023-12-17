import java.util.*;
interface Sortable
{
    public void sort(int[] a);
}
class BubbleSort implements Sortable
{
    public void sort(int[] a)
    {
        int t=0,i,j;
        int lbs=a.length;
        for( i=0;i<lbs;i++)
        {
            for( j=0;j<lbs-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Bubble sort:");
        for( i=0;i<lbs;i++)
        System.out.print(a[i]+" ");
        System.out.println(" ");
    }
}
class SelectionSort implements Sortable
{
    
    public void sort(int[] a)
    {
        int t=0,i,j;
        int lss=a.length;
        // for( j=0;j<lss;j++)
        // System.out.print(a[j]+" ");
        // System.out.println(" ");
        for( i=0;i<lss;i++)
        {
            for( j=0;j<lss;j++)
            {
                if(a[i]<a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        //     for( j=0;j<lss;j++)
        // System.out.print(a[j]+" ");
        // System.out.println(" ");
        }
        System.out.println("Selection sort:");
        for( i=0;i<lss;i++)
        System.out.print(a[i]+" ");
    }
}

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    BubbleSort bubs=new BubbleSort();
	    SelectionSort sels=new SelectionSort();
	    System.out.println("Enter size of array of integers:");
	    int n=sc.nextInt();
	    System.out.println("Enter array of integer:");
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    System.out.println("Enter array of integer:");
	    int[] b=new int[n];
	    for(int i=0;i<n;i++)
	    b[i]=sc.nextInt();
	    bubs.sort(a);
	    sels.sort(b);
	}
}
