//https://www.acmicpc.net/board/view/84486
package D0321;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q2417 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(binary_search(sc.nextDouble()));
    }
    //2로 나눈 값 들어감
    static long binary_search(double ll){
        long result=0;
        long st=1;
        long end=(long)(ll/2)+1;
        while(st<=end){
            long mid=(st+end)/2;
            if(Math.pow(mid, 2)==ll)
                return mid;
            else if(Math.pow(mid, 2)>ll){
                result=mid;
                end=mid-1;
            }
            else
                st=mid+1;
        }
        return result;
    }
}



