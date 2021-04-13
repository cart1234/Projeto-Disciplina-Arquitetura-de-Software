package Parte2Projeto;

import Parte1Projeto.EquilibrioSolo;
import Parte1Projeto.TexturaSolo;

public class Potassagem {


    variavel potassio e celula D11
    R6= R5 + (H+AL)
    R5= calcio + magnesio + potassio

            formula = D11/R6 * 100


    public double PotassioAtualCTC(double potassio, double calcio, double magnesio, double HAl)  {

          double n1 = calcio + potassio+magnesio + HAl;

        return potassio / n1 * 100;

         }

   public double PotassioIdealCTC(){

      return 3.0;

  }



    }
