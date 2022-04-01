package D0401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1758 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        Collections.sort(arr, Collections.reverseOrder());
        long sum=0;
        for(int i=0;i<n;i++){
            int num=arr.get(i)-(i+1-1);
            if(num>=0)
                sum+=num;
        }
        System.out.println(sum);
    }
}
