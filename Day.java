
import java.util.Scanner;
class Func{
    public int dayspent(int mo1,int da1,int mo2,int da2){

        int[] max={0,31,29,31,30,31,30,31,31,30,31,30,31};
        int a=0;
        int d1[]=new int[2];
        int d2[]=new int[2];

        d1[0]=mo1; //month
        d1[1]=da1; //day

        d2[0]=mo2; //m
        d2[1]=da2; //d
        
        if(d1[0]==d2[0]){
            return d2[1]-d1[1];
        }else{
            a=(max[d1[0]]-d1[1])+(d2[1]-1);

            for(int i=d1[0]+1;i<=d2[0]-1;i++){
                a+=max[i];
            }
            return a+1;
        }
    }
}

public class Day{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Func fu=new Func();

        int da=fu.dayspent(1,20,2,13);
        System.out.println(da);
    }
}
