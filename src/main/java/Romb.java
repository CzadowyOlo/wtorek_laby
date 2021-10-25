public class Romb extends Czworokat{

    Romb(double bok1, double kont) throws Ujemna{
        super(bok1, bok1, bok1, bok1, kont * Math.PI / 180);
        if(bok1 <= 0.0 || kont <= 0.0 || kont >= 180.0)
        {
            throw new Ujemna();
        }
    }

    @Override
    public double LiczPole() {
        return bok1 * bok1 * Math.sin(kont);
    }

    @Override
    public double LiczObwod() {
        return 4 * bok1;
    }
}
