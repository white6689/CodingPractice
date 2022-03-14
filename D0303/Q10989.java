package D0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//계수 정렬을 사용하는 방법
public class Q10989 {
    static int count[];
    static int arr[];
    //중복되는 값을 무시해야한다면?중보
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(br.readLine());
        int[] count=new int[10000+1];
        //해당 인덱스의 값을 증가시킨다.
        for(int i=0;i<N;i++){
            count[Integer.parseInt(br.readLine())]++;
        }
        br.close();
        //count[1]부터 차례대로 해당 인덱스의 배열 값이 0이 될때까지 sb에 저장한다.
        for(int i=1;i<=10000;i++){
            while(count[i]>0){
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}
