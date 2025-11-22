public class CourCir {
    public static void main(String [] args)
    {
        int i=10, j=5;

        if (i<5 && j++<10)System.out.println("&&1 vrai");
        else System.out.println("&&1 faux");  // print &&1 faux
        System.out.println ("i = " + i + " j = " + j) ; // i==10 et j==5

        if (i<5 & j++<10)System.out.println ("& vrai") ;
        else System.out.println ("& faux") ;  // print & est faux
        System.out.println ("i = " + i + " j = " + j) ; // i == 10 et j == 6

        if (i<15 && j++<10) System.out.println ("&&2 vrai"); // print &&2 vrai
        else System.out.println ("&&2 faux") ;               
        System.out.println ("i = " + i + " j = " + j) ;      // i == 10 et j == 7

        if (i<15 || j++<10) System.out.println ("|| vrai") ;  // print || vrai
        else System.out.println ("|| faux") ;
        System.out.println ("i = " + i + " j = " + j) ;       //i == 10 et j == 7
    }
    
}
