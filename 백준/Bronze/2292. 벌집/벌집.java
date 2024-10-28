import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int room = 1;
        int num = 1;
        
        while(num < N) {
            num += (6*room);
            room++;
        }
        
        System.out.println(room);
        sc.close();
    }
}
