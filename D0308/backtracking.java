package D0308;

public class backtracking {
    static int N=4;
    static int[][] board=new int[4][4];
    public static void main(String[] args){
        if(put_queen(0)==false)
            System.out.println("Solution does not exist!");
        else{
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++)
                    System.out.println(board[i][j]+", ");
                System.out.println();
            }
        }
    }
    //열 조사, 반복문+재귀
    static boolean put_queen(int col){
        if(col>=N) return true;//퀸이 다 배치된 상태
        for(int i=0;i<N;i++){
            //현재 열의 i번째에 퀸을 놓을 수 있는지?
            if(check(i, col)==true){
                board[i][col]=1;
                //다음 열에 대해서도 가능한지 연속적으로 확인
                if(put_queen(col+1))
                    return true;
                //이후 열에 대해서 불가능하다면 이번 행은 0으로 설정하고 다음 행으로 넘어감
                //백트래킹!
                board[i][col]=0;
            }
        }
        // true 반환안하면 답이 없는임으로!(N개의 퀸을 다 배치하지 못함,,
        return false;
    }
    //현재 행 열에 퀸이 배치된 상태인지 확인
    private static boolean check(int row, int col){
        int i,j;
        for(i=0;i<col;i++){
            if(board[row][i]==1)
                return false;
        }
        //현재 위치 기준으로 좌상단 대각선으로 퀸이 있는지 테스트 \ + <-- 방향
        for(i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        //현재 위치 기준으로 우하단 대각선으로 퀸이 있는지 테스트 \ + --> 방향
        for(i=row, j=col;i<N&&j>=0;i++, j--)
            if(board[i][j]==1)
                return false;
        return true;
    }
}
