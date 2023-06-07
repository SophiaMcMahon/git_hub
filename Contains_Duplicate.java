// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
class Solution {
	 public boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums); 
		 // Solving this problem using sorting yields for loglinear complexity.
	        for (int i = 0; i < nums.length - 1; i++) {
	                if (nums[i] == nums[i+1]) {
	                    return true;
	                }
	        }
	        return false;
	    }
}

// Another possible solution using HashSet. 
class Solution {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> numbers = new HashSet<>();
// O(n) space and time.
		for(int i = 0; i < nums.length; i++) {
			if(numbers.contains(nums[i])) return true;
			numbers.add(nums[i]);
		}
		return false;
}
 }
