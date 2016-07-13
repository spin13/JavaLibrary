public class Math{

    // Greatest Common Divisor
    static long gcd(long a, long b){
        return (b==0 ? a: gcd(b, a%b));
    }

    // Least Common Multiple
    static long lcm(long a, long b){
        return a/gcd(a,b)*b;
    }
    

    
    public static void main(String[] args){
        int a=4;
        int b=14;
        System.out.println(gcd(a, b));
        System.out.println(lcm(a,b));
    }
}
