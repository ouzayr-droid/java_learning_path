import java.util.Scanner;

public class TriangleIsocele {
    /* 
        * on implémente un code en java qui dessine un triangle isocèle
        * le programme à l'entrée demande à l'utilisateur de saisir la hauteur du triangle
        * Ensuite le programme à partir d'une boucle dessine notre triangle isocèle
        * le nombre de ligne est égal à la hauteur du triangle
        * notre boucle commence à 1 prend fin à hauteur
        * pour chaque boucle on aura une sous-boucle qui imprime "*" en ligne
        * la première boucle doit imprimer un retour à la ligne
        * les espaces 
    */

    public static void main(String [] args)
    {
        int nombreEtoiles, nombreEspaces;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer la hauteur du traingle: ");
        int hauteur = sc.nextInt();

        for (int i=1; i<=hauteur; i++)
        {
            nombreEtoiles = 2*i-1;
            nombreEspaces = 8-i;

            // ici print des espaces
            for (int j=0; j<nombreEspaces; j++)
            {
                System.out.print(" ");
            } 
            // ici print des étoiles 
            for (int j=0; j<nombreEtoiles; j++)
            {
                // print de l'étoile
                System.out.print("*");
            }

            // Instruction de retour à la ligne après chaque tour
            System.out.print("\n");
        }
    }
}
