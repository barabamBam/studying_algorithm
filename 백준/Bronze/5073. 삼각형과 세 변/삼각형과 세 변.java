import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String triangle;
        
        while(!(triangle = br.readLine()).equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(triangle);
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
                        
            int longest = Math.max(a,b);
            longest = Math.max(longest,c);
            
            if(a+b+c-longest <= longest) bw.write("Invalid\n");
            else if(a == b && b == c)  bw.write("Equilateral\n");
            else if(a == b || b == c || a == c) bw.write("Isosceles\n");
            else bw.write("Scalene\n");
        
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
