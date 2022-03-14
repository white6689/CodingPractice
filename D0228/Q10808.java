package D0228;

import java.util.Scanner;

public class Q10808 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] count=new int[26];
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            count[(int)c-97]+=1;
        }
        for(int i=0;i<25;i++)
            System.out.print(count[i]+" ");
        System.out.print(count[25]);
    }
}
