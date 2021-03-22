
public class TeorIdealMO {
    
    
    double MO(double Teor){
        
        double calc = Teor / 10; 
        
        double result = (calc > 0.01) ? calc : 0.00;
        
        return result;
        
    }
    
     double MO2(double Teor){
         
         return Teor * 10;
     }
    
    
    double CalcCarbono (double TeorCarbono, double TeorMO){
        
        double M = MO2(TeorMO);
        
        double calc  = (TeorCarbono / 1.72) * 10; 
        double calc1 = (M / 1.72) * 10; 
        
        double result = (calc > 0.01) ? calc : calc1; 
        
        return result;
        
        
    }
    
    
}
