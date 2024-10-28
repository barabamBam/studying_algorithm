import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(br.readLine());
        String setString = "";
        
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            String num = "";
            
            switch(action) {
                case "add":
                    if(!setString.contains(num = st.nextToken())) setString=setString.concat(num);
                    break;
                case "remove":
                    if(setString.contains(num = st.nextToken())) setString=setString.replace(num,"");
                    break;
                case "check":
                    if(setString.contains(num = st.nextToken())) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "toggle":
                    if(!setString.contains(num = st.nextToken())) setString=setString.concat(num);
                    else setString=setString.replace(num,"");
                    break;
                case "all":
                    setString = "{1";
                    for(int j = 2; j <= 20; j++) setString=setString.concat(","+j);
                    setString=setString.concat("}");
                    break;
                case "empty":
                    setString = "";
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
