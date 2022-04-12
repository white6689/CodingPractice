package D0412;

//100개 중에 5개를 선택하는 경우
public class QBruteForce_rec {
    static int lim=10;
    static int n=2;
    static int num=0;
    public static void main(String[] args){
        int[] chosen=new int[n];
        solve(chosen, 0, 0);
        System.out.println(num);
    }
    //chosen[] 현재까지의 결과를 담는 아이..?
    static void solve(int[] chosen, int curr, int cnt){
        //n개의 숫자를 다 선택했다면 재귀를 끝내기
        if(cnt==n){
            ++num;
            for(int i:chosen)
                System.out.print(i+" ");
            System.out.println();
            return;
        }
        for(int i=curr+1;i<=lim;i++){
            chosen[cnt]=i;
            solve(chosen, i, cnt+1);
        }

    }
}
