import java.util.Scanner;

public class Days{
    static Scanner sc = new Scanner(System.in);

    static boolean isLeapYear(int a){
        if(a%400==0)return true;
        if(a%4==0 && a%100!=0)return true;
        return false;
    }

    static int daySpend(int y1, int m1, int d1, int y2, int m2, int d2){
        int[] mmax = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        return 1;
    }
    public static void main(String[] args){
        System.out.println(isLeapYear(sc.nextInt()));
    }
}
