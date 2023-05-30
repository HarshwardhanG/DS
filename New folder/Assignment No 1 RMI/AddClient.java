
import java.rmi.*;

public class AddClient
{
   public static void main(String args[])
   {
       try
       {    
        String addServerURL="rmi://"+"172.16.235.2"+"/AddServer";
        AddServerIntf addServerIntf=(AddServerIntf)Naming.lookup(addServerURL);
        System.out.println("First num:"+args[0]);
        int d1=Integer.parseInt(args[0]);
        System.out.println("Second num:"+args[1]);
        int d2=Integer.parseInt(args[1]);
        System.out.println("Addition:"+addServerIntf.add(d1,d2));
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
   }
 }

