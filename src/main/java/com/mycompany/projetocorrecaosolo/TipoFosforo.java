package com.mycompany.projetocorrecaosolo;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Willian
 */ 
 // Essa classe armazena tipo de solo da correção do fosforo e do resultado do fornecimento
public class TipoFosforo {
    

   private String  SuperfosfatoSimples;
  private String SuperfosfatoTriplo;
  private String MAP;
  private String DAP;
  private String TermofosfatoYoorin;
  private String FosfatoReatArad;
  private String FosfatoReativodeGafsa;
  private String FosfatoReativoDaoul; 
  private String FosfatoNatPatodeMinas;
  private String EscoriadeThomas;
  private String ÁcidoFosfórico;
  private String SuperfosfatoMagnesiano; 
  
  private TipoFosforoEnum tipo; 
  
  private String nitrogenio;
  private String calcio; 
  
  private String enxofre; 
  private String magnesio;
  

    public TipoFosforo(String SuperfosfatoSimples, String SuperfosfatoTriplo, String MAP, String DAP, String TermofosfatoYoorin, String FosfatoReatArad, String FosfatoReativodeGafsa, String FosfatoReativoDaoul, String FosfatoNatPatodeMinas, String EscoriadeThomas, String ÁcidoFosfórico, String SuperfosfatoMagnesiano) {
        this.SuperfosfatoSimples = SuperfosfatoSimples;
        this.SuperfosfatoTriplo = SuperfosfatoTriplo;
        this.MAP = MAP;
        this.DAP = DAP;
        this.TermofosfatoYoorin = TermofosfatoYoorin;
        this.FosfatoReatArad = FosfatoReatArad;
        this.FosfatoReativodeGafsa = FosfatoReativodeGafsa;
        this.FosfatoReativoDaoul = FosfatoReativoDaoul;
        this.FosfatoNatPatodeMinas = FosfatoNatPatodeMinas;
        this.EscoriadeThomas = EscoriadeThomas;
        this.ÁcidoFosfórico = ÁcidoFosfórico;
        this.SuperfosfatoMagnesiano = SuperfosfatoMagnesiano;
    }

    public TipoFosforo(String nitrogenio, String calcio, String enxofre, String magnesio) {
        this.nitrogenio = nitrogenio;
        this.calcio = calcio;
        this.enxofre = enxofre;
        this.magnesio = magnesio;
    }
    
    
    

    TipoFosforo() {

    }

    public String getSuperfosfatoSimples() {
        return SuperfosfatoSimples;
    }

    public String getSuperfosfatoTriplo() {
        return SuperfosfatoTriplo;
    }

    public String getMAP() {
        return MAP;
    }

    public String getDAP() {
        return DAP;
    }

    public String getTermofosfatoYoorin() {
        return TermofosfatoYoorin;
    }

    public String getFosfatoReatArad() {
        return FosfatoReatArad;
    }

    public String getFosfatoReativodeGafsa() {
        return FosfatoReativodeGafsa;
    }

    public String getFosfatoReativoDaoul() {
        return FosfatoReativoDaoul;
    }

    public String getFosfatoNatPatodeMinas() {
        return FosfatoNatPatodeMinas;
    }

    public String getEscoriadeThomas() {
        return EscoriadeThomas;
    }

    public String getÁcidoFosfórico() {
        return ÁcidoFosfórico;
    }

    public String getSuperfosfatoMagnesiano() {
        return SuperfosfatoMagnesiano;
    }
  
  
   public String tipoFosforo(int fonteFosforo){ 
       
       
       switch(fonteFosforo) {
           
       case 1 :  return tipo.Tipo.valores().SuperfosfatoSimples;
       
       case 2 :  return tipo.Tipo.valores().SuperfosfatoTriplo;
     
       case 3 : return tipo.Tipo.valores().MAP; 
       
       case 4: return tipo.Tipo.valores().DAP; 
       
       case 5: return tipo.Tipo.valores().TermofosfatoYoorin;
       
       case 6: return tipo.Tipo.valores().FosfatoReatArad; 
       
       case 7: return tipo.Tipo.valores().FosfatoReativodeGafsa; 
       
       case 8: return tipo.Tipo.valores().FosfatoReativoDaoul; 
       
       case 9: return tipo.Tipo.valores().FosfatoNatPatodeMinas; 
       
       case 10: return tipo.Tipo.valores().EscoriadeThomas; 
       
       case 11: return tipo.Tipo.valores().ÁcidoFosfórico; 
       
       case 12: return tipo.Tipo.valores().SuperfosfatoMagnesiano;
       
      
      }
       return "";
   
   }
   
     public String tipoFosforoCorrecao(int fonteFosforo){ 
         
         switch(fonteFosforo){
         
             case 1: case 12:  return tipo.TipoCorrecao.valores().enxofre;
           
             case 5: return tipo.TipoCorrecao.valores().magnesio; 
         
     }
       return "";
   
   

} 
     
     
  public String tipoFosforoSegundaCorrecao(int fonteFosforo){ 
         
         switch(fonteFosforo){
         
             case 1: case 2: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:  return tipo.TipoCorrecao.valores().calcio;
           
             case 3: case 4:  return tipo.TipoCorrecao.valores().nitrogenio; 
         
     }
       return "";
   
   

}
       
} 

