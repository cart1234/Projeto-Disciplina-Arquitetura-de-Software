package CorrecaoParte2.TiposFosforo;


public class ACIDOFOSFORICO {

	
	   
    public double QuantidadeAplicada(double teorFosforo,  double fosforo) {

    	if(teorFosforo > 0 && fosforo >0) {
     	return ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100/ 52.0;
    	} else 
    		
    		return 0.0;

   }


	
	
}
