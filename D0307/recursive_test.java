package D0307;

//100개의 숫자 중 5개를 고르는 경우의 수
public class recursive_test {
    static int lim=100;
    static int n=5;
    public static void main(String[] args){
        int[] chosen=new int[n];
        solve(chosen, 0, 0);
    }
    static void solve(int[] chosen, int curr, int cnt){
        //n개의 숫자를 다 선택했다면 재귀를 끝내기
        if(cnt==n){
            for(int i:chosen)
                System.out.print(i+" ");
            System.out.println();
            return;
        }
        for(int i=curr+1;i<=lim;i++){
            chosen[cnt]=i;
            solve(chosen, curr, cnt+1);
        }
    }
}
