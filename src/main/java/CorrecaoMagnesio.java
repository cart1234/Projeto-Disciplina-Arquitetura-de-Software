/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class CorrecaoMagnesio {

 
    double CalcFormulaN6162(double T70){


        return 18*0.0248 * T70;
    }  


    
    double CalcFormulaN63(double T70){


        return 5*0.0248 * T70;
    }  

  
  

    double CalcFormulaM (double D52, double T70){

       if(D52==1 || D52 == 6){
           return CalcFormulaN6162(T70);

       } else

         if(D52==2){
                 
             
        return   CalcFormulaN63(T70);

         }else 

         return 0;
       


    }
    
    double N65(double C39){
        
       double calc = (18 * 0.0248 * C39) /1000;
       
       return calc;
        
        
    }
    
    
    
    double N69(double C39){
        
       double calc = N65(C39)* 0.6;
       
       return calc;
        
    }
     
    double O66(double D37, double C39){
    
     double calc = (D37 ==3) ? N69(C39) : 0.0;
        return calc;
     
}
    double N67(double D23){
        
        double result = 0.0248*15;
        double calc = (D23==5) ? result : 0.0; 
        
        return calc;
    
    }    
    
    
   
    double N70(double N67, double D23){
        
        double calc = N67(D23) * 0.6; 
        
        return calc;
        
    }

    //D37:  FONTE POTASSIO A USAR 
   //   D23: FONTE FOSFORO A UTILIZAR
   // H11: MAGNESIO NO SOLO 
   //D52: FONTE CORRETIVO A USAR 
   // C39:  qtd a aplicar


    
    double CalculoCorrecao(double H11, double N67, double D23, double D37, double C39, double D52, double T70 ){
        
        return H11 + CalcFormulaM(D52, T70) + O66(D37, C39) + N70(N67, D23);        
        
    }

}