

public enum FosfatagemEnum  implements InterfaceFosforo {


      CALCULOFOSFATAGEM {
    	  
         
        
          @Override
          public double TransformaKgP2o5(double teorFosforo, double fosforo) {
              return (teorFosforo - fosforo)* 2 * 2.29;
          }

          @Override
          public double KgP2o5(double teorFosforo, double fosforo) {
              return  TransformaKgP2o5(teorFosforo, fosforo) *100 / 70.0 ;
          }

          @Override
          public double QuantidadeAplicada(double teorFosforo,double fosforo) {
        	  
             if(teorFosforo > 0 && fosforo >0 ) {
            	 
              return this.KgP2o5(teorFosforo, fosforo) * 100;
              
             } else 
            	 return 0.0;
             
          } 
          
        

      },



    SUPERFOSFATOSIMPLES {
    	  
        @Override
        public double QuantidadeAplicada(double teorFosforo,  double fosforo) { 
        

            return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo) / 18.0;
        }


        @Override
        public double CorrecaoFosforoEnxofre(double teorFosforo,double fosforo) {
            return QuantidadeAplicada(teorFosforo, fosforo)  * 0.1;
        }

        @Override
        public double CorrecaoFosforoCalcio( double teorFosforo,  double fosforo) {
            return QuantidadeAplicada(teorFosforo,  fosforo) * 0.28 ;

        }

        public  double CustoCorrecaoFosforo(double SuperFosfatoSimples, double fosforo, double teorFosforo){

            return SuperFosfatoSimples * (this.QuantidadeAplicada(teorFosforo,fosforo)  * 2.42 /1000.00)/2.42;



            }
    },

    

    SUPERFOSFATOTRIPLO{


        @Override
        public double QuantidadeAplicada(double teorFosforo, double fosforo) {

            return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo) / 41.0;

            
        }

        @Override
        public double CorrecaoFosforoCalcio(double teorFosforo,   double fosforo) {
            return  QuantidadeAplicada(teorFosforo, fosforo) * 0.2 ;
        }



    },
   
    

     MAP {

         @Override
         public double QuantidadeAplicada(double teorFosforo, double fosforo) {

             return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo) / 48.0;

             
         }


         @Override
         public double CorrecaoFosforoNitrogenio(double teorFosforo,  double fosforo) {
             return  QuantidadeAplicada(teorFosforo, fosforo) * 0.09;
         }

   },


   DAP {


       @Override
       public double QuantidadeAplicada(double teorFosforo, double fosforo) {

           return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo) / 45.0;

          
       }

       @Override
       public double CorrecaoFosforoNitrogenio(double teorFosforo, double fosforo) {
           return  QuantidadeAplicada(teorFosforo, fosforo) * 0.16;
       }

   },
	  
   

    TERMOSFOSFATOYORIN{

        @Override
        public double QuantidadeAplicada(double teorFosforo,   double fosforo) {

        	 return this.SUPERFOSFATOSIMPLES.QuantidadeAplicada(teorFosforo, fosforo);
        }


        @Override
        public double CorrecaoFosforoMagnesio(double teorFosforo,  double fosforo) {
            return QuantidadeAplicada(teorFosforo,  fosforo) * 0.15;
        }

        @Override
        public double CorrecaoFosforoCalcio( double teorFosforo, double fosforo) {
            return  this.SUPERFOSFATOSIMPLES.CorrecaoFosforoCalcio(teorFosforo, fosforo);
        }


    },
	
	

    FOSFATOREATARAD {


        @Override
        public double QuantidadeAplicada(double teorFosforo,  double fosforo) {

            return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo)  / 33.0;
        }

        @Override
        public double CorrecaoFosforoCalcio(  double teorFosforo, double fosforo) {
            return  QuantidadeAplicada(teorFosforo,  fosforo)* 0.52 ;
        }

    },
	
	

   FOSFATOREATIVOGAFSA {

       @Override
       public double QuantidadeAplicada(double teorFosforo,  double fosforo) {

           return  this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo)  / 29.0;

           
       }

       @Override
       public double CorrecaoFosforoCalcio( double teorFosforo, double fosforo) {
           return this.FOSFATOREATARAD.CorrecaoFosforoCalcio(teorFosforo,fosforo);
       }


    },	
	
	

   FOSFATOREATIVODAOUI{

       @Override
       public double QuantidadeAplicada(double teorFosforo,   double fosforo) {

           return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo)  / 32.0;
       }


       @Override
       public double CorrecaoFosforoCalcio( double teorFosforo, double fosforo) {
           return QuantidadeAplicada(teorFosforo,fosforo)* 0.45;
       }



   },
	
	

   FOSFATOPATODEMINAS {

       @Override
       public double QuantidadeAplicada(double teorFosforo, double fosforo) {

          return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo) / 24.0;

         
       }


       @Override
       public double CorrecaoFosforoCalcio(  double teorFosforo, double fosforo) {
    	   return  QuantidadeAplicada(teorFosforo, fosforo)* 0.28;
       }


   },
	
	


  ESCORIADETHOMAS {

      @Override
      public double QuantidadeAplicada(double teorFosforo,double fosforo) {

          return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo)  / 18.5;
      }

      @Override
      public double CorrecaoFosforoCalcio(  double teorFosforo, double fosforo) {
          return  QuantidadeAplicada(teorFosforo, fosforo)* 0.44;

      }



  },
	
	
	

   ACIDOFOSFORICO {

       @Override
       public double QuantidadeAplicada(double teorFosforo,   double fosforo) {

           return this.CALCULOFOSFATAGEM.QuantidadeAplicada(teorFosforo, fosforo)  / 52.0;

           
       }



   },
	
	

      MULTIFOSFATOMAGNESIANO {

          @Override
          public double QuantidadeAplicada(double teorFosforo,  double fosforo) {

             return this.TERMOSFOSFATOYORIN.QuantidadeAplicada(teorFosforo, fosforo);
          }


          @Override
          public double CorrecaoFosforoEnxofre(  double teorFosforo, double fosforo) {
              return QuantidadeAplicada(teorFosforo, fosforo) * 0.11;

          }

          @Override
          public double CorrecaoFosforoCalcio(  double teorFosforo, double fosforo) {
              return QuantidadeAplicada(teorFosforo, fosforo) * 0.18 ;

          }





      };




   }




