import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] channels = new String[N];
        String result = "";
        
        for(int i = 0; i < N; i++) {
            channels[i] = br.readLine();
        }
        
        for(int i = 0; i < N; i++) {
            if(channels[i].equals("KBS1")) {
                for(int j = i; j > 0; j--) {
                    result = result.concat("4");
                    String temp = channels[j-1];
                    channels[j-1] = channels[j];
                    channels[j] = temp;
                }
                break;
            }
            else result = result.concat("1");
        }
        
        for(int i = 0; i < N; i++) {
            if(channels[i].equals("KBS2")) {
                for(int j = i; j > 1; j--) result = result.concat("4");
                break;
            }
            else result=result.concat("1");
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
