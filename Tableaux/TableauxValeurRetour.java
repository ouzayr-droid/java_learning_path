package Tableaux;

import java.util.ArrayList;
import java.util.List;

class UtilTab
{
    static void genere(int n)
    {
        List<Integer> maList = new ArrayList<Integer>();
        for (int i=0; i<=n; i++)
        {
            if(i%2==1)
            {
                maList.add(i);
            } 
        }
        System.out.print("Voici les n premiers nombres entiers: "+maList);
    }

    static void somme(int tab1[], int tab2 [])
    {
        int fusion [] = new int[tab1.length+tab2.length];
        System.arraycopy(tab1, 0, fusion, 0, 0);
        System.arraycopy(tab2, 0, fusion, tab1.length, tab2.length);
    }
       
}

public class TableauxValeurRetour {
    public static void main(String args [])
    {
        UtilTab.genere(Integer.parseInt(args[0]));
    }
}
