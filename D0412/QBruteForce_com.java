package D0412;

public class QBruteForce_com {
    public static void main(String[] args){
        backtracking(new int[]{1, 9, 7}, new boolean[3], 0, 3, 2);
        System.out.println("===");
        rec(new int[]{1, 9, 7}, new boolean[3], 0, 3, 2);

    }
    static void backtracking(int[] arr, boolean[] visit, int start, int n, int r){
        if(r==0){
            for(int i=0;i<n;i++){
                if(visit[i])
                    System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<n;i++){
            visit[i]=true;
            backtracking(arr, visit, i+1, n, r-1);
            visit[i]=false;
        }
    }
    static void rec(int[] arr, boolean[] visit, int depth, int n, int r){
        if(r==0){
            for(int i=0;i<n;i++){
                if(visit[i])
                    System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        if(depth==n)
            return;
        visit[depth]=true;
        rec(arr, visit, depth+1, n, r-1);
        visit[depth]=false;
        rec(arr, visit, depth+1, n, r);
    }
}
