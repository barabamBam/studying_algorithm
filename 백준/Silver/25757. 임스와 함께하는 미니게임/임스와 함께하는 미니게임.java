import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);
        
        Set<String> players = new HashSet<>();
        
        for(int i = 0; i < N; i++) {
            players.add(br.readLine());
        }
        
        if(game == 'Y') {
            bw.write(""+players.size());
        }
        else if(game == 'F') {
            bw.write(""+players.size()/2);
        }
        else if(game == 'O') {
            bw.write(""+players.size()/3);
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
