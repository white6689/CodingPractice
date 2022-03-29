package D0329;

import java.util.Scanner;

public class Q1343 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split("");
        StringBuilder sb=new StringBuilder();
        int x_count=0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals("X"))
                x_count++;
            else if(str[i].equals(".")){
                if(x_count>0){
                    int m=x_count/4;
                    int n=x_count%4;
                    if(n%2==0){
                        for(int j=0;j<m*4;j++)
                            sb.append("A");
                        for(int j=0;j<n;j++)
                            sb.append("B");
                    }
                    else{
                        System.out.println("-1");
                        return;
                    }
                    x_count=0;
                }
                sb.append(".");
            }
        }
        if(x_count>0){
            int m=x_count/4;
            int n=x_count%4;
            if(n%2==0){
                for(int j=0;j<m*4;j++)
                    sb.append("A");
                for(int j=0;j<n;j++)
                    sb.append("B");
            }
            else{
                System.out.println("-1");
                return;
            }
        }
        System.out.print(sb);
    }
}
