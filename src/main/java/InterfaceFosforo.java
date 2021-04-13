

public interface InterfaceFosforo {

    public double getMgFosforo(double teorfosforo, double fosforo);

    public double getKgFosforo(double teorFosforo, double fosforo);


    public double getGkPOFosforo(double teorFosforo, double fosforo);


    public double getP2o5(double teorFosforo, double fosforo, double porcentagem);

    public double QuantidadeAplicada(double teorFosforo, double porcentagem, double fosforo);

    public double CorrecaoKgha(double teorFosforo, double porcentagem, double fosforo);

    public  double CustoCorrecaoFosforo(double SuperFosfatoSimples,double porcentagem,
            double fosforo, double teorFosforo);

    public double CorrecaoKgha2( double porcentagem, double teorFosforo, double fosforo);

}