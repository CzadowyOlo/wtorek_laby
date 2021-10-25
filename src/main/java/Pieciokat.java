public class Pieciokat extends Figura {

    private double bok1;

    Pieciokat(double bok1) throws Ujemna {

        this.bok1 = bok1;

        if(bok1 <= 0.0)
        {
            throw new Ujemna();
        }

    }

    @Override
    public double LiczPole() {
        return bok1 * bok1 * 1.72048;
    }

    @Override
    public double LiczObwod() {
        return 5 * bok1;
    }
}
