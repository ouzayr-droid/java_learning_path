public class Animal {
    void deplacer()
    {
        System.out.println("Je me déplace !");
    }
}

class Chien extends Animal
{
    void deplacer()
    {
        System.out.println("Je marche !");
    }
}

class Oiseau extends Animal
{
    void deplacer()
    {
        System.out.println("Je vole !");
    }
}

class Pigeon extends Animal
{
    void deplacer()
    {
        System.out.println("Je vole surtout en ville !");
    }
}