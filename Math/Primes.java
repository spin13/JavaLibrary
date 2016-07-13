import java.util.Scanner;

public class Primes{

    static boolean[] sieve(int N){
        boolean[] primes=new boolean[N+1];
        for(int i=1;i<=N;i+=2)primes[i]=true;

        for(int i=3;i<=N;i+=2){
            if(primes[i]){
                for(int i2=i+i;i2<=N;i2+=i)primes[i2]=false;
            }
        }
        return primes;
    }
    
    
    static int[] sieveToList(int N){
        boolean[] primes=new boolean[N+1];
        int cnt = 0;
        for(int i=1;i<=N;i+=2)primes[i]=true;

        for(int i=3;i<=N;i+=2){
            if(primes[i]){
                for(int i2=i+i;i2<=N;i2+=i)primes[i2]=false;
            }
        }
        return primes;
    }
    
    
    public static void main(String[] args){
        int N=30;
        boolean[] primes=sieve(N);

        for(int i=0;i<primes.length;i++){
            if(primes[i])System.out.println(i);
        }
    }
}
