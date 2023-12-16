import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter a word:");
    String s = sc.nextLine ();
      System.out.println ("Enter an anagram:");
    String a = sc.nextLine ();
    int n = s.length ();
    int n2 = a.length ();
    char ch, ch1;
    char[] dupe = new char[n];
    char[] repe = new char[n];
    int[] du = new int[n];
    int[] re = new int[n];
    int j = 0, i = 0, t;
    String snew="",anew="";
    // if (n > n2)
    //     t = n;
    // else
    //     t = n2;
    for (i = 0; i < n; i++)
    {
        ch = s.charAt (i);
        if (Character.isWhitespace (ch))
	  {

	  }
	  else
	  {
	      snew+=ch;
	  }
    }
    for (i = 0; i < n2; i++)
    {
        ch = a.charAt (i);
        if (Character.isWhitespace (ch))
	  {

	  }
	  else
	  {
	      anew+=ch;
	  }
    }
    int nnew=snew.length();
    // System.out.println ("Words are:"+snew+" "+anew);
    
    for (i = 0; i < nnew; i++)
      {

	ch = s.charAt (i);
	if (Character.isWhitespace (ch))
	  {

	  }
	else
	  {
	    for (j = 0; j < nnew; j++)
	      {
		ch1 = snew.charAt (j);
		if (ch == ch1)
		  {
		    du[i] += 1;
		  }
	      }
	  }
      }
      
      
     for (i = 0; i < nnew; i++)
      {
      
	ch = s.charAt (i);
	if (Character.isWhitespace (ch))
	  {

	  }
	else
	  {
	    for (j = 0; j < nnew; j++)
	      {
		ch1 = anew.charAt (j);
		if (ch == ch1)
		  {
		    re[i] += 1;
		  }
	      }
	  }
      }

   boolean bol=true;
    for (i = 0; i < nnew; i++)
      {
	if (du[i] == re[i])
	  {
	  }
	else
	  {
	      bol=false;
	  }
      }
      if(bol)
      {
          System.out.println ("Anagram");
      }
      else
      {
          System.out.println ("Not Anagram");
      }
  }
}
