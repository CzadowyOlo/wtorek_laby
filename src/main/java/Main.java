//Aleksander Glowacki 26.10.2021
// wwwwww
public class Main{

    public static void main(String[] args)
    {
        String znakFig = args[0];
        int dugosc = args[0].length();
        Figura[] figury = new Figura[dugosc];
        int n = 1;

        try
        {
            for(int i = 0; i < dugosc; i++){
                if(znakFig.charAt(i) == 'o'){
                    try{
                        Kolo kolo = new Kolo(Double.parseDouble(args[n]));
                        figury[i] = kolo;

                    }
                    catch(NumberFormatException ex){
                        System.out.println(args[n] + " zly format");
                    }
                    catch (Ujemna ex)
                    {
                        System.out.println("ujemny bok");
                    }
                    finally{
                        n++;
                    }
                }
                else if(znakFig.charAt(i) == 'c'){
                    double bok1, bok2, bok3, bok4, kont;

                    try{
                        bok1 = Double.parseDouble(args[n]);
                        bok2 = Double.parseDouble(args[n + 1]);
                        bok3 = Double.parseDouble(args[n + 2]);
                        bok4 = Double.parseDouble(args[n + 3]);
                        kont = Double.parseDouble(args[n + 4]);

                        if(bok1 == bok2 && bok2 == bok3 && bok3 == bok4)
                        {
                            if(kont == 90.0)
                            {
                                Kwadrat kwadrat = new Kwadrat(bok1);
                                figury[i] = kwadrat;
                            }
                            else
                            {
                                Romb romb = new Romb(bok1, kont);
                                figury[i] = romb;
                            }

                        }

                        else if (kont == 90 && ((bok1 == bok2 && bok3 == bok4) || (bok1 == bok3 && bok2 == bok4)))
                        {
                            if(bok1 == bok2)
                            {
                                Prostokat prostokat = new Prostokat(bok1, bok3);
                                figury[i] = prostokat;
                            }
                            else
                            {
                                Prostokat prostokat = new Prostokat(bok1, bok2);
                                figury[i] = prostokat;
                            }
                        }
                        else
                        {
                            System.out.println("zle dane figury");

                        }
                    }
                    catch (NumberFormatException ex){
                        System.out.println(args[n] + " zly format");
                    }
                    catch (Ujemna ex)
                    {
                        System.out.println("ujemny bok lub kont");
                    }

                    n+=5;
                }

                else if (znakFig.charAt(i) == 'p')
                {
                    try{
                        Pieciokat pieciokat = new Pieciokat(Double.parseDouble(args[n]));
                        figury[i] = pieciokat;

                    }
                    catch(NumberFormatException ex){
                        System.out.println(args[n] + " zly format");
                    }
                    catch (Ujemna ex)
                    {
                        System.out.println("ujemny bok");
                    }
                    finally{
                        n++;
                    }

                }

                else if (znakFig.charAt(i) == 's')
                {
                    try{
                        Szesciokat szesciokat = new Szesciokat(Double.parseDouble(args[n]));
                        figury[i] = szesciokat;

                    }
                    catch(NumberFormatException ex){
                        System.out.println(args[n] + " zly format");
                    }
                    catch (Ujemna ex)
                    {
                        System.out.println("ujemny bok");
                    }
                    finally{
                        n++;
                    }

                }

                else
                {
                    System.out.println("zla nazwa figury nr " + (i + 1));
                }


            }
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(" za mao danych");
            System.exit(69);
        }


        for(int k = 0; k < dugosc; k++ )
        {
            if(figury[k] != null)
            {
                System.out.println("\n Figura nr " + (k+1)  + "\npole: ");
                System.out.println(figury[k].LiczPole());
                System.out.println("obwod: ");
                System.out.println(figury[k].LiczObwod());
                System.out.println("\n");
            }

        }

    }

}
