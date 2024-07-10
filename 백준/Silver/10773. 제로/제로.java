import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Stack<Integer> stack = new Stack();
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        int lineNum = sc.nextInt();
        
        while(lineNum-- > 0) {
            int money = sc.nextInt();
            if(money == 0){
                sum -= stack.pop();
            } else {
               stack.push(money);
                sum += money;
            }
        }
        System.out.println(sum);
    }
}
