import java.util.*;

class Area 
{
   // private float side1;
   // private float side2;
    private float area;
    
    void  calc_Area(int side)
    {
        area=side*side;
    }
    void  calc_Area(float radius)
    {
        area=3.14f*radius*radius;
    }
    void  calc_Area(float side1,float side2)
    {
        area=side1*side2;
    }
    void  display()
    {
        System.out.println("Area= "+ area);
    }
}

public class AreaTester
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    Area obj=new Area();
	    System.out.println("Enter 1 for area of square");
	    System.out.println("Enter 2 for area of circle");
	    System.out.println("Enter 3 for area of rectangle");
	    int x=sc.nextInt();
	    switch(x)
	    {
	        case 1:
	            System.out.println("Enter side of square:");
	            int s=sc.nextInt();
	            obj.calc_Area(s);
	            obj.display();
	            break;
	        case 2:
	            System.out.println("Enter radius of circle:");
	            float r=sc.nextFloat();
	            obj.calc_Area(r);
	            obj.display();
	            break;
	        case 3:
	            System.out.println("Enter length and breath of rectangle:");
	            float l=sc.nextFloat();
	            float b=sc.nextFloat();
	            obj.calc_Area(l,b);
	            obj.display();
	            break; 
	        default:
	           System.out.println("Invalid Input");
	    }
		
	}
}
