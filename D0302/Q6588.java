package D0302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q6588 {
    public static void main(String[] args) throws IOException {
        String fail="Goldbach's conjecture is wrong.";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //prime_number arr
        int prime_size=1000000;
        int[] prime_arr=new int[prime_size+1];
        //초기화
        for(int i=2;i<=prime_size;i++)
            prime_arr[i]=i;
        // 0으로 지우기
        for(int i=2;i<=prime_size;i++){
            if(prime_arr[i]==0)
                continue;
            for(int j=i*2;j<=prime_size;j+=i)
                prime_arr[j]=0;
        }
        int num=0;
        while(true){
            num=Integer.parseInt(br.readLine());
            if(num==0)
                break;
            boolean chk=false;
            for(int i=num;i>=0;--i){
                if(prime_arr[i]==0) continue;
                if(prime_arr[num-i]!=0){
                    System.out.println(num+" = "+(num-i)+" + "+i);
                    chk=true;
                    break;
                }
            }
            if(!chk)
                System.out.println(fail);
        }
    }
}
