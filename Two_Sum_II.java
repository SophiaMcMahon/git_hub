class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer_a = 0;
        int pointer_b = numbers.length - 1;

        while(pointer_a <= pointer_b) {
            int sum = numbers[pointer_a] + numbers[pointer_b]; 
        if(sum > target) {
            pointer_b -= 1;
        } else if (sum < target) {
            pointer_a += 1;
        } else {
            return new int[] {pointer_a + 1 , pointer_b + 1}; 
        }
        }
        return new int[] {pointer_a + 1 , pointer_b + 1}; 
    }
}
