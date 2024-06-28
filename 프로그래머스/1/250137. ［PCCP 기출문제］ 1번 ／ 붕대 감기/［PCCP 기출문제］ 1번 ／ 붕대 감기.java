class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int time = 1, successTime = 0, index = 0;
        answer = health;
        
        while(time <= attacks[attacks.length-1][0]) {
            
            if(time == attacks[index][0]) {
                successTime = 0;
                answer -= attacks[index][1];
                index++;
                if(answer <= 0) {
                    answer = -1;
                    return answer;
                }
            }
            else {
                successTime++;
                answer += bandage[1];
                if(successTime == bandage[0]) {
                    successTime = 0;
                    answer += bandage[2];
                }
                answer = (answer >= health) ? health : answer;
            }
            time++;
        }
        return answer;
    }
}