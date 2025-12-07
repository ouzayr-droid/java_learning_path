package interfaces;

interface Affichable
{
    abstract public void affiche();
}

interface Transformable
{
    abstract public void homothetie(double coef);
    abstract public void rotation(double angle);
}

class Point implements Affichable
{
    public void affiche()
    {
        System.out.println("Je suis la méthode d'affiche d'un point");
    }

}

class Rectangle implements Affichable, Transformable
{
    public void affiche() 
    {
        System.out.println("Je suis un rectangle et cette méthode m'affiche.");
    }

    public void homothetie (double coef) 
    {
        System.out.println("Je suis la méthode d'homothétie");
    }

    public void rotation (double angle) 
    {
        System.out.println("Je suis la méthode de rotation");
    }
}

public class LesInterfaces 
{
    
}
