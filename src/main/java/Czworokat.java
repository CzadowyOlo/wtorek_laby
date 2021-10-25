abstract public class Czworokat extends Figura {



    protected double bok1, bok2, bok3, bok4, kont;

    Czworokat(double bok1, double bok2, double bok3, double bok4, double kont) throws  Ujemna{

        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
        this.bok4 = bok4;
        this.kont = kont;

        if(bok1 <= 0.0 || bok2 <= 0.0 || bok3 <= 0.0 || bok4 <= 0.0 || (kont <= 0.0 || kont >= 180.0))
        {
            throw new Ujemna();
        }
    }
}
