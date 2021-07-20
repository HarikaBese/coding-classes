import java.util.*;
class MenuHash
{
public static void main(String args[])
{
 HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
 Scanner s = new Scanner (System.in);
 System.out.println (" a.adds an entry with key x and value y to hashmap");
 System.out.println(" b.prints value of x if it is present in hashmap else it prints -1");
 System.out.println (" c.prints the size of the hash Map");
 System.out.println (" d.removes an entry with key x from hashmap");
 System.out.println (" e.to exit");
 System.out.println ("enter your choice");
  char ch = sc.next ().charAt (0);
   while (ch != 'e')
      {

	switch (ch)
	  {
	  case 'a':
	    System.out.println ("Enter key and value");
            int x1=sc.nextInt();
            int y1=sc.nextInt ()
	    h.put (x,y);
	    break;
	  case 'b':System.out.println("enter the key value of element that you want to search");
	    int n= sc.nextInt ();
	    if (h.containsKey (n))
	        System.out.println (h.get (n));
	    else
	        System.out.println ("-1");
	      break;
	    case 'c':System.out.println (h.size ());
	      break;
	    case 'd':System.out.println("enter the key of the element that you want to remove");
	     int x2=sc.nextInt();
              h.remove (x2);
	      break;

	  }
	System.out.println ("enter your choice");
	ch = sc.next ().charAt (0);
      }
  }
}
--------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
a.adds an entry with key x and value y to hashmap
 b.prints value of x if it is present in hashmap else it prints -1
 c.prints the size of the hash Map
 d.removes an entry with key x from hashmap
 e.to exit
enter your choice
a  
Enter key and value
1 2
enter your choice
a
Enter key and value
10 3
enter your choice
b
enter the key value of element that you want to search
10
3
enter your choice
d
enter the key of the element that you want to remove
1
enter your choice
c
1
enter your choice
e
	
