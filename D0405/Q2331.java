package D0405;

import java.util.Scanner;

public class Q2331 {
    public static void main(String[] args){
        int[] visit=new int[1000000];//0으로 다 초기화
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        visit[a]=1;
        int p=sc.nextInt();
        while(true){
            int next=0;
            int mog=a;
            for(int i=0;i<String.valueOf(a).length();i++){
                int rest=(int)mog%10;
                mog=(int)mog/10;
                next+=Math.pow(rest, p);
            }
            visit[next]+=1;
            a=next;
            if(visit[next]>2)
                break;
        }
        int count=0;
        for(int i=0;i<1000000;i++){
            if(visit[i]==1)
                ++count;
        }
        System.out.print(count);
    }
}
