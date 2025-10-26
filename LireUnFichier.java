import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class LireUnFichier
{
    public static void main(String [] args)
    {
        try
        {
            // Création d'un fileReader pour lire le fichier au chemin indiqué
            FileReader fileReader = new FileReader("./notes_cours_openclassroom.txt");
            
            // Création d'un bufferedReader qui utilise le fileReader pour lire ligne par ligne
            BufferedReader reader = new BufferedReader(fileReader);

            // Une fonction à éssayer pouvant générer une erreur
            String line = reader.readLine();

            while (line != null)
            {
                // affichage de la ligne
                System.out.println(line);

                // lecture de la prochaine ligne
                line = reader.readLine();
            }

            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
