



import org.junit.Test;







import static org.junit.jupiter.api.Assertions.*;
public class TestesProjetoParte2 {

	
	// ----------------------- SUPERFOSFATO SIMPLES --------------------------
	
    @Test 
    public void CustoCorrecaoFosforo() {
    	
    	assertEquals(156.178, 
    			new SUPERFOSFATOSIMPLES().CustoCorrecaoFosforo(1260.00, 8.59, 12));
    	
    	
    }
	
	
    
    @Test
    public void QuantidadeAplicadaSUPERFOSFATOSIMPLES() {
	
	assertEquals(123.95079365079366 , 
		
			new SUPERFOSFATOSIMPLES().QuantidadeAplicada(12, 8.59));
  
    	
    }
    
    
   
   
    
    
   @Test 
    
    public void CorrecaoKghaEnxofre() {
    	assertEquals(12.395079365079367, 
    			new SUPERFOSFATOSIMPLES().CorrecaoFosforoEnxofre(12, 8.59));
    }
    
    
    
    
    
    @Test 
    
    public void CorrecaoKghaCalcio() {
    	assertEquals(34.70622222222223, 
    			new SUPERFOSFATOSIMPLES().CorrecaoFosforoCalcio(12,  8.59));
    }
    
    
    
    
    
    
    
    //----------------------------- SUPERFOSFATOTRIPLO ------------------------------------------
    
    
    @Test
   public void QuantidadeAplicadaSUPERFOSFATOTRIPLO() {
	
	assertEquals(54.41742160278746 , 
		
			FosfatagemCalcioEnum.SUPERFOSFATOTRIPLO.QuantidadeAplicada(12, 8.59));
  
    	
    }
    
    
    
    
    
    @Test 
    
    public void CorrecaoCalcioFosfatoTriplo() {
    	
    	assertEquals(10.883484320557493, 
    			
    			FosfatagemCalcioEnum.SUPERFOSFATOTRIPLO.CorrecaoFosforoCalcio(12, 8.59));
    	
    	
    }
    
    
    
    // -------------------------- MAP ------------------------------------------------
    
    
    @Test
   public void QuantidadeAplicadaMAP() {
	
	assertEquals(46.481547619047625 , 
		
			FosfatagemNitrogenioEnum.MAP.QuantidadeAplicada(12,8.59));
  
    	
    }
    
    
    
 @Test 
    
    public void CorrecaoNitrogenioMAP() {
    	
    	assertEquals(4.183339285714286, 
    			
    			FosfatagemNitrogenioEnum.MAP.CorrecaoNitrogenio(12, 8.59));
    	
    	
    }
    
    
  // -------------------------------------- DAP -----------------------------------
 
 @Test
public void QuantidadeAplicadaDAP() {
	
	assertEquals(49.58031746031747 , 
		
			FosfatagemNitrogenioEnum.DAP.QuantidadeAplicada(12,8.59));

 	
 }
 
    
    
 @Test 
 
 public void CorrecaoNitrogenioDAP() {
 	
 	assertEquals(7.932850793650795, 
 			
 			FosfatagemNitrogenioEnum.DAP.CorrecaoNitrogenio(12, 8.59));
 	
 	
 }
 
 // ------------------------------------------ TERMOFOSFATOYORIN --------------------------------------------------------
 
 @Test
public void QuantidadeAplicadaTERMOFOSFATOYORIN() {
	
	assertEquals(123.95079365079366 , 
		
		new TERMOFOSFATOYORIN().QuantidadeAplicada(12, 8.59));

 	
 }
 
 
 @Test 
 
 public void CorrecaoMAgnesioTERMOFOSFATOYORIN() {
 	
 	assertEquals(18.59261904761905, 
 			
 			new TERMOFOSFATOYORIN().CorrecaoMagnesio(12,  8.59));
 	
 	
 }
 
 
 

 @Test 
 
 public void CorrecaoCalcioTERMOFOSFATOYORIN() {
 	
 	assertEquals(34.70622222222223, 
 			
 			new TERMOFOSFATOYORIN().CorrecaoFosforoCalcio(12, 8.59));
 	
 	
 }
 
 
 // -------------------------------- FOSFATOREADARAT ----------------------------------------
 
 
 @Test
public void QuantidadeAplicadaFOSFATOREADARAT() {
	
	assertEquals(67.60952380952381 , 
		
			FosfatagemCalcioEnum.FOSFATOREATARAD.QuantidadeAplicada(12,8.59)); 

 	
 }
 
 
 @Test 
 
