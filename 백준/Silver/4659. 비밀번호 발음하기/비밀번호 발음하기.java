import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String testPwd;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        while(!(testPwd = br.readLine()).equals("end")) {
            boolean isAcceptable = true;
            boolean hasVowel = false;
            int vowelCount = 0;
            int consonantCount = 0;
            char prevChar = ' ';
            
            for(int i = 0; i < testPwd.length(); i++) {
                    char currentChar = testPwd.charAt(i);
                    
                    boolean isVowel = false;
                    for(char vowel : vowels) {
                        if(currentChar == vowel) {
                            isVowel = true;
                            hasVowel = true;
                            break;
                        }
                    }
                    
                    if(isVowel) {
                        vowelCount++;
                        consonantCount = 0;
                    }
                    else {
                        consonantCount++;
                        vowelCount = 0;
                    }
                    
                    if(vowelCount >= 3 || consonantCount >= 3) {
                        isAcceptable = false;
                        break;
                    }
                    
                    if(i > 0 && currentChar == prevChar && currentChar != 'e' && currentChar != 'o') {
                        isAcceptable = false;
                        break;
                    }
                    
                    prevChar = currentChar;
            }
            
            if(!hasVowel) {
                isAcceptable = false;
            }
            if(isAcceptable) {
                bw.write("<"+testPwd+"> is acceptable.\n");
            }
            else {
                bw.write("<"+testPwd+"> is not acceptable.\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
