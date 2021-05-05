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
	 @Test
	public void testeCorrecaoFosforo() {
		//Quantidade aplicada para cada fonte de fosforo
		assertEquals(123.95, new SUPERFOSFATOSIMPLES().QuantidadeAplicada(12, 8.59),1);
                assertEquals(54.41742160278746 , FosfatagemCalcioEnum.SUPERFOSFATOTRIPLO.QuantidadeAplicada(12, 8.59),1);
                assertEquals(46.481547619047625 , FosfatagemNitrogenioEnum.MAP.QuantidadeAplicada(12,8.59),1);
                assertEquals(49.58031746031747 , FosfatagemNitrogenioEnum.DAP.QuantidadeAplicada(12,8.59));
                assertEquals(123.95 , new TERMOFOSFATOYORIN().QuantidadeAplicada(12, 8.59),1);
                assertEquals(31.811822660098528 , FosfatagemCalcioEnum.FOSFATOREATIVOGAFSA.QuantidadeAplicada(10 ,8.59)); 
                assertEquals(28.82946428571429 , FosfatagemCalcioEnum.FOSFATOREATIVODAOUI.QuantidadeAplicada(10,  8.59));
                assertEquals(38.439285714285724 ,FosfatagemCalcioEnum.FOSFATOPATODEMINAS.QuantidadeAplicada(10,  8.59)); 
                assertEquals(49.867181467181474 ,FosfatagemCalcioEnum.ESCORIADETHOMAS.QuantidadeAplicada(10,  8.59));
                assertEquals(51.25238095238096, new MULTIFOSFATOMAGNESIANO().QuantidadeAplicada(10,  8.59)); 

                //Custo Correcao
		assertEquals(156.18, new SUPERFOSFATOSIMPLES().CustoCorrecaoFosforo(1260.00, 8.59, 12),1); 
		// Nutrientes Adicionais 
		assertEquals(12.4, new SUPERFOSFATOSIMPLES().CorrecaoFosforoEnxofre(12, 8.59),1);
		assertEquals(34.70622222222223, new SUPERFOSFATOSIMPLES().CorrecaoFosforoCalcio(12,  8.59));
                assertEquals(10.883484320557493,FosfatagemCalcioEnum.SUPERFOSFATOTRIPLO.CorrecaoFosforoCalcio(12, 8.59));
                assertEquals(4.183339285714286, FosfatagemNitrogenioEnum.MAP.CorrecaoNitrogenio(12, 8.59));
		assertEquals(7.932850793650795, FosfatagemNitrogenioEnum.DAP.CorrecaoNitrogenio(12, 8.59));
                assertEquals(35.15695238095238, FosfatagemCalcioEnum.FOSFATOREATARAD.CorrecaoFosforoCalcio(12, 8.59));
                assertEquals(14.537038961038965,FosfatagemCalcioEnum.FOSFATOREATIVOGAFSA.CorrecaoFosforoCalcio(10,8.59));
                assertEquals(12.97325892857143, FosfatagemCalcioEnum.FOSFATOREATIVODAOUI.CorrecaoFosforoCalcio(10,8.59));
                assertEquals(10.763000000000003,FosfatagemCalcioEnum.FOSFATOPATODEMINAS.CorrecaoFosforoCalcio( 10, 8.59));
                assertEquals(21.941559845559848,FosfatagemCalcioEnum.ESCORIADETHOMAS.CorrecaoFosforoCalcio(10, 8.59)); 
                assertEquals(17.741208791208795,new ACIDOFOSFORICO().QuantidadeAplicada(10, 8.59)); 
                assertEquals(5.637761904761906 ,new MULTIFOSFATOMAGNESIANO().CorrecaoFosforoEnxofre( 10, 8.59)); 
                assertEquals(9.225428571428573 ,new MULTIFOSFATOMAGNESIANO().CorrecaoFosforoCalcio( 10, 8.59));

        }
        @Test
        public void testeCorrecaoPotassio() {
                //Quantidade aplicar
                assertEquals(450.5462068965517 ,PotassagemEnum.CLORETOPOTASSIO.QuantidadeAplicada(3.0, 0.15, 
                5.76, 1.63, 5.35));
                assertEquals(502.5323076923077 , PotassagemEnum.SULFATOPOTASSIO.QuantidadeAplicada(3.0, 0.15, 
				5.76, 1.63, 5.35));
                assertEquals(1187.8036363636363 , PotassagemEnum.SULFATOPOTASSIOMAGNESIO.QuantidadeAplicada(3.0, 0.15, 
                                5.76, 1.63, 5.35));
                assertEquals(593.9018181818182 , PotassagemEnum.POTASSIO2.QuantidadeAplicada(3.0, 0.15, 
                                5.76, 1.63, 5.35));
                assertEquals(593.9018181818182 , PotassagemEnum.POTASSIO2.QuantidadeAplicada(3.0, 0.15, 
                                5.76, 1.63, 5.35));
                //Custos por hectare
                assertEquals(1126.3655172413794 , PotassagemEnum.CLORETOPOTASSIO.CustoKgha(2500.00, 3.0, 0.15, 
				5.76, 1.63, 5.35));
                assertEquals(675.4034215384615 ,PotassagemEnum.SULFATOPOTASSIO.CustoKgha(1344.00, 3.0, 0.15, 
                                5.76, 1.63, 5.35));
                assertEquals(1465.7496872727272 , PotassagemEnum.SULFATOPOTASSIOMAGNESIO.CustoKgha(1234.00, 3.0, 0.15, 
                                5.76, 1.63, 5.35));
                assertEquals(3.0 , PotassagemEnum.CALCULOPOTASSIO.PotassioPercentualIdeal());
                assertEquals(3.0 , PotassagemEnum.CALCULOPOTASSIO.participacaoPotassioCorrecao(3.0));
        }
}
