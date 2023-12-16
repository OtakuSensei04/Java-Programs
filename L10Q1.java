import java.util.*;
class Person
{
    private String name,address;
    Person(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String toString()
    {
        return "Person[name="+name+",address="+address+"]";
    }
}
class Student extends Person
{
    private String program;
    private int year;
    private double fee;
    public Student(String name,String address,String program,int year,double fee)
    {
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    public String getProgram()
    {
        return program;
    }
    public void setProgram(String program)
    {
        this.program=program;
    }
    public int getyear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public double getFee()
    {
        return fee;
    }
    public void setFee(double fee)
    {
        this.fee=fee;
    }
    public String toString()
    {
        return "Student["+super.toString()+",program="+program+",year="+year+",fee="+fee+"]";
        }
}
class Staff extends Person
{
    private String school;
    private double pay;
    public Staff(String name,String address,String school,double pay)
    {
        super(name,address);
        this.school=school;
        this.pay=pay;
    }
    public String getSchool()
    {
        return school;
    }
    public void setSchool(String school)
    {
        this.school=school;
    }
    public double getPay()
    {
        return pay;
    }
    public void setFee(double pay)
    {
        this.pay=pay;
    }
    public String toString()
    {
        return "Staff["+super.toString()+",school="+school+",pay="+pay+"]";
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Student");
		System.out.println("Enter 2 for Staff");
		int n=sc.nextInt();
		sc.nextLine();
		        System.out.println("Enter name:");
		        String name=sc.nextLine();
		        System.out.println("Enter address:");
		        String address=sc.nextLine();
		switch(n)
		{
		    case 1:
		        System.out.println("Enter program:");
		        String program=sc.nextLine();
		        System.out.println("Enter year:");
		        int year=sc.nextInt();
		        sc.nextLine();
		        System.out.println("Enter fee:");
		        double fee=sc.nextDouble();
		        sc.nextLine();
		        Student stud=new Student( name, address, program, year, fee);
		        System.out.println(stud.toString());
		        break;
		    case 2:
		        System.out.println("Enter school:");
		        String school=sc.nextLine();
		        System.out.println("Enter pay:");
		        double pay=sc.nextDouble();
		        sc.nextLine();
		        Staff saff=new Staff( name, address, school, pay);
                System.out.println(saff.toString());
		        break;
		    default:
		        System.out.println("invalid input");
		}
	}
}
