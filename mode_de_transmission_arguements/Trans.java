package mode_de_transmission_arguements;

class A
{ 
    private int n ;

    public A (int nn)
    {
        n = nn ;
    }

    public int getn ()
    { 
        return n ;
    }

    public void setn (int nn)
    { 
        n = nn ;
    }
    
}

class Util
{ 
    public static void incre (A a, int p)
    { 
        a.setn (a.getn()+p);
    }

    public static void incre (int n, int p)
    { 
        n += p ;
    }
}

public class Trans {
    public static void main (String args[])
    { 
        A a = new A(2) ;                                                // création d'un objet a pour n=2
        int n = 2 ;
        System.out.println ("valeur de a avant : " + a.getn()) ;            // affichce 2
        
        Util.incre (a, 5) ;                                              // 2+5
        System.out.println ("valeur de a apres : " + a.getn()) ;           // affiche 7
        System.out.println ("valeur de n avant : " + n) ;                   // affiche 2
        
        Util.incre (n, 5) ;
        System.out.println ("valeur de n apres : " + n) ;                   // affiche 7 parceque n += p; modifie aussi la valeur de n sachant que entre temps c'est son adresse qu'on a fournit comme argument
    }
}
