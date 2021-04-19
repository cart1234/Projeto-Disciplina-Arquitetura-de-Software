



import org.junit.Test;







import static org.junit.jupiter.api.Assertions.*;
public class TestesProjetoParte2 {

	
	
    @Test 
    public void CustoCorrecaoFosforo() {
    	
    	assertEquals(156.178, 
    			FosfatagemEnum.SUPERFOSFATOSIMPLES.CustoCorrecaoFosforo(1260.00, 8.59, 12));
    	
    	
    }
	
	
    
    @Test
    public void QuantidadeAplicadaSUPERFOSFATOSIMPLES() {
	
	assertEquals(123.95079365079366 , 
		
			FosfatagemEnum.SUPERFOSFATOSIMPLES.QuantidadeAplicada(12, 8.59));
  
    	
    }
    
    
    @Test 
    
    public void CorrecaoKgha() {
    	assertEquals(12.395079365079367, 
    			FosfatagemEnum.SUPERFOSFATOSIMPLES.CorrecaoFosforoEnxofre(12, 8.59));
    }
    
    
    
    @Test 
    
    public void CorrecaoKgha2() {
    	assertEquals(34.70622222222223, 
    			FosfatagemEnum.SUPERFOSFATOSIMPLES.CorrecaoFosforoCalcio(12,  8.59));
    }
    
    //----------------------------- SUPERFOSFATOTRIPLO ------------------------------------------
    
    
    @Test
   public void QuantidadeAplicadaSUPERFOSFATOTRIPLO() {
	
	assertEquals(54.41742160278746 , 
		
			FosfatagemEnum.SUPERFOSFATOTRIPLO.QuantidadeAplicada(12, 8.59));
  
    	
    }
    
    
    
    
    
    @Test 
    
    public void CorrecaoKghaSUPERFOSFATOTRIPLO() {
    	
    	assertEquals(10.883484320557493, 
    			
    			FosfatagemEnum.SUPERFOSFATOTRIPLO.CorrecaoFosforoCalcio(12, 8.59));
    	
    	
    }
    
    
    
    
    @Test
   public void QuantidadeAplicadaMAP() {
	
	assertEquals(46.481547619047625 , 
		
			FosfatagemEnum.MAP.QuantidadeAplicada(12,8.59));
  
    	
    }
    
    
    
 @Test 
    
    public void CorrecaoKghaMAP() {
    	
    	assertEquals(4.183339285714286, 
    			
    			FosfatagemEnum.MAP.CorrecaoFosforoNitrogenio(12, 8.59));
    	
    	
    }
    
    
  // -------------------------------------- DAP -----------------------------------
 
 @Test
public void QuantidadeAplicadaDAP() {
	
	assertEquals(49.58031746031747 , 
		
			FosfatagemEnum.DAP.QuantidadeAplicada(12,8.59));

 	
 }
 
    
    
 @Test 
 
 public void CorrecaoKghaDAP() {
 	
 	assertEquals(7.932850793650795, 
 			
 			FosfatagemEnum.DAP.CorrecaoFosforoNitrogenio(12, 8.59));
 	
 	
 }
 
 // ------------------------------------------ TERMOFOSFATOYORIN --------------------------------------------------------
 
 @Test
public void QuantidadeAplicadaTERMOFOSFATOYORIN() {
	
	assertEquals(123.95079365079366 , 
		
			FosfatagemEnum.TERMOSFOSFATOYORIN.QuantidadeAplicada(12, 8.59));

 	
 }
 
 
 @Test 
 
 public void CorrecaoKghaTERMOFOSFATOYORIN() {
 	
 	assertEquals(18.59261904761905, 
 			
 			FosfatagemEnum.TERMOSFOSFATOYORIN.CorrecaoFosforoMagnesio(12,  8.59));
 	
 	
 }
 
 
 

 @Test 
 
 public void CorrecaoKgha2TERMOFOSFATOYORIN() {
 	
 	assertEquals(34.70622222222223, 
 			
 			FosfatagemEnum.TERMOSFOSFATOYORIN.CorrecaoFosforoCalcio(12, 8.59));
 	
 	
 }
 
 
 // -------------------------------- FOSFATOREADARAT ----------------------------------------
 
 
 @Test
public void QuantidadeAplicadaFOSFATOREADARAT() {
	
	assertEquals(67.60952380952381 , 
		
			FosfatagemEnum.FOSFATOREATARAD.QuantidadeAplicada(12,8.59)); 

 	
 }
 
 
 @Test 
 
