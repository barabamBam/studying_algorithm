# [Silver IV] 스위치 켜고 끄기 - 1244 

[문제 링크](https://www.acmicpc.net/problem/1244) 

### 분류

구현, 시뮬레이션

### 문제 설명

<p>1부터 연속적으로 번호가 붙어있는 스위치들이 있다. 스위치는 켜져 있거나 꺼져있는 상태이다. <그림 1>에 스위치 8개의 상태가 표시되어 있다. ‘1’은 스위치가 켜져 있음을, ‘0’은 꺼져 있음을 나타낸다. 그리고 학생 몇 명을 뽑아서, 학생들에게 1 이상이고 스위치 개수 이하인 자연수를 하나씩 나누어주었다. 학생들은 자신의 성별과 받은 수에 따라 아래와 같은 방식으로 스위치를 조작하게 된다.</p>

<p>남학생은 스위치 번호가 자기가 받은 수의 배수이면, 그 스위치의 상태를 바꾼다. 즉, 스위치가 켜져 있으면 끄고, 꺼져 있으면 켠다. <그림 1>과 같은 상태에서 남학생이 3을 받았다면, 이 학생은 <그림 2>와 같이 3번, 6번 스위치의 상태를 바꾼다.</p>

<p>여학생은 자기가 받은 수와 같은 번호가 붙은 스위치를 중심으로 좌우가 대칭이면서 가장 많은 스위치를 포함하는 구간을 찾아서, 그 구간에 속한 스위치의 상태를 모두 바꾼다. 이때 구간에 속한 스위치 개수는 항상 홀수가 된다.</p>

<table class="table table-bordered table-center-30">
	<tbody>
		<tr>
			<th>스위치 번호</th>
			<td>①</td>
			<td>②</td>
			<td>③</td>
			<td>④</td>
			<td>⑤</td>
			<td>⑥</td>
			<td>⑦</td>
			<td>⑧</td>
		</tr>
		<tr>
			<th>스위치 상태</th>
			<td>0</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><그림 1></p>

<p>예를 들어 <그림 2>에서 여학생이 3을 받았다면, 3번 스위치를 중심으로 2번, 4번 스위치의 상태가 같고 1번, 5번 스위치의 상태가 같으므로, <그림 3>과 같이 1번부터 5번까지 스위치의 상태를 모두 바꾼다. 만약 <그림 2>에서 여학생이 4를 받았다면, 3번, 5번 스위치의 상태가 서로 다르므로 4번 스위치의 상태만 바꾼다.</p>

<table class="table table-bordered table-center-30">
	<tbody>
		<tr>
			<th>스위치 번호</th>
			<td>①</td>
			<td>②</td>
			<td>③</td>
			<td>④</td>
			<td>⑤</td>
			<td>⑥</td>
			<td>⑦</td>
			<td>⑧</td>
		</tr>
		<tr>
			<th>스위치 상태</th>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><그림 2></p>

<table class="table table-bordered table-center-30">
	<tbody>
		<tr>
			<th>스위치 번호</th>
			<td>①</td>
			<td>②</td>
			<td>③</td>
			<td>④</td>
			<td>⑤</td>
			<td>⑥</td>
			<td>⑦</td>
			<td>⑧</td>
		</tr>
		<tr>
			<th>스위치 상태</th>
			<td>1</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><그림 3></p>

<p>입력으로 스위치들의 처음 상태가 주어지고, 각 학생의 성별과 받은 수가 주어진다. 학생들은 입력되는 순서대로 자기의 성별과 받은 수에 따라 스위치의 상태를 바꾸었을 때, 스위치들의 마지막 상태를 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에는 스위치 개수가 주어진다. 스위치 개수는 100 이하인 양의 정수이다. 둘째 줄에는 각 스위치의 상태가 주어진다. 켜져 있으면 1, 꺼져있으면 0이라고 표시하고 사이에 빈칸이 하나씩 있다. 셋째 줄에는 학생수가 주어진다. 학생수는 100 이하인 양의 정수이다. 넷째 줄부터 마지막 줄까지 한 줄에 한 학생의 성별, 학생이 받은 수가 주어진다. 남학생은 1로, 여학생은 2로 표시하고, 학생이 받은 수는 스위치 개수 이하인 양의 정수이다. 학생의 성별과 받은 수 사이에 빈칸이 하나씩 있다.</p>

### 출력 

 <p>스위치의 상태를 1번 스위치에서 시작하여 마지막 스위치까지 한 줄에 20개씩 출력한다. 예를 들어 21번 스위치가 있다면 이 스위치의 상태는 둘째 줄 맨 앞에 출력한다. 켜진 스위치는 1, 꺼진 스위치는 0으로 표시하고, 스위치 상태 사이에 빈칸을 하나씩 둔다.</p>



#  🚀  오답노트 

```diff
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
-                for(int j = num; j <= N ; j+=j) {
-                    if(switches[j] == 1) switches[j] = 0;
-                    else switches[j] = 1;
+                for(int j = num; j <= N ; j+=num) {
+                    switches[j] = (switches[j] == 1) ? 0 : 1;
                }
            }
            else if(gender == 2) {
-                if(switches[num] == 1) switches[num] = 0;
-                else switches[num] = 1;
+                switches[num] = (switches[num] == 1) ? 0 : 1;
                    
                for(int j = 1; j <= (N-1)/2 ; j++) {
                    if(num-j <= 0 || num+j > N) break;
                    
                    if(switches[num-j] != switches[num+j]) break;
                    else {
-                        if(switches[num-j] == 1) {
-                            switches[num-j] = 0;
-                            switches[num+j] = 0;
-                        }
-                        else {
-                            switches[num-j] = 1;
-                            switches[num+j] = 1;
-                        }
+                        switches[num-j] = (switches[num-j] == 1) ? 0 : 1;
+                        switches[num+j] = (switches[num+j] == 1) ? 0 : 1;
                    }
                }
            }
            
        }
        
        for(int i = 1; i <= N; i++) {
            System.out.print(switches[i]+" ");
+            if(i%20 == 0) System.out.println("");
        }
        sc.close();
    }
}

```


 ## 🏆 전체 코멘트 

20개 씩 끊어 출력, j는 변하는 값이므로 num을 더해야함