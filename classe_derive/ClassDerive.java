package classe_derive;

class Point
{
    private int x, y;

    public void initialize(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}

class PointA extends Point
{
    public void affiche()
    {
        System.out.println("Mes coordonnées sont x: "+getX()+" et y: "+getY());
    }
}

public class ClassDerive {
    public static void main(String args [])
    {
        PointA x1 = new PointA();
        x1.initialize(2, 3);
        x1.affiche();
        x1.deplace(5, 7);
        x1.affiche();
    }
}
