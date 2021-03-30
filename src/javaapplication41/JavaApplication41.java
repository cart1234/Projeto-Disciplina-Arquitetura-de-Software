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
        
         CorrecaoeRecuperacao c = new CorrecaoeRecuperacao(); 
         
         double d = c.QuantidadeAplicada(11, 8.59, 70); 
        
       DecimalFormat df = new DecimalFormat("#,###.00");
       
  
         System.out.println( df.format(d) +" kg/hectare de SuperFostato Simples" );
        
      
    }
    
}
