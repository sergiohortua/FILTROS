/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.lambda;

import java.util.List;

/**
 *
 * @author PC-50
 */
public class ExampleIter_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         List <SalesTxn> tList=SalesTxn.createTxnList();
         
         System.out.println("==Recorrido con For each==");
         tList.forEach(t -> t.printSummary());
         System.out.println("==Impresion con lamda==");
        // tList.forEach(t->System.out.println("ID"+ t.getTxnId()+););
         
         
    }
    
}