 public void CorrecaoKgha2FOSFATOREADARAT() {
 	
 	assertEquals(35.15695238095238, 
 			
 			FosfatagemEnum.FOSFATOREATARAD.CorrecaoFosforoCalcio(12, 8.59));
 	
 	
 }

 
 
 
 
 // --------------------------- FOSFATOREATIVOGAFSA -----------------------------------
 
 

 
 @Test
public void QuantidadeAplicadaFOSFATOREATIVOGAFSA() {
	
	assertEquals(31.811822660098528 , 
		
			FosfatagemEnum.FOSFATOREATIVOGAFSA.QuantidadeAplicada(10 ,8.59)); 

 	
 }
 
 
 
 
 @Test 
 
 public void CorrecaoKgha2FOSFATOREATIVOGAFSA() {
 	
 	assertEquals(14.537038961038965, 
 			
 			FosfatagemEnum.FOSFATOREATIVOGAFSA.CorrecaoFosforoCalcio(10,8.59));
 	
 	
 }
 
 
 
 
// ------------------------- FOSFATOREATIVODAOUI -------------------------- 
 
 
 @Test
public void QuantidadeAplicadaFOSFATOREATIVODAOUI() {
	
	assertEquals(28.82946428571429 , 
		
			FosfatagemEnum.FOSFATOREATIVODAOUI.QuantidadeAplicada(10,  8.59)); 

 	
 }
 
 
 
 
 @Test 
 
 public void CorrecaoKgha2FOSFATOREATIVDAOOUI() {
 	
 	assertEquals(12.97325892857143, 
 			
 			FosfatagemEnum.FOSFATOREATIVODAOUI.CorrecaoFosforoCalcio(10,8.59));
 	
 	
 }
 
 
 
 // ------------------------------ FOSFATO PATO DE MINAS --------------------------------------
 
 @Test
public void QuantidadeAplicadaFOSFATOPATODEMINAS() {
	
	assertEquals(38.439285714285724 , 
		
			FosfatagemEnum.FOSFATOPATODEMINAS.QuantidadeAplicada(10,  8.59)); 

 	
 }
 
 
 
 
 @Test
public void CorrecaoKgha2FOSFATOPATODEMINAS() {
	
	assertEquals(10.763000000000003 , 
		
			FosfatagemEnum.FOSFATOPATODEMINAS.CorrecaoFosforoCalcio( 10, 8.59)); 

 	
 }
 
 
 
 // ----------------------- ESCORIA DE THOMAS ----------------------------------------------
 
 
 @Test
public void QuantidadeAplicadaESCORIADETHOMAS() {
	
	assertEquals(49.867181467181474 , 
		
			FosfatagemEnum.ESCORIADETHOMAS.QuantidadeAplicada(10,  8.59)); 

 	
 }
 
 
 @Test
public void CorrecaoKgha2ESCORIADETHOMAS() {
	
	assertEquals(21.941559845559848 , 
		
			FosfatagemEnum.ESCORIADETHOMAS.CorrecaoFosforoCalcio(10, 8.59)); 

 	
 }
 
 
 
 
 // ------------------------- ACIDO FOSFORICO -------------------------------------------
 
 
 
 
 @Test
public void QuantidadeAplicadaACIDOFOSFORICO() {
	
	assertEquals(17.741208791208795 , 
		
			FosfatagemEnum.ACIDOFOSFORICO.QuantidadeAplicada(10, 8.59)); 

 	
 }
 
 
 
 // ----------------------------  MULTIFOSFATO MAGNESIANO ----------------------------------------------
 
 @Test
public void QuantidadeAplicadaMULTIFOSFATOMAGNESIANO() {
	
	assertEquals(51.25238095238096 , 
		
			FosfatagemEnum.MULTIFOSFATOMAGNESIANO.QuantidadeAplicada(10,  8.59)); 

 	
 }
 
 
 
 @Test
public void CorrecaoKghaMULTIFOSFATOMAGNESIANO() {
	
	assertEquals(5.637761904761906 , 
		
			FosfatagemEnum.MULTIFOSFATOMAGNESIANO.CorrecaoFosforoEnxofre( 10, 8.59)); 

 	
 }
 
 
 
 

 @Test
public void CorrecaoKgha2MULTIFOSFATOMAGNESIANO() {
	
	assertEquals(9.225428571428573 , 
		
			FosfatagemEnum.MULTIFOSFATOMAGNESIANO.CorrecaoFosforoCalcio( 10, 8.59)); 

 	
 }
 
 
 
 
 
    
    
    

}
