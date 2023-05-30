import ReverseModule.ReversePOA;

import java.lang.String;

class ReverseImpl extends ReversePOA
{
ReverseImpl()
{
super(); //call to super class ReversePOA
System.out.println("Reverse Object Created");
}
public String reverse_string(String name) //implement the abstract method
{
StringBuffer str=new StringBuffer(name);
str.reverse(); //call to the method reverse
return (("Server Send "+str));
}
}
