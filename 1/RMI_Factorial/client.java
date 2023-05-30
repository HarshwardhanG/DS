import java.io.*;
import java.rmi.*;

public class client
{
	public static void main(String args[])throws Exception
	{
		try
		{
			String s="rmi://"+args[0]+"/abc";
			serverint f=(serverint)Naming.lookup(s);
			DataInputStream m=new DataInputStream(System.in);
			int n1=Integer.parseInt(m.readLine());
			System.out.println("the factorial is "+ f.fact(n1));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}







