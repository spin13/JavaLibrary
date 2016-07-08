public class LcmGcd{
    public static void main(String[] args){
        int a=4;
        int b=14;
        System.out.println(gcd(a, b));
        System.out.println(lcm(a,b));
    }

    static long gcd(long a, long b){ //Greatest Common Divisor
        return (b==0 ? a: gcd(b, a%b));
    }

    static long lcm(long a, long b){ //Least Common Multiple
        return a/gcd(a,b)*b;
    }
}
