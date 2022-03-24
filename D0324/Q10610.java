package D0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split("");
        Integer[] arr=new Integer[str.length];
        int result=0;
        for(int i=0;i<str.length;i++){
            int n=Integer.parseInt(str[i]);
            result+=n;
            arr[i]= n;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        if((result%3)==0&&arr[arr.length-1]==0){
            for(int i:arr)
                System.out.print(i);
        }
        else
            System.out.println(-1);
    }

}
