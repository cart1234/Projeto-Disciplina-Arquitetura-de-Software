/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.text.DecimalFormat;

/**
 *
 * @author Willian
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         CorrecaoeRecuperacao c = new CorrecaoeRecuperacao(12, 8.59,70, 1); 
         
         
         double d = c.QuantidadeAplicada(); 
        double d1 =c.retorno(1);
        
        
        
        
        
       DecimalFormat df = new DecimalFormat("#,###.00");
       
  
         System.out.println( df.format(d) +" kg/hectare de SuperFostato Simples" );
        
        System.out.println(df.format(d1));
    
    
}}
