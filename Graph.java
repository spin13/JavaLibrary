import java.util.*;


public class Graph{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Queue<Integer>> list = new LinkedList<Queue<Integer>>();

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(new LinkedList<Integer>());
        }

        while(true){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0 && b==0)break;
            list.get(a).add(b);
        }



        for(int i=0;i<list.size();i++){
            System.out.println(i+" "+list.get(i));
        }
    }
}
