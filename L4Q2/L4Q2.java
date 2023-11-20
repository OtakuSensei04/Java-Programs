import java.util.*;
class Employee
{
    private String id,name;
    private int dept;
    private float basic,allowance,totalSalary;
    Employee(String id, String name, int dept, float basic) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.basic = basic;
        this.allowance = 0;
        this.totalSalary = 0; 
    }
    void calculateSalary()
    {
        if(dept==1)
        {
        allowance=1500;
        this.totalSalary =(float) (basic+(basic*0.4)+ 1500);
        }
        else if(dept==2)
        {
            allowance=2500;
        this.totalSalary =(float) (basic+(basic*0.4)+ 2500);
        }
        else if(dept==3)
        {
            allowance=3500;
        this.totalSalary =(float) (basic+(basic*0.4)+ 3500);
        }
        else
        {
            allowance=0;
        
        }
    }
    void displayDetails()
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Basic Salary: " + basic);
        if(allowance==0)
        System.out.println("Allowance: Invalid option");
        else
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("-----------------------------");
   
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n=sc.nextInt();
		Employee[] obj=new Employee[n];
		int i=0;
		for(i=0;i<n;i++)
		{
		    System.out.println("Enter employee id: ");
		    sc.nextLine();
		    String id=sc.nextLine();
		    
		    System.out.println("Enter employee name: ");
		    String name=sc.nextLine();
		    System.out.println("Enter the department code: ");
		    int dept=sc.nextInt();
		    System.out.println("Enter the basic Salary: ");
		    float basic=sc.nextFloat();

            obj[i] = new Employee(id, name, dept, basic);
            obj[i].calculateSalary();
		}
		System.out.println("Employee details and salary:");
        for ( i = 0; i < n; i++) {
            obj[i].displayDetails();
        }
	}
}
