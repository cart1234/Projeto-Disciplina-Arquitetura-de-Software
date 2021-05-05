package CorrecaoParte2.TiposFosforo;

public class SUPERFOSFATOSIMPLES {


	
	  
    	  
        public double QuantidadeAplicada(double teorFosforo,  double fosforo) { 
            
        	if(teorFosforo > 0 && fosforo > 0) {
        		
        	return ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100/ 18.0;
        	
        	} else
        		return 0.0;
        			
        }


        
        public double CorrecaoFosforoEnxofre(double teorFosforo,double fosforo) {
            return QuantidadeAplicada(teorFosforo, fosforo)  * 0.1;
        }

       
        public double CorrecaoFosforoCalcio( double teorFosforo,  double fosforo) {
            return QuantidadeAplicada(teorFosforo,  fosforo) * 0.28 ;

        }
        
        

        public  double CustoCorrecaoFosforo(double SuperFosfatoSimples, double fosforo, double teorFosforo){

            return SuperFosfatoSimples * (this.QuantidadeAplicada(teorFosforo,fosforo)  * 2.42 /1000.00)/2.42;


        }
    

	
	
	
}
