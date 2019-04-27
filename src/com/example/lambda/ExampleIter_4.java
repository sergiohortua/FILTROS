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
public class ExampleIter_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("Transacciones lamda");
        tList.stream().filter(t->t.getState().equals(State.CA))
                .forEach(SalesTxn::printSummary);
        System.out.println("Transaccion lamda");
        tList.stream().filter(p->p.getBuyerName().equals("Acme Electronics"))
                .forEach(SalesTxn::printSummary);
        
        
        
        
    }

}
