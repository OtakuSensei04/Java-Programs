import java.util.*;
class CreditCard
{
    private String name,cardNo,expiryMonth;
    private boolean enable;
    private int pin,cardType,currentCredit,creditLimit;
    CreditCard(String name,String cardNo,String expiryMonth,boolean enable,int pin,int cardType,int currentCredit,int creditLimit)
    {
        this.name=name;
        this.cardNo=cardNo;
        this.expiryMonth=expiryMonth;
        this.enable=enable;
        this.pin=pin;
        this.cardType=cardType;
        this.currentCredit=currentCredit;
        this.creditLimit=creditLimit;
    }
    void changePin(int newPin)
    {
       this.pin=newPin;
    }
    void transact(int amt)
    {
        if(amt<=this.creditLimit)
        {
        this.currentCredit=this.currentCredit-amt;
        System.out.println("Transaction completed!!");
        }
        else
        System.out.println("Transaction exceeded!!");
    }
    void changeCardStatus(boolean status)
    {
        this.enable=status;
    }
    void display()
    {
        System.out.println("card details:");
		System.out.println(" name: "+name);
		System.out.println(" card number: "+cardNo);
		System.out.println(" card status: "+enable);
		System.out.println(" pin: "+pin);
		System.out.println(" expiry month: "+expiryMonth);
		System.out.println(" card Type(1,2 or 3): "+cardType);
		System.out.println(" current Credit: "+currentCredit);
		System.out.println(" credit Limit: "+creditLimit);
    }
    
}
public class CreditTester
{
	public static void main(String[] args)
	{
	    
	    Scanner sc=new Scanner(System.in);
	     String name,cardNo,expiryMonth;
         boolean enable;
         int pin,cardType,currentCredit,creditLimit;
		System.out.println("Enter card details:");
		boolean bool=true;
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter card number:");
		cardNo=sc.nextLine();
		System.out.println("Enter card status(true for enabled and false for not):");
		enable=sc.nextBoolean();
		System.out.println("Enter pin:");
		pin=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter expiry month:");
		expiryMonth=sc.nextLine();
		System.out.println("Enter card Type:(1,2 or 3)");
		cardType=sc.nextInt();
		System.out.println("Enter current Credit:");
		currentCredit=sc.nextInt();
		System.out.println("Enter credit Limit:");
		creditLimit=sc.nextInt();
		CreditCard obj=new CreditCard(name,cardNo,expiryMonth,enable,pin,cardType,currentCredit,creditLimit);
		while(bool)
		{
		    System.out.println("Enter 1 to change pin:");
		    System.out.println("Enter 2 for transaction:");
		    System.out.println("Enter 3 to change card status:");
		    System.out.println("Enter 4 to display details:");
		   int x=sc.nextInt();
		    switch(x)
		    {
		        case 1:
		         System.out.println("Enter the initial pin:");
		         int old_pin=sc.nextInt();
		         if(old_pin==pin)
		         {
		              System.out.println("Enter new pin:");
		              int newPin=sc.nextInt();
		              obj.changePin(newPin);
		              System.out.println("Pin successfully changed!!");
		         }
		         else
		         System.out.println("Entered pin was incorrect!!");
		         
		         break;
		         case 2:
		             System.out.println("Enter amount:");
		             int amt=sc.nextInt();
		             obj.transact(amt);
		             
		             break;
		         case 3:
		             System.out.println("Enter the initial pin:");
		         int old_pin1=sc.nextInt();
		         if(old_pin1==pin)
		         {
		              System.out.println("Enter new status:");
		              boolean status=sc.nextBoolean();
		              obj.changeCardStatus(status);
		              System.out.println("Card status changed!!");
		         }
		         else
		         System.out.println("Entered pin was incorrect!!");
		               
		               break;
		         case 4:
		             obj.display();
		             break;
		         default: System.out.println("Invalid option!!"); break;
		    }
		    System.out.println("Enter true to continue and false to exit!!");
		    bool=sc.nextBoolean();
		}
		System.out.println("Thank you!!");
	}
}
