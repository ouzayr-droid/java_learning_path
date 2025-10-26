public class randomTextForInput {
    public static void main(String [] args)
    {
        String a = "Bonjour";
        String b = "Bonjour";

        System.out.println(a==b);

        String x = new String("Bonjour"); //il faut toujours spécifier une valeur initial dans ce contexte
        String y = new String("Bonjour");

        System.out.println(x==y); 
    }
}
