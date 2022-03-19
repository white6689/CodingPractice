package D0319;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10816 {
    //편법, counts에 있는 값이랑 동일하면 이전값을 바로 출력해준다.
    //아 진짜 모르겠다...복잡하게 하는 거 뺴고는 방법이 생각이 안남....
    static int[] input;
    static int[] counts;
    static int[] output;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        input=new int[n+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            input[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(input);
        int k=Integer.parseInt(br.readLine());
        counts=new int[k];
        st=new StringTokenizer(br.readLine());
        br.close();
        for(int i=0;i<k;i++)
        {
            int kn=Integer.parseInt(st.nextToken());
            sb.append(rightBound(kn)-leftBound(kn)).append(" ");
        }
        System.out.println(sb);
    }
    //왼쪽 bound, 오른쪽 bound 찾아서 차이를 빼준다.
    static int leftBound(int i){
        int start=0;
        int end=input.length;
        while(start<end){
            int middle=(start+end)/2;
            if(input[middle]>=i)
                end=middle;
            else
                start=middle+1;
        }
        return start;
    }
    static int rightBound(int i){
        int start=0;
        int end=input.length;
        while(start<end){
            int middle=(start+end)/2;
            if(input[middle]>i)
                end=middle;
            else
                start=middle+1;
        }
        return start;
    }
}
