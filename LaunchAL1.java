import java.util.*;

public class LaunchAL1 
{
    public static void main(String[] args) 
    {
        
        ArrayList al1=new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println(al1.contains(200));
     
       // System.out.println("*********************");       
       
        int index=al1.indexOf(300);
      System.out.println(index);
      
     // System.out.println("*********************");       
     
      System.out.println(al1.size());
      System.out.println("*********************");        
    
      al1.ensureCapacity(10);
      al1.trimToSize();
      System.out.println(al1.size());
      al1.clear();
      System.out.println(al1);
      System.out.println("*********************");       
       
      List al=new ArrayList();
      al.add(100);
      System.out.println(al);
    }
}

