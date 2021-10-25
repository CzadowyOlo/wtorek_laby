public class Prostokat extends Czworokat {

    Prostokat(double bok1, double bok2) throws Ujemna {
        super(bok1, bok2, bok1, bok2, Math.PI / 2);

        if(bok1 <= 0.0 || bok2 <= 0.0)
        {
            throw new Ujemna();
        }
    }

    @Override
    public double LiczPole() {
        return bok1 * bok2;
    }

    @Override
    public double LiczObwod() {
        return 2 * (bok1 + bok2);
    }
}
