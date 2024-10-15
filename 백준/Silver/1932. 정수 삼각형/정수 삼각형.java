import java.util.*;

public class Main {
    public static int[][] trangle;
    public static int[][] sum;
    public static int n;
    
    public static void main(String[] args) {
        // 코드를 작성해주세요
        makeTrangle();
        System.out.println(dfs());
    }
    
    public static void makeTrangle() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        trangle = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                trangle[i][j] = sc.nextInt();
            }
        }
    }
    
    public static int dfs() {
        sum = new int[n][n];
        sum[0][0] = trangle[0][0];
        
        int result = 0;
        
        for(int i = 1; i < n; i++) {
            sum[i][0] = sum[i-1][0] + trangle[i][0];
            sum[i][i] = sum[i-1][i-1] + trangle[i][i];
        }
        
        for(int i = 2; i < n; i++) {
            for(int j = 1; j < i; j++) {
                sum[i][j] = 
                (sum[i-1][j-1] > sum[i-1][j] ? sum[i-1][j-1] : sum[i-1][j])
                + trangle[i][j];
            }
        }
        
        for(int i = 0; i < n; i++) {
            result = (result < sum[n-1][i] ? sum[n-1][i] : result);
        }
        
        return result;
    }
}
