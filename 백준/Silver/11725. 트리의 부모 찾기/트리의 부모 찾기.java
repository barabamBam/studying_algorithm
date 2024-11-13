import java.util.*;

public class Main {
    private static ArrayList<Integer>[] tree;
    private static int[] parent;
        
    public static void main(String[] args) {
        // 코드를 작성해주세요
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        tree = new ArrayList[N+1];
        parent = new int[N+1];
        
        for(int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }
        // 노드 연결
        for(int i = 0; i < N-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            tree[a].add(b);
            tree[b].add(a);
        }
        
        findParent(1);
        
        for(int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
    
    // 부모 자식 관계 확인
    public static void findParent(int parentNum) {
        for(int i = 0; i < tree[parentNum].size(); i++) {
            int temp = tree[parentNum].get(i);
            tree[temp].remove(tree[temp].indexOf(parentNum));
            parent[temp] = parentNum;
            findParent(temp);
        }
        
    }
}
