package D0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int target=Integer.parseInt(st.nextToken());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int rest=target, mod=-1;
        int j=n-1;
        int count=0;
        while(rest!=0){
            for(int i=j;i>=0;i--){
                if(rest>=arr[i]){
                    mod=rest/arr[i];
                    rest=rest%arr[i];
                    j=i;
                    count+=mod;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
