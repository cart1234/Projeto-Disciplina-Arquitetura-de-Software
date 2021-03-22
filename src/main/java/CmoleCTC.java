/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Willian
 */
public class CmoleCTC {
    
    CalculoseTeor calc;
    
    double CalcCmol(double R5){
        
       double calculo = calc.calcio + calc.magnesio + calc.potassio;
        
       double result = (R5 > calculo) ? R5 : 0.0;
       
       return result;
        
    }
    
  


    double CTC(double R6, double TeorAL, double R5){
        
        double calc =  CalcCmol(R5) + TeorAL;
        
        double result = (R6 > 0.01) ? calc : 0.0;
        return 0;
        
        
        
    }
    
    
}
