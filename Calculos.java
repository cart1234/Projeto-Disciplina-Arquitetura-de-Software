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
public class Calculos {
    
       

        double potassio; 
        double fosforo;
        double calcio; 
        double magnesio;
        double enxofre;
        


      double CalcIdealFosforo (double solo ){

        
          fosforo = (solo == 1) ? 9.0 : 12.0;

           return fosforo;

       } 


       double CalcIdealPotassio (double solo){

           potassio = (solo == 1) ? 0.35 : 0.25;

            return potassio;
        
        }

        double CalcIdealCalcio (double solo){

           calcio = (solo == 1) ? 6.0 : 4.0 ;

           return calcio;


        }

        double CalcIdealMagnesio (double solo){

                magnesio = (solo == 1) ? 1.5 : 1.0 ;
     
                return magnesio;
     
     
             }


        double CalcIdealEnxofre (double solo){

              enxofre = (solo == 1) ? 9.0 : 6.0 ;
     
              return enxofre;
     
     
             }
        
     





        }
    
    
    
    

