import java.util.Scanner;

public class Alphabet{
    static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int a=sc.nextInt();
        System.out.println(upperNumAlp(a));
        System.out.println(lowerNumAlp(a));
    }

    static int lowerAlpNum(char a){ //a=0, z=25
        return (int)a-97;
    }

    static int upperAlpNum(char a){
        return (int)a-65;
    }

    static char lowerNumAlp(int a){ //0=a, 25=z
        return (char)(a+97);
    }
    static char upperNumAlp(int a){
        return (char)(a+65);
    }

}
