package D0302;

import java.util.Scanner;

public class Q1676 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num<5)
            System.out.println(0);
        else{
            int remind=0;
            for(int i=5;i<=num;i+=5){
                remind=i;
                while(true){
                    if(remind%5!=0)
                        break;
                    ++count;
                    remind=remind/5;
                }
            }
            System.out.println(count);
        }
    }
}
