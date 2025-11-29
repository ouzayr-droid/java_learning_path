package Tableaux;
import java.util.Scanner;

public class Tableaux {
    public static void main (String args[])
    { 
        final int N = 5 ;
        double val [] = new double[N] ;
        int i ;
        Scanner input = new Scanner(System.in);

        System.out.println ("donnez " + N + " valeurs flottantes") ;
        for (i=0 ; i<N ; i++) val[i] = input.nextDouble();

        double valMax = val[0], valMin = val[0], somme=0 ;

        for (i=0 ; i<N ; i++)
        { 
            if (val[i] > valMax) valMax = val[i] ; // for (double v : val)
            if (val[i] < valMin) valMin = val[i] ; // { if (v>valMax) valMax=v ;
            somme += val[i] ;                       // if (v<valMin) valMin=v ;
        }
        // som += v ;
        // }
        System.out.println ("valeur maximale = " + valMax) ;
        System.out.println ("valeur minimale = " + valMin) ;
        double vMoyenne = somme/N ; // on suppose que N est strictement positif
        System.out.println ("moyenne " + vMoyenne) ;
    }
}
