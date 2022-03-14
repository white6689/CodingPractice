package D0302;

import java.util.Scanner;

public class Q11653 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] prime_arr=new int[num+1];
        //소수 목록 구하는 중
        for(int i=2;i<=num;i++)
            prime_arr[i]=i;
        for(int i=2;i<=num;i++){
            if(prime_arr[i]==0) continue;
            for(int j=i*2;j<=num;j+=i)
                prime_arr[j]=0;
        }
        //소인수 분해
        int size=num;
        for(int i=2;i<=size;){
            if(prime_arr[i]==0){
                ++i;
                continue;
            }
            if(num/prime_arr[i]==1){
                System.out.println(num);
                break;
            }
            if(num%prime_arr[i]==0){
                num=num/i;
                System.out.println(i);
            }
            else
                i++;
        }
    }
}
