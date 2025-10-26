public class FactorielImplementation
{
    public static void main(String [] args)
    {
        int value = 4;
        FactorielImplementation f = new FactorielImplementation();
        System.out.println(f.factoriel(value));
    }

    public int factoriel(int n)
    {
        if(n==1)
        {
            return n;
        }
        else
        {
            n = Math.abs(n);
            return n*factoriel(n-1);
        }
        
       
    }
} 