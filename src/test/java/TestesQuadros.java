import org.junit.jupiter.api.Test;
import CorrecaoParte1.EquilibrioSolo;
import CorrecaoParte1.TexturaSolo;
import CorrecaoParte1.TipoNutrientes;
import CorrecaoParte2.TiposPotassio.PotassagemEnum;
import static org.junit.jupiter.api.Assertions.*;
import CorrecaoParte2.TiposFosforo.ACIDOFOSFORICO;
import CorrecaoParte2.TiposFosforo.FosfatagemCalcioEnum;
import CorrecaoParte2.TiposFosforo.FosfatagemNitrogenioEnum;
import CorrecaoParte2.TiposFosforo.MULTIFOSFATOMAGNESIANO;
import CorrecaoParte2.TiposFosforo.SUPERFOSFATOSIMPLES;
import CorrecaoParte2.TiposFosforo.TERMOFOSFATOYORIN;
import CorrecaoParte2.TiposPotassio.PotassagemEnum;
import org.junit.jupiter.api.Test;

public class TestesQuadros {
	 @Test
	 public void testeTeoresSolo() {
		assertEquals(7.54, new EquilibrioSolo().calculaSCmol(0.15, 5.76, 1.63),1);//Calculo Scmol
		assertEquals(12.89, new EquilibrioSolo().calculaCTCCmol(0.15, 5.76, 1.63, 5.35),1);//Calculo CTCCmol
		assertEquals(58.494957331264544, new EquilibrioSolo().calculaPercentual(
	                        new EquilibrioSolo().calculaSCmol(0.15, 5.76, 1.63),
	                        new EquilibrioSolo().calculaCTCCmol(0.15, 5.76, 1.63, 5.35)),1);//CalculoVPercentual
		
		//Teste Nutrientes solo Argiloso
		assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getFosforo(),
	                TexturaSolo.ARGILOSO.calculaValorIdeal().getFosforo(),1);
	        
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getAluminio(),1);
        
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminioHidrogenio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getAluminioHidrogenio(),1);
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getCalcio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getCalcio(),1);
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getEnxofre(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getEnxofre(),1);
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getMagnesio(), 
                TexturaSolo.ARGILOSO.calculaValorIdeal().getMagnesio(),1);
        assertEquals(new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getPotassio(), 
	            TexturaSolo.ARGILOSO.calculaValorIdeal().getPotassio(),1);
        
        //Teste Nutrientes textura media
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getFosforo(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getFosforo(),1);
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getAluminio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getAluminio(),1);
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getAluminioHidrogenio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getAluminioHidrogenio());
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getCalcio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getCalcio(),1);
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getEnxofre(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getEnxofre());
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getMagnesio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getMagnesio(),1);
        assertEquals(new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0).getPotassio(), 
                TexturaSolo.TEXTURA_MEDIA.calculaValorIdeal().getPotassio(),1);
        
        // Testes que nao tinham no projeto base, MoPercentual e Carbono
		assertEquals(3.07, new EquilibrioSolo().MOPercentual(30.7),1);
		assertEquals(17.84, new EquilibrioSolo().calculaCarbono(new EquilibrioSolo().MOPercentual(30.7)),1);

	 }
}
