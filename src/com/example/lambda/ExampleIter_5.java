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
public class ExampleIter_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        double sum=0;
        
                for(SalesTxn t: tList){
                    if(t.getState().equals(State.CA)&&
                            t.getBuyerName().equals("Acme Electronics")){
                        t.printSummary();
                        //sum+= t.getTransactionTotal();
                    }if(t.getTransactionTotal()>250000){
                        t.printSummary();
                    }
                }
        
        System.out.println("Total Sales = "+ sum);
        
        
        /* System.out.println("Transacciones lamda");
        tList.stream().filter(t->t.getState().equals(State.CA))
                .forEach(SalesTxn::printSummary);
        System.out.println("Transaccion lamda");
        tList.stream().filter(p->p.getBuyerName().equals("Acme Electronics"))
                .forEach(SalesTxn::printSummary);
        
        */
        
        
        
    }

}
