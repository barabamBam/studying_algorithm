import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int result = a*b*c;
        
        int[] num = new int[10];
        
        while(result > 0) {
            num[result%10]++;
            result /= 10;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println(num[i]);
        }
        sc.close();
    }
}