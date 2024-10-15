import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            bw.write((A+B)+"\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
