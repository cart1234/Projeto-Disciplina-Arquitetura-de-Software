/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Willian
 */
public class CMoleCTC {
    
    CalculoseTeor calc;
   

    public CMoleCTC(CalculoseTeor calc) {
        this.calc = calc;
      
    }
   
    
    
    double CalcCmol(){
        
        
      
        
       double calculo = calc.calcio + calc.magnesio + calc.potassio;
        
       double result = (calculo> 0.01) ? calculo : 0.0;
       
       return result;
        
    }
    
  


    double CTC(){
        
        double calc = Vatual();
        
        double result = (calc > 0.01) ? calc : 0.0;
        return 0;
        
        
        
    }
    
    double Vatual( ){
     double calculo = calc.calcio + calc.magnesio + calc.potassio;
     
     double calc1 = calculo + calc.HaL; 
     
     return calc1;
     
    }
    
}
