

public enum FosfatagemCalcioEnum  implements InterfaceCorrecaoCalcio  {


   
    

    SUPERFOSFATOTRIPLO{


        @Override
        public double QuantidadeAplicada(double teorFosforo, double fosforo) { 
        	
        	if(teorFosforo > 0 && fosforo >0) {

          	return ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100/ 41.0;
        	} else
        		return 0.0;

            
        }

        @Override
        public double CorrecaoFosforoCalcio(double teorFosforo,   double fosforo) {
            return  QuantidadeAplicada(teorFosforo, fosforo) * 0.2 ;
        }



    },
   
    

   	

    FOSFATOREATARAD {


    @Override
    public double QuantidadeAplicada(double teorFosforo,  double fosforo) {
        	

     double calc = (teorFosforo >0 && fosforo >0) ?  ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100/ 33.0 : 0.0; 
     
     return calc;
    }

        @Override
        public double CorrecaoFosforoCalcio(  double teorFosforo, double fosforo) {
            return  QuantidadeAplicada(teorFosforo,  fosforo)* 0.52 ;
        }

    },
	
	

   FOSFATOREATIVOGAFSA {

    @Override
   public double QuantidadeAplicada(double teorFosforo,  double fosforo) {

   double calc = (teorFosforo > 0 && fosforo >0) ? ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100/ 29.0 : 0.0; 
   
   return calc;
           
       }

       @Override
       public double CorrecaoFosforoCalcio( double teorFosforo, double fosforo) {
           return FOSFATOREATARAD.CorrecaoFosforoCalcio(teorFosforo,fosforo);
       }


    },	
	
	

   FOSFATOREATIVODAOUI{

 @Override
 public double QuantidadeAplicada(double teorFosforo,   double fosforo) {

  double calc = (teorFosforo >0 && fosforo >0) ? ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100/  32.0 : 0.0; 
  
   return calc;       
          
       }


       @Override
       public double CorrecaoFosforoCalcio( double teorFosforo, double fosforo) {
           return QuantidadeAplicada(teorFosforo,fosforo)* 0.45;
       }



   },
	
	

   FOSFATOPATODEMINAS {

       @Override
   public double QuantidadeAplicada(double teorFosforo, double fosforo) {

   double calc = (teorFosforo >0 && fosforo>0) ? ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100 / 24.0 : 0.0; 
   
    return calc;

         
       }


       @Override
       public double CorrecaoFosforoCalcio(  double teorFosforo, double fosforo) {
    	   return  QuantidadeAplicada(teorFosforo, fosforo)* 0.28;
       }


   },
	
	


  ESCORIADETHOMAS {

      @Override
      public double QuantidadeAplicada(double teorFosforo,double fosforo) {

   double calc = (teorFosforo >0 && fosforo>0) ? ((teorFosforo -fosforo)* 2 * 2.29 * 100 /70.0) * 100 / 18.5 : 0.0; 
   
    return calc;
      	
      }

      @Override
      public double CorrecaoFosforoCalcio(  double teorFosforo, double fosforo) {
          return  QuantidadeAplicada(teorFosforo, fosforo)* 0.44;

      }



  };
	
	
	



   }




