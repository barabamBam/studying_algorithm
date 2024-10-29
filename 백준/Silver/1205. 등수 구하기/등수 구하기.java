import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int newScore = sc.nextInt();
        int P = sc.nextInt();
        int[] scores = new int[N];
        
        for(int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }
        scores = Arrays.stream(scores)
                        .boxed()
                        .sorted(Collections.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
        
        if (N == P && newScore <= scores[scores.length - 1]) {
            System.out.println("-1");
        } 
        else {
            int rank = 1;
            for (int i = 0; i < scores.length; i++) {
                if (newScore >= scores[i]) break;
                rank++;
            }
            System.out.println(rank);
        }
        
        sc.close();
    }
}
