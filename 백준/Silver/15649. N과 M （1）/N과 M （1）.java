import java.util.Scanner;

public class Main {
    
    public static int n;
    public static int m;
    public static int[] arrays;
    public static boolean[] visit;
    
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        arrays = new int[m];
        visit = new boolean[n];
        
        dfs(0);
    }
    
    public static void dfs(int depth) {
        if(m == depth){
            for(int array : arrays){
                System.out.print(array+" ");
            }
            System.out.println("");
            return;
        }
        
        for(int i = 0; i < n; i++){
            if(!visit[i]){
                visit[i] = true;
                arrays[depth] = i+1;
                dfs(depth+1);
                visit[i] = false;
            }
        }
    }
}
