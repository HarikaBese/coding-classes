import java.util.*;
class Menu
{
public static void main(String args[])
{
 Scanner s = new Scanner (System.in);
    LinkedList < Integer > L = new LinkedList < Integer >();
    System.out.println ("Enter list size and elements :");
    int n = s.nextInt ();
    for (int i = 0; i < n; i++)
     {
         L.add (s.nextInt ());
     }
    int ch,n1;
    do
    {   
System.out.println("Enter your choice :");
	System.out.println(" 1.Begin Insert");
	System.out.println(" 2.End Insert");
	System.out.println(" 3.Position Insert");
	System.out.println(" 4.Begin Delete");
	System.out.println(" 5.End Delete");
	System.out.println(" 6.Position Delete");
	System.out.println(" 7.Display ");
	System.out.println(" 8.Exit ");
	cho = s.nextInt ();
	switch (ch)
	  {
	  case 1:
	    System.out.println ("Enter n1 value :");
	    n1 = s.nextInt ();
	    L.addFirst (n1);
	    break;
	   case 2:
            System.out.println ("Enter n1 value :");
	    n1 = s.nextInt ();
	    L.addLast (n1);
	    break;
	   case 3:
            System.out.println ("Enter n1 value :");
	    n1 = s.nextInt ();
	    System.out.println ("Enter index value");
	    int ind = s.nextInt ();
	     L.add (ind, n1);
	     break;
	   case 4:
            L.removeFirst ();
	    break;
	   case 5:
            L.removeLast ();
	    break;
	   case 6:
            System.out.println("Enter index of element to be removed :");
	    int in = s.nextInt ();
	    L.remove (in);
	    break;
	   case 7:
            System.out.println ("Elements in the list :");
	    for (int i = 0; i < L.size (); i++)
            { 
            System.out.print (L.get (i) + " ");
            }
	      System.out.println();
	    }
            }while (cho != 8);
}
}
