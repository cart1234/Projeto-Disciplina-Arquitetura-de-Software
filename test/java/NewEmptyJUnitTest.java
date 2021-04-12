
package com.mycompany.projetocorrecaosolo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewEmptyJUnitTest   {
    
    @Test
    public void testaValoresIdeaisArgiloso() {
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getFosforo(),
                TexturaSolo.ARGILOSO.calculaValorIdeal().getFosforo());
        
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getAluminio());
        
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminioHidrogenio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getAluminioHidrogenio());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getCalcio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getCalcio());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getEnxofre(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getEnxofre());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getMagnesio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getMagnesio());
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getPotassio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getPotassio());
    }
    
    @Test
    public void testaValoresIdeaisTexturaMedia() {
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getFosforo(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getFosforo());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getAluminio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getAluminio());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getAluminioHidrogenio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getAluminioHidrogenio());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getCalcio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getCalcio());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getEnxofre(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getEnxofre());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getMagnesio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getMagnesio());
        assertEquals(new Nutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getPotassio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getPotassio());
                
    }

    @Test
    public void testeCalculoSCmol() {
        assertEquals(7.54, 
                new EquilibrioCorrecao().calculoSCmol(0.15, 5.76, 1.63));
        
    }

    @Test
    public void testaCalculaCTCCmol() {
        assertEquals(12.89, 
                new EquilibrioCorrecao().calculaCTCCmol(0.15, 5.76, 1.63, 5.35));
    }

    @Test
    public void testaVPercentual() {
        assertEquals(58.494957331264544, 
                new EquilibrioCorrecao().calculoVPercentual(
                        new EquilibrioCorrecao().calculoSCmol(0.15, 5.76, 1.63),
                        new EquilibrioCorrecao().calculaCTCCmol(0.15, 5.76, 1.63, 5.35)
                )
        );
    }

    @Test
    public void testaMOPercentual() {
        assertEquals(3.07, new EquilibrioCorrecao().calculaMOPercentual(30.7));
    }
    
    @Test
    public void testaCalculaCarbono() {
        assertEquals(17.848837209302324, 
                new EquilibrioCorrecao().calculaCarbono(
                        new EquilibrioCorrecao().calculaMOPercentual(30.7)
                )
        );
    }
    
    
      @Test
    public void testaCalculaCorrecaoFosforo() {
        assertEquals(17.848837209302324, 
                new EquilibrioCorrecao().calculaCarbono(
                        new EquilibrioCorrecao().calculaMOPercentual(30.7)
                )
        );
    }


     @Test
     public void getMgFosforo() {
      assertEquals(2.41,
              new CorrecaoeRecuperacao().getMgFosforo(11, 8.59) );

     }

     @Test
     public void getKgFosforo() {
        assertEquals(4.82,
                new CorrecaoeRecuperacao().getKgFosforo(11, 8.59));

     }

     @Test
    public void getGkPOFosforo(){

        assertEquals(11.0378,
        new CorrecaoeRecuperacao().getGkPOFosforo(11, 8.59));
    }

    @Test
    public void getP2o5(){
        assertEquals(0.15768285714285712,
       new CorrecaoeRecuperacao().getP2o5(11,8.59,70) );

    }

    @Test
    public void  porcentagemP2Os() {
        assertEquals(18.0,
                new CorrecaoeRecuperacao().porcentagemP2Os(1));


    }

    @Test
     public void QuantidadeAplicada(){
        assertEquals(51.25238095238096,
                new CorrecaoeRecuperacao().QuantidadeAplicada(10,1,70,8.59));
  }

    @Test
    public void  CorrecaoKgha(){
        assertEquals( 5.125238095238096,
                new CorrecaoeRecuperacao().CorrecaoKgha(10,1,70,8.59));
    }


      @Test
      public void CorrecaoKgha2(){
        assertEquals(14.35066666666667,
                new CorrecaoeRecuperacao().CorrecaoKgha2(1,70,10,8.59));
      }


      @Test
      public void CustoCorrecaoFosforo(){
        assertEquals(322.2720634920635,
                new CorrecaoeRecuperacao().CustoCorrecaoFosforo(2600.00, 1, 70,
                8.59, 12 ));
      }

    
}
