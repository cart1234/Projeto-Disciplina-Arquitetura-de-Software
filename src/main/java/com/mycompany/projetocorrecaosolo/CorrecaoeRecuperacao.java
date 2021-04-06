package com.mycompany.projetocorrecaosolo;    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */



    /**
     *
     * @author Willian
     */
    public class CorrecaoeRecuperacao { 


       private double teorFosforo;  // esse atributo e o teor do fosforo exemplo 8.59
       private Nutrientes fosforo;

       private double porcentagem;
       private double  fonteFosforos;
       private double mgFosforo;
       private double KgFosforo;
       private  double gkPOFosforo;
       private   double p2o5;
       private TipoFosforo tipo;


        public CorrecaoeRecuperacao(double teorFosforo,Nutrientes fosforo, double porcentagem, double fonteFosforos) {
            this.teorFosforo = teorFosforo;
            this.fosforo =fosforo;
            this.porcentagem = porcentagem;
            this.fonteFosforos = fonteFosforos;
        }

        public double getMgFosforo(double teorfosforo, double fosforo) {
            return teorfosforo - fosforo;
        }

        public double getKgFosforo(double teorFosforo, double fosforo) {
            return this.getMgFosforo(teorFosforo, fosforo) * 2;
       }

        public double getGkPOFosforo(double teorFosforo, double fosforo) {
           return getKgFosforo(teorFosforo, fosforo) * 2.29;
       }

        public double getP2o5(double teorFosforo, double fosforo, double porcentagem) {
           return  getGkPOFosforo(teorFosforo, fosforo) *100 / porcentagem /100 ;
       }




        CorrecaoeRecuperacao() {

        }

        public double getTeorFosforo() {
            return teorFosforo;
        }



       double porcentagemP2Os(double fonteFosforos) {

          if(fonteFosforos == 1) return 18.0;

          if(fonteFosforos == 2) return 41.0;

          if(fonteFosforos == 3) return 48.0;

          if(fonteFosforos == 4) return 45.0;

          if(fonteFosforos == 5 || fonteFosforos == 12) return 18.0;

          if(fonteFosforos == 6) return 33.0;

          if(fonteFosforos == 7) return 29.0;

          if(fonteFosforos == 8) return 32.0;

          if(fonteFosforos == 9) return 24.0;

          if(fonteFosforos == 10) return 18.5;

          if(fonteFosforos == 11) return 52.0;



            return 0.0;


        }


        //essa classe retorna quantidade aplicaada por kg/hectare
        double QuantidadeAplicada(double teorFosforo,double fonteFosforos, double porcentagem, double fosforo){



         double result = this.getP2o5(teorFosforo, fosforo, porcentagem) * 100 / porcentagemP2Os(fonteFosforos);

          return result * 100;

       }


        double CorrecaoKgha(double teorFosforo, double fonteFosforos, double porcentagem, double fosforo) {

            if(fonteFosforos == 5) return  QuantidadeAplicada(teorFosforo, fonteFosforos, porcentagem,fosforo) * 0.15;

            else
            if(fonteFosforos == 1 || fonteFosforos == 12) return CorrecaoCalculoKgha(teorFosforo, fonteFosforos, porcentagem,fosforo) /2.42;
            else  return 0.0;



        }

        //essa classe faz parta da CorrecaoKhha2
        double CorrecaoCalculoKgha(double teorFosforo,double fonteFosforos, double porcentagem, double fosforo){
            if(fonteFosforos == 1) return QuantidadeAplicada(teorFosforo, fonteFosforos, porcentagem,fosforo) * 2.42 * 0.1 ;

            else
                if(fonteFosforos == 12) return QuantidadeAplicada(teorFosforo, fonteFosforos,porcentagem,fosforo) * 2.42 * 0.11;

            return 0.0;

        }



        // essa classe fosforo da celula P16
        //mexer nessa classe, adicionar o Ifs
        double CorrecaoKgha2(double fonteFosforos, double porcentagem, double teorFosforo, double fosforo) {



            if(fonteFosforos == 1) return ( QuantidadeAplicada(teorFosforo, fonteFosforos, porcentagem,fosforo)* 0.28 * 2.42)/2.42;



            if(fonteFosforos == 2) return ( QuantidadeAplicada(teorFosforo, fonteFosforos, porcentagem,fosforo) * 0.2 * 2.42)/2.42;
                else

                if(fonteFosforos == 3) return (  QuantidadeAplicada(teorFosforo, fonteFosforos, porcentagem,fosforo) * 0.09 * 2.42) /2.42;
               //  else

               //   if(this.fonteFosforos ==4) return (QuantidadeAplicada() * 0.16 * 2.42) /2.42;

               //   else
                //   if(this.fonteFosforos==5 || this.fonteFosforos == 9) return (QuantidadeAplicada() * 0.28 * 2.42)/2.42;

                //      else

               //    if(this.fonteFosforos==6 || this.fonteFosforos == 7) return (QuantidadeAplicada() * 0.52 * 2.42) /2.42;

               //    else

            //     if(this.fonteFosforos == 8) return (QuantidadeAplicada() * 0.45 * 2.42) /2.42;
             //    else
                  //       if(this.fonteFosforos == 10) return (QuantidadeAplicada() * 0.44 * 2.42)/2.42;


             //     if(this.fonteFosforos == 12) return (QuantidadeAplicada() * 0.18 * 2.42) / 2.42;
            return 0.0;



        }


        //essa classe e correcao da celula  P16
        //colocar nessa classe celula M21


       //essa classe e custo Kg/hectare

       double CustoCorrecaoFosforo(double SuperFosfatoSimples, double fonteFosforos, double porcentagem,
        double fosforo, double teorFosforo){
//
             if(fonteFosforos == 1 ) return SuperFosfatoSimples * (QuantidadeAplicada(teorFosforo, fonteFosforos, porcentagem,fosforo)  * 2.42 /1000.00) /2.42;
           return 0;




       }


    }
