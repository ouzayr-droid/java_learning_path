package initialisation_obet;

class A
{
    private int nbre = 20;
    private int decal;

    public A(int coeff)
    {
        nbre *= coeff;
        nbre += decal;
    }

    public void affiche()
    {
        System.out.println("nbre = "+nbre+"; decal = "+decal);
    }
}

public class InitChmp
{
    public static void main(String [] args)
    {
        A a = new A(5);
        a.affiche();
    }
}
