package CalApp.calculatorPackage;


/**
* CalApp/calculatorPackage/DivisionByZero.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from calculator.idl
* Thursday, 23 March, 2023 2:26:47 PM IST
*/

public final class DivisionByZero extends org.omg.CORBA.UserException
{

  public DivisionByZero ()
  {
    super(DivisionByZeroHelper.id());
  } // ctor


  public DivisionByZero (String $reason)
  {
    super(DivisionByZeroHelper.id() + "  " + $reason);
  } // ctor

} // class DivisionByZero
