/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.projetocorrecaosolo;/*
/**
 *
 * @author Willian
 */
 public enum TipoFosforoEnum {
    
      
    Tipo {
        public TipoFosforo valores() {
            return new TipoFosforo("Superfosfato Simples", " Superfosfato Triplo ", " MAP ", " DAP ", " Termofosfato Yoorin ", 
                    "Fosfato Ret. Arad ", "Fosfato Reativo de Gafsa", "Fosfato Reativo Daoul", 
                    "Fosfato Nat. Pato de Minas", " Escoria de Thomas ", " Ácido Fosfórico", " Super fosfato Magnesiano ");
        }
    }, 
    
    TipoCorrecao { 
        
         public TipoFosforo valores(){
             return new TipoFosforo(" nitrogenio ", " calcio "," enxofre "," magnesio ");
         }
        
    };
    
    public abstract TipoFosforo valores();
    
}