 public void CorrecaoCalcioFOSFATOREADARAT() {
 	
 	assertEquals(35.15695238095238, 
 			
 			FosfatagemCalcioEnum.FOSFATOREATARAD.CorrecaoFosforoCalcio(12, 8.59));
 	
 	
 }

 
 
 
 
 // --------------------------- FOSFATOREATIVOGAFSA -----------------------------------
 
 

 
 @Test
public void QuantidadeAplicadaFOSFATOREATIVOGAFSA() {
	
	assertEquals(31.811822660098528 , 
		
			FosfatagemCalcioEnum.FOSFATOREATIVOGAFSA.QuantidadeAplicada(10 ,8.59)); 

 	
 }
 
 
 
 
 @Test 
 
 public void CorrecaoCalcioFOSFATOREATIVOGAFSA() {
 	
 	assertEquals(14.537038961038965, 
 			
 			FosfatagemCalcioEnum.FOSFATOREATIVOGAFSA.CorrecaoFosforoCalcio(10,8.59));
 	
 	
 }
 
 
 
 
// ------------------------- FOSFATOREATIVODAOUI -------------------------- 
 
 
 @Test
public void QuantidadeAplicadaFOSFATOREATIVODAOUI() {
	
	assertEquals(28.82946428571429 , 
		
			FosfatagemCalcioEnum.FOSFATOREATIVODAOUI.QuantidadeAplicada(10,  8.59)); 

 	
 }
 
 
 
 
 @Test 
 
 public void CorrecaoCalcioFOSFATOREATIVDAOOUI() {
 	
 	assertEquals(12.97325892857143, 
 			
 			FosfatagemCalcioEnum.FOSFATOREATIVODAOUI.CorrecaoFosforoCalcio(10,8.59));
 	
 	
 }
 
 
 
 // ------------------------------ FOSFATO PATO DE MINAS --------------------------------------
 
 @Test
public void QuantidadeAplicadaFOSFATOPATODEMINAS() {
	
	assertEquals(38.439285714285724 , 
		
			FosfatagemCalcioEnum.FOSFATOPATODEMINAS.QuantidadeAplicada(10,  8.59)); 

 	
 }
 
 
 
 
 @Test
public void CorrecaoCalcioFOSFATOPATODEMINAS() {
	
	assertEquals(10.763000000000003 , 
		
			FosfatagemCalcioEnum.FOSFATOPATODEMINAS.CorrecaoFosforoCalcio( 10, 8.59)); 

 	
 }
 
 
 
 // ----------------------- ESCORIA DE THOMAS ----------------------------------------------
 
 
 @Test
public void QuantidadeAplicadaESCORIADETHOMAS() {
	
	assertEquals(49.867181467181474 , 
		
			FosfatagemCalcioEnum.ESCORIADETHOMAS.QuantidadeAplicada(10,  8.59)); 

 	
 }
 
 
 @Test
public void CorrecaoKgha2ESCORIADETHOMAS() {
	
	assertEquals(21.941559845559848 , 
		
			FosfatagemCalcioEnum.ESCORIADETHOMAS.CorrecaoFosforoCalcio(10, 8.59)); 

 	
 }
 
 
 
 
 // ------------------------- ACIDO FOSFORICO -------------------------------------------
 
 
 
 
 @Test
public void QuantidadeAplicadaACIDOFOSFORICO() {
	
	assertEquals(17.741208791208795 , 
		
		new ACIDOFOSFORICO().QuantidadeAplicada(10, 8.59)); 

 	
 }
 
 
 
 // ----------------------------  MULTIFOSFATO MAGNESIANO ----------------------------------------------
 
 @Test
public void QuantidadeAplicadaMULTIFOSFATOMAGNESIANO() {
	
	assertEquals(51.25238095238096 , 
		
			new MULTIFOSFATOMAGNESIANO().QuantidadeAplicada(10,  8.59)); 

 	
 }
 
 
 
 @Test
public void CorrecaoKghaMULTIFOSFATOMAGNESIANO() {
	
	assertEquals(5.637761904761906 , 
		
		new MULTIFOSFATOMAGNESIANO().CorrecaoFosforoEnxofre( 10, 8.59)); 

 	
 }
 
 
 
 

 @Test
public void CorrecaoKgha2MULTIFOSFATOMAGNESIANO() {
	
	assertEquals(9.225428571428573 , 
		
		new MULTIFOSFATOMAGNESIANO().CorrecaoFosforoCalcio( 10, 8.59)); 

 	
 }
 
 
 
 
 
    
    
    

}
