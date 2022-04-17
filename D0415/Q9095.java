package D0415;

import java.util.Scanner;

public class Q9095 {
    static int result_count, target;
    static int[] num={1, 2, 3};
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            result_count=0;
            target=sc.nextInt();
            number_case(0);
            System.out.println(result_count);
        }
    }
    static void number_case(int sum){
        if(sum>target)
            return;
        if(sum==target){
            ++result_count;
            return;
        }
        for(int i=0;i<3;i++){
            number_case(sum+num[i]);
        }

    }
}
