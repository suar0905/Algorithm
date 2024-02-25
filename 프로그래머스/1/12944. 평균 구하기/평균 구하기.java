class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0; // 배열의 합
        
        if((1 <= arr.length && arr.length <= 100)) { // 길이 1 이상, 100 이하
            for(int i = 0; i < arr.length; i++) {
                if((-10000 <= arr[i]) && (arr[i] <= 10000)) { // 원소 -10000 이상 10000 이하
                    sum = sum + arr[i];   
                }   
            }
            
            answer = (double) sum / arr.length;
        }
        
        return answer;
    }
}