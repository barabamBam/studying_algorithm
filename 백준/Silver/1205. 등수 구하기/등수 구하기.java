import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int newScore = sc.nextInt();
        int P = sc.nextInt();
        List<Integer> scores = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            scores.add(sc.nextInt());
        }
        scores.sort(Comparator.reverseOrder());
        
        if (N == P && newScore <= scores.get(scores.size() - 1)) {
            System.out.println("-1");
        } 
        else {
            int rank = 1;
            for (int i = 0; i < scores.size(); i++) {
                if (newScore >= scores.get(i)) break;
                rank++;
            }
            System.out.println(rank);
        }
        
        sc.close();
    }
}
