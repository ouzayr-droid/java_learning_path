public class FigureGeometrique 
{
    private int x;
    private int y;
    
    FigureGeometrique(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Carre extends FigureGeometrique
{
    long cote;
    Carre(long cote, int x, int y)
    {
        // appel du constructeur de la classe mère FigureGeometrique
        // et cette appelle doit toujours venir en première position
        super(x,y);
        this.cote=cote;
        
    }
}