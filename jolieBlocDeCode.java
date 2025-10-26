public class jolieBlocDeCode {
    public static void main(String [] args)
    {
        int epargne = 500;
        int revenus = 2000;
        // Ajoutez 100 à votre épargne

        epargne = epargne + 100;

        //Enlevez 50 à votre indemnité SNIF
        revenus = revenus - 50;

        //Faites une mise à jour sur votre délai d'épargne
        int NombreDeJoursEpargne = (5000 - revenus)/500;

        // Mettre à nouveau encore à jour indemnité
        revenus = revenus + (30-10)*7;
    }    
}
