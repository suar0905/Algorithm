import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0; // 나머지 합
        
        if(n <= 100000000) { // 100,000,000 이하의 자연수
            while (n > 0) {
                sum = n % 10;
                answer += sum;
                n = n / 10;
            }
        }

        return answer;
    }
}