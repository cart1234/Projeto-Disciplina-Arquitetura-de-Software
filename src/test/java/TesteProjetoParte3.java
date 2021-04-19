

import org.junit.jupiter.api.Test;







import static org.junit.jupiter.api.Assertions.*;



public class TesteProjetoParte3 {
	
	
	// ----------------------------------- CLORETO DE POTASSIO -----------------------------------------------------------
	
	

	@Test 
	public void Kcmol() { assertEquals(0.2367 , 
		
		PotassagemEnum.CALCULOPOTASSIO.KCmol(3.0, 0.15, 5.76, 1.63, 5.35));
	}
	
	

	@Test 
	public void CmolMg() { assertEquals( 92.5497, 
           PotassagemEnum.CALCULOPOTASSIO.CmolMg(3.0, 0.15, 5.76, 1.63, 5.35));
	}
	
		
	@Test 
    public void CmolKg() { assertEquals( 222.11928, 
		
		PotassagemEnum.CALCULOPOTASSIO.CmolKg(3.0, 0.15, 5.76, 1.63, 5.35));
	}
	
	

	@Test 
    public void KgK20() { assertEquals(261.3168, 
		
		PotassagemEnum.CALCULOPOTASSIO.KgK20(3.0, 0.15,   5.76, 1.63, 5.35));
	}
	
	

	@Test 
    public void QtdAplicadaCloreto() { assertEquals(450.5462068965517 , 
		
		PotassagemEnum.CLORETOPOTASSIO.QuantidadeAplicada(3.0, 0.15, 
				5.76, 1.63, 5.35));
	}
	
	
	


	@Test 
    public void CustoKgHaCloreto() { assertEquals(1126.3655172413794 , 
		
		PotassagemEnum.CLORETOPOTASSIO.CustoKgha(2500.00, 3.0, 0.15, 
				5.76, 1.63, 5.35));
	}
	
	
	
	
	// ------------------------------- SULFATO DE POTASSIO ----------------------------------------------------------------------

	@Test 
    public void QtdAplicadaSulfato() { assertEquals(502.5323076923077 , 
		
		PotassagemEnum.SULFATOPOTASSIO.QuantidadeAplicada(3.0, 0.15, 
				5.76, 1.63, 5.35));
	}
	
	
	


	@Test 
    public void CustoKgHaSulfato() { assertEquals(675.4034215384615 , 
		
		PotassagemEnum.SULFATOPOTASSIO.CustoKgha(1344.00, 3.0, 0.15, 
				5.76, 1.63, 5.35));
	}
	
	
	@Test 
    public void CorrecaoKghaSulfato() { assertEquals(85.43049230769232 , 
		
		PotassagemEnum.SULFATOPOTASSIO.CorrecaoKgha( 3.0, 0.15, 
				5.76, 1.63, 5.35));
	};
	
	
	
	// ----------------------------------- POTASSIO SULFATO DE POTASSIO E MAGNESIO ---------------------------------------
	

	@Test 
    public void QtdAplicadaSulfatoPotassio() { assertEquals(1187.8036363636363 , 
		
		PotassagemEnum.SULFATOPOTASSIOMAGNESIO.QuantidadeAplicada(3.0, 0.15, 
				5.76, 1.63, 5.35));
	}
	
	
	
	


	@Test 
    public void CustoKgHaSulfatoPotassio() { assertEquals(1465.7496872727272 , 
		
		PotassagemEnum.SULFATOPOTASSIOMAGNESIO.CustoKgha(1234.00, 3.0, 0.15, 
				5.76, 1.63, 5.35));
	}
	
	
	
	@Test 
    public void CorrecaoKghaSulfatoPotassio() { assertEquals(261.3168 , 
		
		PotassagemEnum.SULFATOPOTASSIOMAGNESIO.CorrecaoKgha( 3.0, 0.15, 
				5.76, 1.63, 5.35));
	}
	
	
	

	@Test 
    public void CorrecaoKgha2SulfatoPotassio() { assertEquals(213.80465454545453 , 
		
		PotassagemEnum.SULFATOPOTASSIOMAGNESIO.CorrecaoKgha2( 3.0, 0.15, 
				5.76, 1.63, 5.35));
	};
	
	
	
	// ---------------------------------------  POTASSIO2 -----------------------
	
	@Test 
    public void QtdAplicada() { assertEquals(593.9018181818182 , 
		
		PotassagemEnum.POTASSIO2.QuantidadeAplicada(3.0, 0.15, 
				5.76, 1.63, 5.35));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
