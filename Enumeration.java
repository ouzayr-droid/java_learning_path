public class Enumeration {
    /**
     * cette classe est un exmple de cas pour mettre en pratique les notions d'enum en java
     * je définis une liste de cas possible, ensuite avec switch ... si match exécute une suite d'instructions
     */
    enum Direction{north, east, west, south}
    public static void main(String [] args)
    {
        Direction direction = Direction.north;

        switch(direction){
            case north:
                System.out.println("Vous vous dirigez vers le nord");
                break;

            case east:
                System.out.println("Vous vous dirigez vers l'est");
                break;
            
            case west:
                System.out.println("Vous vous dirigez vers l'ouest");
                break;

            case south:
                System.out.println("Vous vous dirigez vers le sud");
                break;
        }

    }
}
