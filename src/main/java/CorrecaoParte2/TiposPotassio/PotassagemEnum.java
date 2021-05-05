package CorrecaoParte2.TiposPotassio;

public enum PotassagemEnum  implements InterfacePotassio{

	
	
	CALCULOPOTASSIO{ 
	
    
		@Override
		public double PotassioAtualCTC(double potassio, double calcio, double magnesio, double HAl) {
		  
	          double n1 = calcio + potassio+magnesio + HAl;
              
	          return potassio / n1 * 100;

		}

		
		@Override
		public double KCmol(double potassioCTCDesejado, double potassio, 
				double calcio, double magnesio, double HAl) {
			
			  
			
			return ( potassio *  potassioCTCDesejado / PotassioAtualCTC(potassio, 
					calcio, magnesio, HAl) ) - potassio;
					   
			   
			   
		}
		

		@Override
		public double CmolMg(double potassioCTCDesejado, double potassio, double calcio,
				double magnesio, double HAl)  {
			
			return this.KCmol(potassioCTCDesejado, potassio, calcio, magnesio, HAl) * 39.1 * 10;
		}

		
		
		@Override
		  public double CmolKg(double potassioCTCDesejado, double potassio, double calcio,
				  double magnesio, double HAl) {
			
			return (this.CmolMg(potassioCTCDesejado, potassio, calcio, magnesio, HAl) * 2) * 1.2;
			
		}
		
		
	@Override
      public double KgK20(double potassioCTCDesejado, double potassio, 
    		  double calcio, double magnesio, double HAl) {
			  
		if(potassio == 0 && calcio ==0 && magnesio ==0 && HAl==0) return 0.0;
		
		else 
			
	   return this.CmolKg(potassioCTCDesejado, potassio, calcio, magnesio, HAl)  * 100/ 85 ;
			  
  }


	@Override
	public double CustoKgha(double cloreto, double potassioCTCDesejado, double potassio, double calcio, double magnesio,
			double HAl) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double CorrecaoKgha(double potassioCTC, double potassio, double calcio, double magnesio, double HAl) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double CorrecaoKgha2(double potassioCTC, double potassio, double calcio, double magnesio, double HAl) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double QuantidadeAplicada(double potassioCTCDesejado, double potassio, double calcio, double magnesio,
			double HAl) {
		// TODO Auto-generated method stub
		return 0;
	}
		
		
		
			

		
	}, 
	
	
	
	CLORETOPOTASSIO {
		
		  @Override
		  public double QuantidadeAplicada(double potassioCTCDesejado, double potassio,
				   double calcio, double magnesio, double HAl) {
			   
			   
		  return this.CALCULOPOTASSIO.KgK20(potassioCTCDesejado, potassio,
				  calcio, magnesio,HAl)  * 100 / 58.0;
			   
			   
		   }
		  
		  
		 @Override
		public double CustoKgha(double cloreto, double potassioCTCDesejado, double potassio,
				double calcio, double magnesio, double HAl)  {
			
			return cloreto * ((this.QuantidadeAplicada(potassioCTCDesejado, potassio, 
					calcio, magnesio, HAl) * 2.42 ) /1000)/2.42;
			
			
			
		}


		@Override
		public double PotassioAtualCTC(double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double KCmol(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double CmolMg(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double CmolKg(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double KgK20(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double CorrecaoKgha(double potassioCTC, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double CorrecaoKgha2(double potassioCTC, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
	},
	
	
	SULFATOPOTASSIO {
		
		
		  @Override
		  public double QuantidadeAplicada(double potassioCTCDesejado, double potassio,
				   double calcio, double magnesio, double HAl) {
			   
			   
		  return this.CALCULOPOTASSIO.KgK20(potassioCTCDesejado, potassio,
				  calcio, magnesio,HAl)  * 100 / 52.0;
			   
			   
		   }
		  
		
		
		
		  
		 @Override
		public double CustoKgha(double sulfato, double potassioCTCDesejado, double potassio,
				double calcio, double magnesio, double HAl)  {
			
			return sulfato * ((this.QuantidadeAplicada(potassioCTCDesejado, potassio, 
					calcio, magnesio, HAl) * 2.42 ) /1000)/2.42;
			
			
			
		}
		
         @Override
		 public double CorrecaoKgha(double potassioCTCDesejado, double potassio, double calcio,
				 double magnesio, double HAl) {
		    	
		    	
		    	 return this.QuantidadeAplicada(potassioCTCDesejado, potassio, calcio,
		    			 magnesio, HAl) *0.17; 
		    	
		    	
		    	
		    }





		@Override
		public double PotassioAtualCTC(double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}





		@Override
		public double KCmol(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}





		@Override
		public double CmolMg(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}





		@Override
		public double CmolKg(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}





		@Override
		public double KgK20(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}





		@Override
		public double CorrecaoKgha2(double potassioCTC, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
	}, 
	
	
	SULFATOPOTASSIOMAGNESIO { 
		
		

		
		  @Override
		  public double QuantidadeAplicada(double potassioCTCDesejado, double potassio,
				   double calcio, double magnesio, double HAl) {
			   
			   
		  return this.CALCULOPOTASSIO.KgK20(potassioCTCDesejado, potassio, 
				  calcio, magnesio,HAl)  * 100 / 22.0;
			   
			   
		   }
		  

		   @Override
		 public double CustoKgha(double sulfato, double potassioCTCDesejado, double potassio, double calcio,
					 double magnesio, double HAl) {
			    	
				return sulfato * ((this.QuantidadeAplicada(potassioCTCDesejado, potassio, 
						calcio, magnesio, HAl ) * 2.42 ) /1000)/2.42;
				
			    	
			    	
			    }
			
		
	         @Override
			 public double CorrecaoKgha(double potassioCTCDesejado, double potassio, double calcio,
					 double magnesio, double HAl) {
			    	
			    	
			    	 return this.QuantidadeAplicada(potassioCTCDesejado, potassio, calcio,
			    			 magnesio, HAl) *0.22; 
			    	
			    	
			    	
			    }
			
		
	      @Override
			 public double CorrecaoKgha2(double potassioCTCDesejado, double potassio, double calcio,
					 double magnesio, double HAl) {
			    	
			    	
			    	 return this.QuantidadeAplicada(potassioCTCDesejado, potassio, calcio,
			    			 magnesio, HAl) *0.18; 
			    	
			    	
			    	
			    }


		@Override
		public double PotassioAtualCTC(double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double KCmol(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double CmolMg(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double CmolKg(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double KgK20(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}
			
		
		
	}, 
	
	
	
	POTASSIO2 { 
		
		
		

		  @Override
		  public double QuantidadeAplicada(double potassioCTCDesejado, double potassio,
				   double calcio, double magnesio, double HAl) {
			   
			   
		  return this.CALCULOPOTASSIO.KgK20(potassioCTCDesejado, potassio,
				  calcio, magnesio,HAl)  * 100 / 44.0;
			   
			   
		   }

		@Override
		public double PotassioAtualCTC(double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double KCmol(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double CmolMg(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double CmolKg(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double KgK20(double potassioCTCDesejado, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double CustoKgha(double cloreto, double potassioCTCDesejado, double potassio, double calcio,
				double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double CorrecaoKgha(double potassioCTC, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double CorrecaoKgha2(double potassioCTC, double potassio, double calcio, double magnesio, double HAl) {
			// TODO Auto-generated method stub
			return 0;
		}
		  
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
