



import org.junit.Test;







import static org.junit.jupiter.api.Assertions.*;
public class TestesProjetoParte2 {

	
	
    @Test 
    public void CustoCorrecaoFosforo() {
    	
    	assertEquals(123.0057142857143, 
    			FosfatagemEnum.SUPERFOSFATOSIMPLES.CustoCorrecaoFosforo(2400.00, 70, 8.59, 10));
    	
    	
    }
	
	
    
    @Test
    public void QuantidadeAplicadaSUPERFOSFATOSIMPLES() {
	
	assertEquals(51.25238095238096 , 
		
			FosfatagemEnum.SUPERFOSFATOSIMPLES.QuantidadeAplicada(10,70, 8.59));
  
    	
    }
    
    
    @Test 
    
    public void CorrecaoKgha() {
    	assertEquals(5.125238095238096, 
    			FosfatagemEnum.SUPERFOSFATOSIMPLES.CorrecaoKgha(10, 70, 8.59));
    }
    
    
    
    @Test 
    
    public void CorrecaoKgha2() {
    	assertEquals(14.35066666666667, 
    			FosfatagemEnum.SUPERFOSFATOSIMPLES.CorrecaoKgha2(10, 70, 8.59));
    }
    
    
    
    
    @Test
   public void QuantidadeAplicadaSUPERFOSFATOTRIPLO() {
	
	assertEquals(22.501045296167252 , 
		
			FosfatagemEnum.SUPERFOSFATOTRIPLO.QuantidadeAplicada(10,70, 8.59));
  
    	
    }
    
    
    @Test 
    
    public void CorrecaoKghaSUPERFOSFATOTRIPLO() {
    	
    	assertEquals(4.500209059233451, 
    			
    			FosfatagemEnum.SUPERFOSFATOTRIPLO.CorrecaoKgha2(10, 70, 8.59));
    	
    	
    }
    
    
    
    
    @Test
   public void QuantidadeAplicadaMAP() {
	
	assertEquals(19.21964285714286 , 
		
			FosfatagemEnum.MAP.QuantidadeAplicada(10,70, 8.59));
  
    	
    }
    
    
    
 @Test 
    
    public void CorrecaoKghaMAP() {
    	
    	assertEquals(1.7297678571428572, 
    			
    			FosfatagemEnum.MAP.CorrecaoKgha2(10, 70, 8.59));
    	
    	
    }
    
    
    
 
 @Test
public void QuantidadeAplicadaDAP() {
	
	assertEquals(20.500952380952384 , 
		
			FosfatagemEnum.DAP.QuantidadeAplicada(10,70, 8.59));

 	
 }
 
    
    
 @Test 
 
 public void CorrecaoKghaDAP() {
 	
 	assertEquals(3.2801523809523814, 
 			
 			FosfatagemEnum.DAP.CorrecaoKgha2(10, 70, 8.59));
 	
 	
 }
 
 
 
 @Test
public void QuantidadeAplicadaTERMOFOSFATOYORIN() {
	
	assertEquals(51.25238095238096 , 
		
			FosfatagemEnum.TERMOSFOSFATOYORIN.QuantidadeAplicada(10,70,8.59));

 	
 }
 
 
 @Test 
 
 public void CorrecaoKghaTERMOFOSFATOYORIN() {
 	
 	assertEquals(7.687857142857144, 
 			
 			FosfatagemEnum.TERMOSFOSFATOYORIN.CorrecaoKgha(10, 70, 8.59));
 	
 	
 }
 
 
 

 @Test 
 
 public void CorrecaoKgha2TERMOFOSFATOYORIN() {
 	
 	assertEquals(14.35066666666667, 
 			
 			FosfatagemEnum.TERMOSFOSFATOYORIN.CorrecaoKgha2(10, 70, 8.59));
 	
 	
 }
 
 
 
 @Test
public void QuantidadeAplicadaFOSFATOREADARAT() {
	
	assertEquals(27.95584415584416 , 
		
			FosfatagemEnum.FOSFATOREATARAD.QuantidadeAplicada(10,70,8.59)); 

 	
 }
 
 
 @Test 
 
