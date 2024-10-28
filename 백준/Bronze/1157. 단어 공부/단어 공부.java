import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String word = br.readLine();
        int[] alphabet = new int[26];
        
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) >= 'a' ? word.charAt(i)-'a' : word.charAt(i)-'A';
            alphabet[index]++;
        }
        
        boolean hasSame = false;
        int max = -1;
        char maxAlphabet = '?';
        
        for(int i = 0; i < alphabet.length; i++) {
            if(max == alphabet[i]) hasSame = true;
            else if(max < alphabet[i]) {
                hasSame = false;
                max = alphabet[i];
                maxAlphabet = (char)(65+i);
            }
        }
        
        if(hasSame) bw.write("?");
        else bw.write(""+maxAlphabet);
        
        bw.flush();
        bw.close();
        br.close();
    }
}
