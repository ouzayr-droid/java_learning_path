package classes_and_objets;

class Point 
{
    private char nom;
    private double abcisse;

    public Point(char name, double abciss)
    {
        nom = name;
        abcisse = abciss;
    }

    public void affich_point()
    {
        System.out.println("nom du point est "+nom+" et son abcisse est: "+abcisse);
    }

    public void translate(double dx)
    {
        abcisse += dx;
    }
}

public class TstPtAxe
{
    public static void main(String [] args)
    {
        Point a1 = new Point('a', 2.0);
        a1.affich_point();
        a1.translate(5);
        System.out.println("Nous venons d'opérer un translate");
        a1.affich_point();
    }
}