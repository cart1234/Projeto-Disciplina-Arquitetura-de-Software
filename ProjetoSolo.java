/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.solo;

/**
 *
 * @author Willian
 */
public class ProjetoSolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Calculos c1 = new Calculos(); 
        Correcao c2 = new Correcao();
        
        double correc = c2.CalcFormulaM(3, 8);
        
        double cc1 = c1.CalcIdealCalcio(0); 
        
        System.out.println(" Correcao magnesio  " +correc);
        
        
        
        
    }
    
}
