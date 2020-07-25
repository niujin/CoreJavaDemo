package switchdemo;

public class PrimeNumber {
    static String sieveOfEratosthenes(int n)
    {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {

            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                builder.append(String.valueOf(i));
        }
        return builder.toString();
    }

    public static void main(String[] args){
        String s = sieveOfEratosthenes(21000);
        s.substring(10,15);
        System.out.println(s)
    }
}
