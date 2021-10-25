public class Kolo extends Figura {
    private double prom;

    Kolo(double prom) throws Ujemna{
        this.prom = prom;

        if(prom <= 0.0)
        {
            throw new Ujemna();
        }
    }


    @Override
    public double LiczPole() {
        return  prom * prom * Math.PI;
    }

    @Override
    public double LiczObwod() {
        return 2 * prom * Math.PI;
    }


}
