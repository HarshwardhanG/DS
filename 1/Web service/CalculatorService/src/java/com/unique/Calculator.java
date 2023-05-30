/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unique;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 390
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "grtNumber")
    public int grtNumber(@WebParam(name = "num") int num) {
        //TODO write your implementation code here:
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        return fact; 
    }

    
}
