/* 
    * Réaliser une classe qui permet d’attribuer un numéro unique à chaque nouvel objet créé
    * On ne cherchera pas à réutiliser les numéros d’objets éventuellement détruits.
    * constructeur 
    * méthode getIdent fournissant le numéro attribué à l’objet 
    * méthode getIdentMax fournissant le numéro du dernier objet créé.
*/
package champs_et_methodes_de_classe;

class Uniq
{
    static int counter;
    static int identMax=0;

    private int id=0;
    private String name;

    Uniq(String name)
    {
        this.name = name;
        id = identMax++;
    }

    int getIdent()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    int getIdentMax()
    {
        return identMax;
    }

}
public class UniqNumber {
    public static void main(String args [])
    {
        Uniq objet1 = new Uniq("the uniq");
        Uniq objet2 = new Uniq("Raquel");
        Uniq objet3 = new Uniq("Kanan");
        Uniq objet4 = new Uniq("Drew");

        System.out.println("le nombre d'objet crée est: "+Uniq.identMax);
        System.out.println("Je suis "+objet1.getName()+" et mon id: "+objet1.getIdent());
        System.out.println("Je suis "+objet2.getName()+" et mon id: "+objet2.getIdent());
        System.out.println("Je suis "+objet3.getName()+" et mon id: "+objet3.getIdent());
        System.out.println("Je suis "+objet4.getName()+" et mon id: "+objet4.getIdent());
    }
}
