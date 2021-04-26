
public class TERMOFOSFATOYORIN {

	   
    public double QuantidadeAplicada(double teorFosforo,   double fosforo) {
    	   
     var calc = (teorFosforo >0 && fosforo>0) ?((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100/ 18.0 : 0.0; 
     
     return calc;
    	

       }


      
       
		public double CorrecaoMagnesio(double teorFosforo,  double fosforo) {
           return QuantidadeAplicada(teorFosforo,  fosforo) * 0.15;
       }

      
       public double CorrecaoFosforoCalcio( double teorFosforo, double fosforo) {
           return QuantidadeAplicada(teorFosforo,  fosforo) * 0.28 ;

       }
	
	
	
	
}
