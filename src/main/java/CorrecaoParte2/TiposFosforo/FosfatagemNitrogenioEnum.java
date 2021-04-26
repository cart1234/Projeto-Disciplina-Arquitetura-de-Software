
public enum FosfatagemNitrogenioEnum  implements InterfaceCorrecaoNitrogenio {
	
	

	  DAP {


	    @Override
	     public double QuantidadeAplicada(double teorFosforo, double fosforo) {

       	return ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100 / 45.0;

	          
	     }

	      @Override
	    public double CorrecaoNitrogenio(double teorFosforo, double fosforo) {
	          return  QuantidadeAplicada(teorFosforo, fosforo) * 0.16;
	      }

	   },
	
	


	   MAP {

	       @Override
	     public double QuantidadeAplicada(double teorFosforo, double fosforo) {

	          	return ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100 / 48.0;

	             
	        }


	        @Override
	     public double CorrecaoNitrogenio(double teorFosforo,  double fosforo) {
	   return  QuantidadeAplicada(teorFosforo, fosforo) * 0.09;
	         }

	   };

	
	

}
