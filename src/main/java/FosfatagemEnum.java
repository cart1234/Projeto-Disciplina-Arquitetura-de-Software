

  public enum FosfatagemEnum  implements InterfaceFosforo {


      CALCULOFOSFATAGEM {
    	  
          @Override
          public double getMgFosforo(double teorfosforo, double fosforo) {
              return teorfosforo - fosforo;
          }
          
          @Override
          public double getKgFosforo(double teorFosforo, double fosforo) {
              return this.getMgFosforo(teorFosforo, fosforo) * 2;
          }

          @Override
          public double getGkPOFosforo(double teorFosforo, double fosforo) {
              return this.getKgFosforo(teorFosforo, fosforo) * 2.29;
          }

          @Override
          public double getP2o5(double teorFosforo, double fosforo, double porcentagem) {
              return  this.getGkPOFosforo(teorFosforo, fosforo) *100 / porcentagem /100 ;
          }

		



      },



    SUPERFOSFATOSIMPLES {
        @Override
        public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

            double result = this.CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 18.0;

            return result * 100;
        }


        @Override
        public double CorrecaoKgha(double teorFosforo, double porcentagem, double fosforo) {
            return (this.QuantidadeAplicada(teorFosforo,  porcentagem,fosforo) * 2.42 * 0.1 ) /2.42;
        }

        @Override
        public double CorrecaoKgha2( double teorFosforo, double porcentagem, double fosforo) {
            return (this.QuantidadeAplicada(teorFosforo, porcentagem, fosforo) * 0.28 * 2.42) / 2.42;

        }

        public  double CustoCorrecaoFosforo(double SuperFosfatoSimples, double porcentagem,
            double fosforo, double teorFosforo){

            return SuperFosfatoSimples * (QuantidadeAplicada(teorFosforo,  porcentagem,fosforo)  * 2.42 /1000.00) /2.42;



            }
    },



    SUPERFOSFATOTRIPLO{


        @Override
        public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

            double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 41.0;

            return result * 100;
        }

        @Override
        public double CorrecaoKgha2(double teorFosforo,  double porcentagem, double fosforo) {
            return ( QuantidadeAplicada(teorFosforo,  porcentagem,fosforo) * 0.2 * 2.42)/2.42;
        }



    },

     MAP {

         @Override
         public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

             double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 48.0;

             return result * 100;
         }


         @Override
         public double CorrecaoKgha2(double teorFosforo,  double porcentagem, double fosforo) {
             return ( QuantidadeAplicada(teorFosforo,  porcentagem,fosforo) * 0.09 * 2.42)/2.42;
         }

   },


   DAP {


       @Override
       public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

           double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 45.0;

           return result * 100;
       }

       @Override
       public double CorrecaoKgha2(double teorFosforo,  double porcentagem, double fosforo) {
           return ( QuantidadeAplicada(teorFosforo,  porcentagem,fosforo) * 0.16 * 2.42)/2.42;
       }

   },
	  

    TERMOSFOSFATOYORIN{

        @Override
        public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

        	 double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 18.0;

             return result * 100;
        }


        @Override
        public double CorrecaoKgha(double teorFosforo, double porcentagem, double fosforo) {
            return QuantidadeAplicada(teorFosforo,  porcentagem,fosforo) * 0.15;
        }

        @Override
        public double CorrecaoKgha2( double teorFosforo, double porcentagem, double fosforo) {
            return ( QuantidadeAplicada(teorFosforo,  porcentagem,fosforo)* 0.28 * 2.42)/2.42;
        }


    },

    FOSFATOREATARAD {


        @Override
        public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

            double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 33.0;

            return result * 100;
        }

        @Override
        public double CorrecaoKgha2( double porcentagem, double teorFosforo, double fosforo) {
            return ( QuantidadeAplicada(teorFosforo,  porcentagem,fosforo)* 0.52 * 2.42)/2.42;
        }

    },


   FOSFATOREATIVOGAFSA {

       @Override
       public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

           double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 29.0;

           return result * 100;
       }

       @Override
       public double CorrecaoKgha2( double porcentagem, double teorFosforo, double fosforo) {
           return this.FOSFATOREATARAD.CorrecaoKgha2(porcentagem,teorFosforo,fosforo);
       }


   },

   FOSFATOREATIVODAOUI{

       @Override
       public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

           double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 32.0;

           return result * 100;
       }


       @Override
       public double CorrecaoKgha2( double porcentagem, double teorFosforo, double fosforo) {
           return ( QuantidadeAplicada(teorFosforo,  porcentagem,fosforo)* 0.45 * 2.42)/2.42;
       }



   },

   FOSFATOPATODEMINAS {

       @Override
       public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

           double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 24.0;

           return result * 100;
       }


       @Override
       public double CorrecaoKgha2( double porcentagem, double teorFosforo, double fosforo) {
    	   return ( QuantidadeAplicada(teorFosforo,  porcentagem,fosforo)* 0.28 * 2.42)/2.42;
       }


   },


  ESCORIADETHOMAS{

      @Override
      public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

          double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 18.5;

          return result * 100;
      }

      @Override
      public double CorrecaoKgha2( double porcentagem, double teorFosforo, double fosforo) {
          return ( QuantidadeAplicada(teorFosforo,  porcentagem,fosforo)* 0.44 * 2.42)/2.42;

      }



  },

   ACIDOFOSFORICO {

       @Override
       public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

           double result = CALCULOFOSFATAGEM.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / 52.0;

           return result * 100;
       }



   },

      MULTIFOSFATOMAGNESIANO {

          @Override
          public double QuantidadeAplicada(double teorFosforo,  double porcentagem, double fosforo) {

             return this.TERMOSFOSFATOYORIN.QuantidadeAplicada(teorFosforo,porcentagem,fosforo);
          }


          @Override
          public double CorrecaoKgha( double porcentagem, double teorFosforo, double fosforo) {
              return (QuantidadeAplicada(teorFosforo,porcentagem,fosforo) * 2.42 * 0.11)/2.42;

          }

          @Override
          public double CorrecaoKgha2( double porcentagem, double teorFosforo, double fosforo) {
              return (QuantidadeAplicada(teorFosforo, porcentagem,fosforo) * 0.18 * 2.42) / 2.42;

          }





      };




   }




