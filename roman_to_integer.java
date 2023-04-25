class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int total = 0;
        int prevValue = 0;
        

        for(char c : s.toCharArray()) {
            int currentValue = romanToInt.get(c);

            if(currentValue > prevValue) {
              total += currentValue - 2 * prevValue;  
            }
            else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
     }
}