 public void CorrecaoKgha2FOSFATOREADARAT() {
 	
 	assertEquals(14.537038961038965, 
 			
 			FosfatagemEnum.FOSFATOREATARAD.CorrecaoKgha2(70,10,8.59));
 	
 	
 }
 
 
 
 
 
 @Test
public void QuantidadeAplicadaFOSFATOREATIVOGAFSA() {
	
	assertEquals(31.811822660098528 , 
		
			FosfatagemEnum.FOSFATOREATIVOGAFSA.QuantidadeAplicada(10,70,8.59)); 

 	
 }
 
 
 
 
 @Test 
 
 public void CorrecaoKgha2FOSFATOREATIVOGAFSA() {
 	
 	assertEquals(14.537038961038965, 
 			
 			FosfatagemEnum.FOSFATOREATIVOGAFSA.CorrecaoKgha2(70,10,8.59));
 	
 	
 }
 
 
 
 
 @Test
public void QuantidadeAplicadaFOSFATOREATIVODAOUI() {
	
	assertEquals(28.82946428571429 , 
		
			FosfatagemEnum.FOSFATOREATIVODAOUI.QuantidadeAplicada(10, 70, 8.59)); 

 	
 }
 
 
 
 
 @Test 
 
 public void CorrecaoKgha2FOSFATOREATIVDAOOUI() {
 	
 	assertEquals(12.97325892857143, 
 			
 			FosfatagemEnum.FOSFATOREATIVODAOUI.CorrecaoKgha2(70,10,8.59));
 	
 	
 }
 
 
 
 @Test
public void QuantidadeAplicadaFOSFATOPATODEMINAS() {
	
	assertEquals(38.43928571428572 , 
		
			FosfatagemEnum.FOSFATOPATODEMINAS.QuantidadeAplicada(10, 70, 8.59)); 

 	
 }
 
 
 
 
 @Test
public void CorrecaoKgha2FOSFATOPATODEMINAS() {
	
	assertEquals(10.763000000000002 , 
		
			FosfatagemEnum.FOSFATOPATODEMINAS.CorrecaoKgha2(70, 10, 8.59)); 

 	
 }
 
 
 
 @Test
public void QuantidadeAplicadaESCORIADETHOMAS() {
	
	assertEquals(49.867181467181474 , 
		
			FosfatagemEnum.ESCORIADETHOMAS.QuantidadeAplicada(10, 70, 8.59)); 

 	
 }
 
 
 @Test
public void CorrecaoKgha2ESCORIADETHOMAS() {
	
	assertEquals(21.941559845559848 , 
		
			FosfatagemEnum.ESCORIADETHOMAS.CorrecaoKgha2(70, 10, 8.59)); 

 	
 }
 
 
 
 
 
 
 @Test
public void QuantidadeAplicadaACIDOFOSFORICO() {
	
	assertEquals(17.74120879120879 , 
		
			FosfatagemEnum.ACIDOFOSFORICO.QuantidadeAplicada(10, 70, 8.59)); 

 	
 }
 
 
 
 @Test
public void QuantidadeAplicadaMULTIFOSFATOMAGNESIANO() {
	
	assertEquals(51.25238095238096 , 
		
			FosfatagemEnum.MULTIFOSFATOMAGNESIANO.QuantidadeAplicada(10, 70, 8.59)); 

 	
 }
 
 
 
 @Test
public void CorrecaoKghaMULTIFOSFATOMAGNESIANO() {
	
	assertEquals(5.637761904761906 , 
		
			FosfatagemEnum.MULTIFOSFATOMAGNESIANO.CorrecaoKgha(70, 10, 8.59)); 

 	
 }
 
 
 
 

 @Test
public void CorrecaoKgha2MULTIFOSFATOMAGNESIANO() {
	
	assertEquals(9.225428571428573 , 
		
			FosfatagemEnum.MULTIFOSFATOMAGNESIANO.CorrecaoKgha2(70, 10, 8.59)); 

 	
 }
 
 
 
 
 
    
    
    
    
    
    

}
