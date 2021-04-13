

public final class TipoNutrientes {

    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double aluminioHidrogenio;

    public TipoNutrientes(
            double fosforo,
            double potassio,
            double calcio,
            double magnesio,
            double enxofre,
            double aluminio,
            double aluminioHidrogenio) {

        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.aluminioHidrogenio = aluminioHidrogenio;
    }

    TipoNutrientes(double fosforo) {
        this.fosforo = fosforo;
    }

    public double getAluminio() {
        return aluminio;
    }

    public double getAluminioHidrogenio() {
        return aluminioHidrogenio;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getFosforo() {
        return fosforo;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getPotassio() {
        return potassio;
    }
}
