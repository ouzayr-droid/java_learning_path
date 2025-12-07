package listeSimplementChainees;

class Cellule
{
    int valeur;
    Cellule suivant;

    Cellule(int val, Cellule suiv)
    {
        this.valeur = val;
        this.suivant = suiv;
    }
}

/*  
    * SimpleListe crée une méthode qui fait une initalisation de liste chainée
    * Créer une cellule initial de base qui pointe vers null
    * créer une méthode qui va permettre d'ajouter des valeurs à la liste
    * créer une méthode pour savoir combien d'élément est-ce que nous avons dans notre liste
*/

class SimpleListe
{
    int idListe; // pour l'identifiant de la liste chainée
    int nombreElement; // pour stocker le nombre d'élément de la liste

    Cellule maCellule = new Cellule(0, null);

    // méthode pour afficher une liste
    void AfficheValues()
    {}

    // méthode pour créer une nouvelle cellule
    void CreerCellule()
    {}

    // méthode pour supprimer une cellule de la chaine
    void supprimerCellule()
    {}
}


public class ListeSimplementChainee {
    
}
