public class Szesciokat extends Figura {

    private double bok1;

    Szesciokat(double bok1) throws Ujemna{


        this.bok1 = bok1;
        if(bok1 <= 0.0)
        {
            throw new Ujemna();
        }

    }

    @Override
    public double LiczPole() {
        return bok1 * bok1 * 2.59808;
    }

    @Override
    public double LiczObwod() {
        return 6 * bok1;
    }
}
