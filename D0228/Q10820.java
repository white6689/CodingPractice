package D0228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10820 {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        sc.useDelimiter("");
//        String[] str=new String[100];
        int[] nums=new int[4];
//        int i=0;
//        while(sc.hasNext()){
//            str[i]=sc.next();
//            ++i;
//        }
//        i =0;
//        while(str[i]!=null){
//            System.out.println(str[i]);
//            ++i;
//        }
        do{
            String str=sc.next();
            System.out.print((int)str.charAt(0)+" ");
            if(str=="\n")
                nums=new int[4];
            int num=str.charAt(0);
            if((97<=num) && (num<=123))
                nums[0]+=1;
            else if((65<=num) && (num<=90))
                nums[1]+=1;
            else if(((9<=num)&&(13<=num))||num==32)
                nums[3]+=1;
            else
                nums[2]+=1;
            }while(true);
//            for(int i=0;i<3;i++)
//                System.out.print(nums[i]+" ");
//            System.out.println(nums[3]);
//            nums=new int[4];



    }

}
