public class Livre {
    String title;
    String author;
    int numberOfPages;
    String publisher ;

    // Constructeur secondaire de la classe Book
    Livre(String title, String author, int numberOfPages)
    {
        // utilise le constructeur principal avec des valeurs prédéfinies
        this(title, author, numberOfPages, "OC");
    }

    //constructeur principal de la classe
    Livre(String title, String author, int numberOfPages, String publisher)
    {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }
}
