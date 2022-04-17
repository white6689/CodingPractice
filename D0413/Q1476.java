package D0413;

import java.util.Scanner;

public class Q1476 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] input=new int[3];
        int[] output=new int[]{1, 1, 1};
        input[0]=sc.nextInt();
        input[1]=sc.nextInt();
        input[2]=sc.nextInt();
        int year=1;
        while(true){
            if(input[0]==output[0]&&input[1]==output[1]&&input[2]==output[2]){
                System.out.println(year);
                return;
            }
            else{
                ++year;
                if(output[0]+1>15)
                    output[0]=1;
                else
                    ++output[0];
                if(output[1]+1>28)
                    output[1]=1;
                else
                    ++output[1];
                if(output[2]+1>19)
                    output[2]=1;
                else
                    ++output[2];
            }
        }
    }
}
