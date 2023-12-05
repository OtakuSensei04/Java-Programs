import java.util.*;

public class SavingsAccount
{
    static float annualInteresrate=0.04f;
    private float savingsBalance;
    float monthlyinterest;
    SavingsAccount(float savingsBalance)
    {
         this.savingsBalance=savingsBalance;
    }
    void calculateMonthlyIterest()
    {
        monthlyinterest=(savingsBalance*annualInteresrate)/12;
        savingsBalance=savingsBalance+monthlyinterest;
        System.out.println("monthlyinterest= "+ monthlyinterest);
        System.out.println("savingsBalance= "+ savingsBalance);
    }
    public static void modifyInterestRate()
    {
        annualInteresrate=0.05f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SavingsAccount[] obj=new SavingsAccount[3]; 
        obj[0]=new SavingsAccount(1000);
        obj[1]=new SavingsAccount(2000);
        obj[2]=new SavingsAccount(3000);
        
        obj[0].calculateMonthlyIterest();
        obj[1].calculateMonthlyIterest();
        obj[2].calculateMonthlyIterest();
        
        SavingsAccount.modifyInterestRate();
        
        obj[0].calculateMonthlyIterest();
        obj[1].calculateMonthlyIterest();
        obj[2].calculateMonthlyIterest();
      
        
         }
}
