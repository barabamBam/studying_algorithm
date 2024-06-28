import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        // friends의 검색을 용이하기 위해 리스트 이용
        List<String> friendsList = new ArrayList<>();
        friendsList = Arrays.asList(friends);
        
        // 주고 받은 선물의 개수를 확인하기 위한 배열
        int[][] thisGifts = new int[friendsList.size()][friendsList.size()+1];
        
        // 주고 받은 선물의 개수 확인
        for(String gift : gifts){
            String[] name = gift.split(" ");
            int give = friendsList.indexOf(name[0]);
            int take = friendsList.indexOf(name[1]);
            thisGifts[give][take]++;
            thisGifts[give][friendsList.size()]++;
            thisGifts[take][friendsList.size()]--;
        }
        
        // 다음 달 선물 받을 거 확인
        int[] nextGifts = new int[friendsList.size()];
        for(int i = 0; i < friendsList.size(); i++){
            for(int j = i+1; j < friendsList.size(); j++){
                if(thisGifts[i][j] == thisGifts[j][i] || (thisGifts[i][j] == 0 && thisGifts[j][i] == 0)){
                    if(thisGifts[i][friendsList.size()] > thisGifts[j][friendsList.size()]) 
                        nextGifts[i]++;
                    else if(thisGifts[i][friendsList.size()] < thisGifts[j][friendsList.size()]) 
                        nextGifts[j]++;
                }
                else if(thisGifts[i][j] > thisGifts[j][i]){
                    nextGifts[i]++;
                }
                else {
                    nextGifts[j]++;
                }
            }
            answer = Math.max(answer, nextGifts[i]);
        }
        return answer;
    }
}