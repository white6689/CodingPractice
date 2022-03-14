package D0308;

import java.io.*;

public class Permutation {
    static int[] perm;
    static int n=5;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        perm=new int[]{1,2,3,4, 0};
        while(get_next_perm()){
            for(int num:perm)
                bw.write(String.valueOf(num)+" ");
            bw.write("\n");
        }
        bw.flush();
    }
    private static boolean get_next_perm(){
        int i=n-1;
        //뒤에서 부터 체크해 현재 위치가 뒤에서부터 오름차순이 아닌 경우를 찾음
        //뒤에서부터 오름차순이라는 것은 사전 순으로 최종 수열이라는 의미
        while(i>0&&perm[i-1]>=perm[i]) i--;
        //최종 순열이라면 false 반환
        if(i<=0)return false;
        //j는 i-1부터 시작
        //i-1이후의 모든 숫자 중 큰 것을 고르는데 그중, j의 값이 가장 큰 경우로 선택
        int j=i-1;
        while(j<n-1&&perm[j+1]>perm[i-1])j++;
        //j와 i-1번쨰를 swap
        swap(i-1, j);
        //i번째 이후의 모든 숫자를 뒤집기
        //i~n-1를 뒤집어야 함으로 j값을 n-1로 초기화
        j=n-1;
        while(i<j){
            swap(i, j);
            i+=1;j-=1;
        }
        return true;
    }
    public static void swap(int i, int j){
        int temp=perm[i];
        perm[i]=perm[j];
        perm[j]=temp;
    }
}
