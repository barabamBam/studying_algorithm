import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] switches = new int[N+1];
        
        for(int i = 1; i <= N; i++) {
            switches[i] = sc.nextInt();
        }
        
        int studentNum = sc.nextInt();
        
        for(int i = 0; i < studentNum; i++) {
            int gender = sc.nextInt();
            int num = sc.nextInt();
            if(gender == 1) {
                for(int j = num; j <= N ; j+=num) {
                    switches[j] = (switches[j] == 1) ? 0 : 1;
                }
            }
            else if(gender == 2) {
                switches[num] = (switches[num] == 1) ? 0 : 1;
                    
                for(int j = 1; j <= (N-1)/2 ; j++) {
                    if(num-j <= 0 || num+j > N) break;
                    
                    if(switches[num-j] != switches[num+j]) break;
                    else {
                        switches[num-j] = (switches[num-j] == 1) ? 0 : 1;
                        switches[num+j] = (switches[num+j] == 1) ? 0 : 1;
                    }
                }
            }
            
        }
        
        for(int i = 1; i <= N; i++) {
            System.out.print(switches[i]+" ");
            if(i%20 == 0) System.out.println("");
        }
        sc.close();
    }
}
