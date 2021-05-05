package CorrecaoParte2.TiposPotassio;


public interface InterfacePotassio {

	
	 public double PotassioAtualCTC(double potassio, double calcio, double magnesio, double HAl); 
	 
	 
	 
		public double KCmol(double potassioCTCDesejado, double potassio, 
				double calcio, double magnesio, double HAl);
	 
	 

	  public double CmolMg(double potassioCTCDesejado, double potassio, double calcio, 
			  double magnesio, double HAl);  
	   
	   public double CmolKg(double potassioCTCDesejado, double potassio, double calcio, 
				  double magnesio, double HAl);  

	   
	      public double KgK20(double potassioCTCDesejado, double potassio, 
	    		  double calcio, double magnesio, double HAl);
				  
	   
	   
		  
		   
		public double CustoKgha(double cloreto, double potassioCTCDesejado, double potassio,
					double calcio, double magnesio, double HAl);
	      
	   
	   
	   
	   public double CorrecaoKgha(double potassioCTC, double potassio, double calcio,
	  double magnesio, double HAl); 
	   
	   
	   public double CorrecaoKgha2(double potassioCTC, double potassio, double calcio,
	  double magnesio, double HAl); 
	   
	   
	   
	   public double QuantidadeAplicada(double potassioCTCDesejado, double potassio,
			   double calcio, double magnesio, double HAl);
		   
	   
	   
	   
	
}
