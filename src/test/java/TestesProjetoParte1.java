





import org.junit.Test;



import static org.junit.jupiter.api.Assertions.*;



public class TestesProjetoParte1   {
    
    @Test
     public void testaValoresIdeaisArgiloso() {
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getFosforo(),
                TexturaSolo.ARGILOSO.calculaValorIdeal().getFosforo());
        
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getAluminio());
        
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminioHidrogenio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getAluminioHidrogenio());
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getCalcio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getCalcio());
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getEnxofre(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getEnxofre());
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getMagnesio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getMagnesio());
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getPotassio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getPotassio());
    }
    
    @Test
    public void testaValoresIdeaisTexturaMedia() {
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getFosforo(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getFosforo());
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getAluminio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getAluminio());
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getAluminioHidrogenio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getAluminioHidrogenio());
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getCalcio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getCalcio());
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getEnxofre(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getEnxofre());
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getMagnesio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getMagnesio());
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getPotassio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getPotassio());
                
    }

    @Test
    public void testeCalculoSCmol() {
        assertEquals(7.54, 
                new EquilibrioSolo().calculaSCmol(0.15, 5.76, 1.63));
        
    }

    @Test
    public void testaCalculaCTCCmol() {
        assertEquals(12.89, 
                new EquilibrioSolo().calculaCTCCmol(0.15, 5.76, 1.63, 5.35));
    }

    @Test
    public void testaVPercentual() {
        assertEquals(58.494957331264544, 
                new EquilibrioSolo().calculaPercentual(
                        new EquilibrioSolo().calculaSCmol(0.15, 5.76, 1.63),
                        new EquilibrioSolo().calculaCTCCmol(0.15, 5.76, 1.63, 5.35)
                )
        );
    }

   
    


  

    
}
