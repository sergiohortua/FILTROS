/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.lambda;

import com.example.lambda.SalesTxn;
import java.util.List;

/**
 *
 * @author PC-50
 */
public class ExampleIter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List <SalesTxn> tList=SalesTxn.createTxnList();
        
        System.out.println("===Recorrido con un for===");
        
        for (SalesTxn salesTxn : tList) {
            salesTxn.printSummary();
        }
        
        
        
        
        
        
    }
    
}
