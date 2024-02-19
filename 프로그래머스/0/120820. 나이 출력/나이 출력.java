class Solution {
    public int solution(int age) {
        int answer = 0;
        int standard_year = 2022; // 기준 출생년도
        
        
        if(age > 0 && age <= 120) {
            answer = standard_year - age + 1;
        }
        
        return answer;
    }
}