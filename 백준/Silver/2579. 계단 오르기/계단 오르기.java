import java.io.*;

public class Main {
    public static int step;
    public static int[] stair;
    public static int[] dp;
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        makeStairs();
        makeResult();
        bw.write(String.valueOf(dp[step - 1]));
        
        bw.flush();
        bw.close();
    }
    
    public static void makeStairs() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        step = Integer.parseInt(br.readLine());
        
        stair = new int[step];
        
        for (int i = 0; i < step; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        
        br.close();
    }
    
    public static void makeResult() {
        dp = new int[step];
        
        if (step > 0) dp[0] = stair[0];
        if (step > 1) dp[1] = stair[0] + stair[1];
        if (step > 2) dp[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);
        
        for (int i = 3; i < step; i++) {
            dp[i] = Math.max(dp[i - 3] + stair[i - 1] + stair[i], dp[i - 2] + stair[i]);
        }
    }
}