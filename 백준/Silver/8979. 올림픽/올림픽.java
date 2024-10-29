import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] gold = new int[N];
        int[] silver = new int[N];
        int[] bronze = new int[N];
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken())-1;
            gold[index] = Integer.parseInt(st.nextToken());
            silver[index] = Integer.parseInt(st.nextToken());
            bronze[index] = Integer.parseInt(st.nextToken());
        }
        
        int rating = 1;
        for(int i = 0; i < N; i++) {
            if(gold[i] > gold[K-1]) rating++;
            else if(gold[i] == gold[K-1]) {
                if(silver[i] > silver[K-1]) rating++;
                else if(silver[i] == silver[K-1] && bronze[i] > bronze[K-1]) rating++;
            }
        }
        
        bw.write(""+rating);
        bw.flush();
        bw.close();
        br.close();
    }
}
