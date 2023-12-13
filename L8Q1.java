import java.util.*;
class FlightDest
{
    private String flightNo,destination;
    FlightDest(String flightNo,String destination)
    {
        this.flightNo=flightNo;
        this.destination=destination;
    }
    String getflightNo()
    { return flightNo; }
    
    String getdestination()
    { return destination; }
}
class FlightInfo
{
    ArrayList<FlightDest> flightDestList=new ArrayList<FlightDest>();
    
    public FlightInfo()
    {}
    public void addFlightDestPair(String fNo,String dest)
    {
        flightDestList.add(new FlightDest(fNo,dest));
    }
    public ArrayList<String> getFlightsDest(String dest)
    {
        ArrayList<String> fly=new ArrayList<String>();
        for(FlightDest d:flightDestList )
        if(d.getdestination().equals(dest))
        {
             fly.add(d.getflightNo());
        }
        return fly;
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    FlightInfo obj=new FlightInfo();
		System.out.println("Enter 1 to add fno and dest");
		System.out.println("Enter 2 to get flight for ur dest");
		System.out.println("Enter 3 to exit");
		int n=sc.nextInt();
		sc.nextLine();
		while(n!=3)
		{
		    switch(n)
		    {
		        case 1:
		            System.out.println("Enter fno and dest");
		            String fl=sc.nextLine();
		            String des=sc.nextLine();
		            obj.addFlightDestPair(fl,des);
		            break;
		        case 2:
		            System.out.println("Enter dest to get flight no.");
		            String d=sc.nextLine();
		            System.out.println(obj.getFlightsDest(d));
		            break;
		        default:
		            System.out.println("Invalid input");
		    }
		    System.out.println("Enter 1 to add fno and dest");
		System.out.println("Enter 2 to get flight for ur dest");
		System.out.println("Enter 3 to exit");
		    n=sc.nextInt();
		    sc.nextLine();
		}
	}
}
