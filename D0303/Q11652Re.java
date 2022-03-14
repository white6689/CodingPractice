package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q11652Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);
        int count = 1, max_count = 1;
        long max_num=arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                ++count;
            else
                count = 1;
            if(max_count<count){
                max_count=count;
                max_num=arr[i];
            }
        }
        System.out.println(max_num);
    }

}