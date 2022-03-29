package D0329;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1744 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> plus=new ArrayList<>();
        ArrayList<Integer> minus=new ArrayList<>();
        boolean zero=false;
        int sum=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num<0)
                minus.add(num);
            else if(num==1)
                sum+=1;
            else if(num==0)
                zero=true;
            else
                plus.add(num);
        }
        Collections.sort(plus);
        Collections.sort(minus, Collections.reverseOrder());
        //양수 더하기
        for(int i=plus.size()-1;i>=1;i-=2)
            sum+=(plus.get(i)*plus.get(i-1));
        if(plus.size()%2==1)
            sum+=plus.get(0);
        //음수 더하기
        for(int i=minus.size()-1;i>=1;i-=2)
            sum+=(minus.get(i)*minus.get(i-1));
        if(minus.size()%2==1 && !zero)
            sum+=minus.get(0);
        System.out.println(sum);

    }
}
