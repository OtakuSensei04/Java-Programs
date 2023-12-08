import java.util.*;

public class Max_Min_Avg
{
	public static void main(String[] args) 
	{
	    System.out.println("Enter an array of 10 floating values:");
	    Scanner sc=new Scanner(System.in);
	    float[] arr=new float[10];
	    float t=0;
	    float avg=0;
	    for(int i=0;i<10;i++)
	    {
	        arr[i]=sc.nextFloat();
	    }
	    for(int i=0;i<10;i++)
	    {
	        for(int j=0;j<9;j++)
	        {
	            if (arr[j]<arr[j+1])
	            {
	                t=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=t;
	            }
	        }
	        avg=avg+arr[i];
	    }
	    avg=avg/10;
	    System.out.println("Max: "+arr[0]);
	    System.out.println("Min: "+arr[9]);
	    System.out.println("Avg: "+avg);
	}
	
}
