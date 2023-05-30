import ReverseModule.Reverse;
import org.omg.CosNaming.*; //comman object service naming
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
class ReverseServer
{
public static void main(String[] args)
{
try
{
// creats and initialize the ORB
org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
// initialize the POA and gets the reference to root POA portable adaptor and activates the POA manager
POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
rootPOA.the_POAManager().activate();

// creating the servent instance / object (Implementation of reverse object)
ReverseImpl rvr = new ReverseImpl();
// get the CORBA object reference from the servant class for naming contect to register a new CORBA object
org.omg.CORBA.Object ref = rootPOA.servant_to_reference(rvr);
//gets the root naming context
System.out.println("Step1");
Reverse h_ref = ReverseModule.ReverseHelper.narrow(ref);
System.out.println("Step2");
org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
System.out.println("Step3");
NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
System.out.println("Step4");
//Registers the new object in the naming context under the name Reverse
String name = "Reverse";
NameComponent path[] = ncRef.to_name(name);
ncRef.rebind(path,h_ref);

//waits for invocation of the new object from the client
System.out.println("Reverse Server reading and waiting....");
orb.run();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
