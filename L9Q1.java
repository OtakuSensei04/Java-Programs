import java.util.*;
class BITS
{
    String id=null,email=null;
    int year;
    String discipline,psts,campus;
    BITS(int year,String discipline,String psts,String campus)
    {
         this.year=year;
         this.discipline=discipline;
         this.psts=psts;
         this.campus=campus;
      //   System.out.println("INITIALIZED");
    }
    String id_formation()
    {
      //  System.out.println("id reACHED");
      this.email="f";
        this.id=String.valueOf(year);
        email+=year;
      //  System.out.println(id);
        if(discipline.equalsIgnoreCase("CHEM"))
        {
            id="A1";
        }
        else if(discipline.equalsIgnoreCase("EEE"))
        {
            id+="A3";
        }
        else if(discipline.equalsIgnoreCase("MECH"))
        {
            id+="A4";
        }
        else if(discipline.equalsIgnoreCase("CS"))
        {
            id+="A7";
        }
        id+=psts;
       // System.out.println(id);
        int rn=1,t=3,r;
        while(t==3)
        {
         rn=(int)(Math.random()*1000);
        //     System.out.println(rn);
             r=rn/100;
             if(r==0)
             {}
             else
             {
                 break;
             }
         
        }
        id+=rn;
        email+=rn;
        email+="@dubai.bits-pilani.ac.in";
       // System.out.println(id);
        if(campus.equalsIgnoreCase("Pilani"))
        {
            id+="P";
        }
        else if(campus.equalsIgnoreCase("Hyderabad"))
        {
            id+="H";
        }
        else if(campus.equalsIgnoreCase("Goa"))
        {
            id+="G";
        }
        else if(campus.equalsIgnoreCase("Dubai"))
        {
            id+="U";
        }
       System.out.println(email);
        return id;
    }
    
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of students:");
	    int n=sc.nextInt();
	    BITS[] obj=new BITS[n];
	    sc.nextLine();
	    for(int i=0;i<n;i++)
	    {
	    System.out.println("Enter year:");
	    int yr=sc.nextInt();
	    sc.nextLine();
		System.out.println("Enter Discipline:");
	    String dis=sc.nextLine();
	    System.out.println("Enter PS/TS:");
	    String pt=sc.nextLine();
	    System.out.println("Enter Campus:");
	    String camp=sc.nextLine();
	    obj[i]=new BITS(yr,dis,pt,camp);
	  //  System.out.println("final");
	    System.out.println(obj[i].id_formation());
	    }
	}
}
