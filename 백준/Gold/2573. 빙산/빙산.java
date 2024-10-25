import java.io.*;
import java.util.*;

public class Main {
    public static int[][] visited;
    public static int[][] ice;
    public static int N;
    public static int M;
    
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        ice = new int[N][M];
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for(int j = 0; j < M; j++) {
                ice[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        boolean isSeperated = false;
        int time = 0;
        
        while(true) {
            int mass = 0;
            visited = new int[N][M];
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(ice[i][j] > 0 && visited[i][j] == 0) {
                        dfs(i, j);
                        mass++;
                    }
                }
            }
            
            if(mass >= 2) {
                isSeperated = true;
                break;
            }
            else if(mass == 0) break;
            
            time++;
        }
        if(isSeperated) bw.write(""+time);
        else bw.write("0");
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static void dfs(int x, int y) {
        int[][] direction = {{1,0},{0,-1},{-1,0},{0,1}};
        visited[x][y] = 1;
        for(int i = 0; i < 4; i++) {
            int nx = x+direction[i][0];
            int ny = y+direction[i][1];
            
            if(nx >= 0 && nx < N && ny >= 0 && ny < M 
                && visited[nx][ny] == 0) {
                if(ice[nx][ny] == 0 && ice[x][y] > 0) {
                    ice[x][y]--;
                }
                else if(ice[nx][ny] > 0) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
