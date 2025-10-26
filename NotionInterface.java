public class NotionInterface {
    //Votre interface “fonctionnelle”
public interface Etudiant {
    void donnerNom();
 }
 
 //Utilisation
 public static void main(String[] args) {
    Etudiant et = () -> {System.out.println("Toto");};
    et.donnerNom();//Affichera Toto
 }
     
}
