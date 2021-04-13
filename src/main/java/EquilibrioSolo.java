



public class EquilibrioSolo {

    public double calculaSCmol(
            double potassio, 
            double calcio, 
            double magnesio) {
        
        return potassio + calcio + magnesio;
    }

    public double calculaCTCCmol(
            double potassio, 
            double calcio, 
            double magnesio,
            double hidrogenioAluminio) {
    
        return calculaSCmol(potassio, calcio, magnesio) + hidrogenioAluminio;
    }

    public double calculaPercentual(double Scmol, double CTCcmol) {
        
        double calcula = (Scmol > 0 && CTCcmol > 0) ?  Scmol / CTCcmol * 100 : 0.0;
            
       return calcula;
    }

    public double  MOPercentual(double mo) {


            double calcula = (mo > 0) ?  mo /10 : 0.0;

            return calcula;

    }

   public  double calculaCarbono(double mo) {

        double calcula = (mo > 0) ?  mo /10 : 0.0;
            return calcula;





}}
