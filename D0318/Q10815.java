package D0318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {
    static int[] n_arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        n_arr=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            n_arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(n_arr);
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            System.out.print(binary_search(Integer.parseInt(st.nextToken()))+" ");
        }
    }
    // 이분 탐색
    //1. 가운데 값을 찾는다.
    //2. 가운데 값이 목표값보다 작은지 큰지 확인
    //3. 목표값이 더 크다면 오른쪽을 본다.
    //4. 목표값이 더 작다면 왼쪽을 본다.
    //5. 목표값을 찾으면 return 1
    //6. 목표값을 찾지 못한다면 return 0
    static int binary_search(int k){
        int start=0;
        int end=n-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(n_arr[middle]==k)
                return 1;
            else if(n_arr[middle]<k){
                start=middle+1;
                continue;
            }
            else{
                end=middle-1;
                continue;
            }
        }
        return 0;

    }
}
