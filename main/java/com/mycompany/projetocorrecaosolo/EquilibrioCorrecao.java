

package com.mycompany.projetocorrecaosolo;
public class EquilibrioCorrecao {

    double calculoSCmol(
            double potassio, 
            double calcio, 
            double magnesio) {
        
        return potassio + calcio + magnesio;
    }

    double calculaCTCCmol(
            double potassio, 
            double calcio, 
            double magnesio,
            double hidrogenioAluminio) {
    
        return calculoSCmol(potassio, calcio, magnesio) + hidrogenioAluminio;
    }

    double calculoVPercentual(double Scmol, double CTCcmol) {
        
        double calcula = (Scmol > 0 && CTCcmol > 0) ?  Scmol / CTCcmol * 100 : 0.0;
            
       return calcula;
    }

    double calculaMOPercentual(double mo) {
        if (mo > 0) {
            return mo / 10;
            
        } else {
            return 0.0;
        }
    }

    double calculaCarbono(double moPercentual) {
        
        if (moPercentual > 0) {
            return moPercentual / 1.72 * 10;
            
        } else {
            return 0.0;
        }
    }

}
