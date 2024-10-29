import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        boolean isHead = false;
        int heartRow = 0;
        int heartCol = 0;
        int leftArm = 0;
        int rightArm = 0;
        int waist = 0;
        int leftLeg = 0;
        int rightLeg = 0;
        
        for(int i = 1; i <= N; i++) {
            String s = sc.nextLine();
            if(s.contains("*") && !isHead) {
                isHead = true;
                heartRow = i+1;
                heartCol = s.indexOf("*")+1;
            }
            else if(s.contains("*")) {
                if(i == heartRow) {
                    leftArm = s.substring(s.indexOf("*"), heartCol-1).length();
                    s = s.substring(heartCol);
                    rightArm = s.contains("_") ? s.substring(0, s.indexOf("_")).length() : s.length();
                }
                else if(i > heartRow && s.indexOf("*") == heartCol-1) waist++;
                else {
                    if(s.indexOf("*") < heartCol-1) {
                        leftLeg++;
                        s = s.substring(heartCol);
                    }
                    if(s.contains("*")) rightLeg++;
                }
            }
        }
        System.out.println(heartRow+" "+heartCol);
        System.out.println(leftArm+" "+rightArm+" "+waist+" "+leftLeg+" "+rightLeg);
    }
}
