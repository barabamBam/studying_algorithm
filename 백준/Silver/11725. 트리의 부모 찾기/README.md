# [Silver II] 트리의 부모 찾기 - 11725 

[문제 링크](https://www.acmicpc.net/problem/11725) 

### 분류

그래프 이론, 그래프 탐색, 트리, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>루트 없는 트리가 주어진다. 이때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 노드의 개수 N (2 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N-1개의 줄에 트리 상에서 연결된 두 정점이 주어진다.</p>

### 출력 

 <p>첫째 줄부터 N-1개의 줄에 각 노드의 부모 노드 번호를 2번 노드부터 순서대로 출력한다.</p>



#  🚀  오답노트 

```diff
import java.util.*;

public class Main {
-    private static boolean[][] tree;
+    private static ArrayList<Integer>[] tree;
    private static int[] parent;
-    private static int N;
        
    public static void main(String[] args) {
        // 코드를 작성해주세요
        
        Scanner sc = new Scanner(System.in);
-        N = sc.nextInt();
-        tree = new boolean[N+1][N+1];
+        int N = sc.nextInt();
+        tree = new ArrayList[N+1];
        parent = new int[N+1];
        
+        for(int i = 0; i <= N; i++) {
+            tree[i] = new ArrayList<>();
+        }
        // 노드 연결
        for(int i = 0; i < N-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
-            tree[a][b] = true;
-            tree[b][a] = true;
+            tree[a].add(b);
+            tree[b].add(a);
        }
        
        findParent(1);
        
        for(int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
    
    // 부모 자식 관계 확인
    public static void findParent(int parentNum) {
-        for(int i = 2; i <= N; i++) {
-            if(tree[parentNum][i] == true) {
-                tree[i][parentNum] = false;
-                parent[i] = parentNum;
-                findParent(i);
-            }
+        for(int i = 0; i < tree[parentNum].size(); i++) {
+            int temp = tree[parentNum].get(i);
+            tree[temp].remove(tree[temp].indexOf(parentNum));
+            parent[temp] = parentNum;
+            findParent(temp);
        }
+        
    }
}

```


 ## 🏆 전체 코멘트 

tree를 배열로 선언하게 되면 findParent() 메서드의 for 문에서 방문해야할 곳이 너무 많아져서 메모리 초과가 발생한다. 
이를 해결하기 위해 ArrayList를 배열로 선언하는 이중 ArrayList 문을 사용하여 해결하였다. 