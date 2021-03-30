/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

/**
 *
 * @author Willian
 */
public class CorrecaoeRecuperacao { 
    
    private double teorFosforo; 
    private double fonteFosfoto; 
    private double porcentagem;
    private double  fonteFosforos;

    public CorrecaoeRecuperacao(double teorFosforo, double fonteFosfoto, double porcentagem, double fonteFosforos) {
        this.teorFosforo = teorFosforo;
        this.fonteFosfoto = fonteFosfoto;
        this.porcentagem = porcentagem;
        this.fonteFosforos = fonteFosforos;
    }

   
  

    

    CorrecaoeRecuperacao() {

    }

    public double getTeorFosforo() {
        return teorFosforo;
    }

    public double getFonteFosfoto() {
        return fonteFosfoto;
    }
    
    
    double porcentagemP2Os() {
        
        if(this.fonteFosforos == 1 ) {
            return 18.0;
        } else 
            
           if(this.fonteFosforos == 4) return 45.0; 
           else 
                 if(this.fonteFosforos == 3) return 48.0; 
               
        return 0.0;
        
        
    }
    
    
    
    double QuantidadeAplicada(){
        
  
            
        double mgFosforo = this.teorFosforo - this.fonteFosfoto;
        double kgFosforo = mgFosforo * 2; 
        double gkPOFosforo = kgFosforo * 2.29; 
        
        
        double p2o5 =  gkPOFosforo *100 / this.porcentagem /100 ; 
        
      double result = p2o5 * 100 /porcentagemP2Os();
      
      return result * 100; 
       
    } 
    
    double CorrecaoCalcio(double teorFosforo) {
        
    //  m22/2.42 
           //   m22: n27
                      
                      
             if(teorFosforo == 1) return QuantidadeAplicada() * 0.28 * 2.42; 
             
             else 
                 
             if(teorFosforo == 2) return QuantidadeAplicada() * 0.2; 
             else 
                 
             if(teorFosforo == 3) return QuantidadeAplicada() * 0.09; 
             else 
                 
              if(teorFosforo==4) return QuantidadeAplicada() * 0.16; 
              
              else 
               if(teorFosforo==5) return 212 * 0.28; 
             
                  else 
                
               if(teorFosforo==6) return 212 * 0.52;
              
               else 
              
             if(teorFosforo >= 7) return 212 * 0.28; 
             
             
             return 0.0;
                      
          
    } 
    
    double retorno(double teorFosforo){
        
        return CorrecaoCalcio(teorFosforo) / 2.42;
    }
    
    
    //d23 =5 n21 else m23 
      //m21: c24 * 0.15 
    //c24: quantidadeaplicada 
            //m23 :  al22/2.42
             
    
      //al22
       // d23 = 1: b24*0.1 d23=12 b24*0.11
    
    
}
