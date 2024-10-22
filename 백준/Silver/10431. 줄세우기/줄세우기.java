import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = 0;
        int[] children = new int[20];
        
        int P = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i <= P; i++) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            T = Integer.parseInt(st.nextToken());
            
            for(int j = 0; j < 20; j++) {
                children[j] = Integer.parseInt(st.nextToken());
            }
            
            for(int k = 0; k < 20; k++) {
                for(int l = 0; l < k; l++) {
                    if(children[l] > children[k]) cnt++;
                    
                }
            }
            bw.write(i + " " + cnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
