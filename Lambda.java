class Bird
{
    public void fly()
    {
        System.out.println("Hi! i'm flying ...");
    }
}

public class Lambda {
    public static void main(String... args) {

        Bird bird = new Bird() {
           @Override //sert simplement à indiquer que nous redéfinissons la méthode fly()
           public void fly() {
              System.out.println("Vole grâce à ses deux ailes...");
           }
        }; // Attention à ne pas oublier le “;”
  
        // À ce moment (et uniquement à ce moment), nous redéfinissons la manière de voler d’un oiseau. Ensuite nous l'utilisons.
        bird.fly(); // Va afficher "Vole grâce à ses deux ailes..."
        // À noter qu’il est toujours possible de passer des paramètres à une méthode d’une classe anonyme
     }
}
