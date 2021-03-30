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
    private Nutrientes nutrientes;

    public CorrecaoeRecuperacao(double teorFosforo, double fonteFosfoto) {
        super();
        this.teorFosforo = teorFosforo;
        this.fonteFosfoto = fonteFosfoto;
    }

    CorrecaoeRecuperacao() {

    }

    public double getTeorFosforo() {
        return teorFosforo;
    }

    public double getFonteFosfoto() {
        return fonteFosfoto;
    }
    
    double QuantidadeAplicada(double teorFosforo , double fosforo, double porcentagem){
        
  
        
        double mgFosforo = teorFosforo - fosforo; 
        double kgFosforo = mgFosforo * 2; 
        double gkPOFosforo = kgFosforo * 2.29; 
        
        
        double p2o5 =  gkPOFosforo *100 / porcentagem /100 ; 
        
      double result = p2o5 * 100 /18;  
      
      return result * 100;
       
    } 
    
    
    
    
    
    
}
