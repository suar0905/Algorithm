class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        double calculate_value = 0; // 매개변수1,2 나눈 값
        
        if((num1 > 0 && num2 > 0) && (num1 <= 100 && num2 <= 100)) {
            calculate_value = (double) num1 / num2;
            answer = calculate_value * 1000;
        }
        
        return (int) answer;
    }
}