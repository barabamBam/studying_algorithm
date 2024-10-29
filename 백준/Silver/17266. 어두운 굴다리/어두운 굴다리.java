import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        
        for(int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }
        
        int minHeight = Math.max(X[0], N-X[M-1]);
        for(int i = 1; i < M; i++) {
            minHeight = Math.max(minHeight, (X[i]-X[i-1] + 1)/2);
        }
        
        System.out.println(minHeight);
    }
}
