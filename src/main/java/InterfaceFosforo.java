

public interface InterfaceFosforo  {



 
   public double TransformaKgP2o5(double teorFosforo, double fosforo);

   public double KgP2o5(double teorFosforo, double fosforo);
   
   
    public double QuantidadeAplicada(double teorFosforo,double fosforo);

    public double CorrecaoFosforoEnxofre(double teorFosforo,  double fosforo);
    
    public double CorrecaoFosforoMagnesio(double teorFosforo,  double fosforo);
    
    public double CorrecaoFosforoCalcio(double teorFosforo,  double fosforo);

    public double CorrecaoFosforoNitrogenio(double teorFosforo,  double fosforo);
    
    public  double CustoCorrecaoFosforo(double SuperFosfatoSimples,  double fosforo, double teorFosforo);

   


}