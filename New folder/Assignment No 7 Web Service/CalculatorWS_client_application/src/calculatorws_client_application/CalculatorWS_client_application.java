/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author student
 */
public class CalculatorWS_client_application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
           int i = 20;
           int j = 37;
           
           int result = add(i,j);
           System.out.println("Result = "+ result);
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }

    private static int add(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }
    
}
