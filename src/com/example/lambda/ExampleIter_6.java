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
public class ExampleIter_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println(" State CO");
        tList.stream().filter(t->t.getState().equals(State.CO))
                .forEach(SalesTxn::printSummary);
        System.out.println(" Buyer PriceCo");
        tList.stream().filter(p->p.getBuyerName().equals("PriceCo"))
                .forEach(SalesTxn::printSummary);
         System.out.println("Amt > 250000");
      
        
                for(SalesTxn t: tList){
                    if(t.getState().equals(State.CO)&& t.getBuyerName().equals("PriceCo")){
                        t.printSummary();
                        //sum >= t.getTransactionTotal();
                    }
                }
        
        System.out.println("  Datos > a 250000  "  );
        
        
        
        
        
    }
    
}
/* t.getState().equals(State.CA) && t.getBuyerName().equals("Acme Electronics") */