package D0110;

import java.util.Scanner;

public class Q11503 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] dp=new int[num];
        int[] number=new int[num];
        String[] str=sc.next().split(" ");
        for(int i=0;i<num;i++)
            number[i]=Integer.parseInt(str[i]);


    }
}
