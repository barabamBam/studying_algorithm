import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            Integer num = null;
            
            if (!action.equals("all") && !action.equals("empty")) num = Integer.parseInt(st.nextToken()); 
            switch(action) {
                case "add":
                    set.add(num);
                    break;
                case "remove":
                    set.remove(num);
                    break;
                case "check":
                    bw.write(set.contains(num) ? "1\n" : "0\n");
                    break;
                case "toggle":
                    if(!set.contains(num)) set.add(num);
                    else set.remove(num);
                    break;
                case "all":
                    set.clear();
                    for(int j = 1; j <= 20; j++) set.add(j);
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
