import java.util.*;
class Book
{
    private long ISBN;
    private String name,author,publisher;
    private int edition,status;
    Book(long ISBN,String name,String author,String publisher,int edition,int status)
    {
          this.ISBN=ISBN;
          this.name=name;
          this.author=author;
          this.publisher=publisher;
          this.edition=edition;
          this.status=status;
    }
    void check_Status()
    {
         switch(status) {
            case 0: System.out.println("Available"); break;
            case 1: System.out.println("Issued"); break;
            case 2: System.out.println("Reserved"); break;
        }
    }
    void change_Status(int newstatus)
    {
        this.status=newstatus;
    }
    void display()
    {
        System.out.println("ISBN= "+ISBN);
        System.out.println("name= "+name);
        System.out.println("author= "+author);
        System.out.println("publisher= "+publisher);
        System.out.println("edition= "+edition);
        System.out.println("status= "+status);
    }
    Long getISBN()
    {
        return ISBN;
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    
	    LinkedList<Book> bk=new LinkedList<Book>();
	    System.out.println("Enter details of first two books:");
	    for(int i=0;i<2;i++)
	    {
	        System.out.println("Enter ISBN:");
	        long isbn=sc.nextLong();
	        sc.nextLine();
	        System.out.println("Enter name:");
	        String name=sc.nextLine();
	        System.out.println("Enter author:");
	        String author=sc.nextLine();
	        System.out.println("Enter publisher:");
	        String publisher=sc.nextLine();
	        System.out.println("Enter edition:");
	        int edition=sc.nextInt();
	        System.out.println("Enter status:");
	        int status=sc.nextInt();
	        sc.nextLine();
	        bk.add(new Book(isbn,name,author,publisher,edition,status));
	    }
	     System.out.println("Enter 1 to check status:");
	     System.out.println("Enter 2 to change status:");
	     System.out.println("Enter 3 to display:");
	    System.out.println("Enter 4 to exit selection:");
	    int nn=sc.nextInt();
	    while(nn!=4)
	    {
	        switch(nn)
	        {
	            case 1:
	                System.out.println("Enter ISBN:");
	        long isn=sc.nextLong();
	            for(Book bok: bk)
	            {
	                if(bok.getISBN()==isn)
	                {
	                    bok.check_Status();
	                }
	            }
	            break;
	            case 2:
	                System.out.println("Enter ISBN:");
	        long isnn=sc.nextLong();
	            for(Book bokk: bk)
	            {
	                if(bokk.getISBN()==isnn)
	                {
	                    System.out.println("Enter new status:");
	                    int newstat=sc.nextInt();
	                    bokk.change_Status(newstat);
	                }
	            }
	            break;
	            case 3:
	                for(Book bokkk: bk)
	            {
	                bokkk.display();
	            }
	            break;
	            default: 
	                 System.out.println("Invalid input");
	        }
	        System.out.println("Enter 1 to check status:");
	     System.out.println("Enter 2 to change status:");
	     System.out.println("Enter 3 to display:");
	    System.out.println("Enter 4 to exit selection:");
	        nn=sc.nextInt();
	    }
		
	}
}
