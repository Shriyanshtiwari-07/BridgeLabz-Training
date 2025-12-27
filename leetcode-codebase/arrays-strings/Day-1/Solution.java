class Solution {
    public int[] twoSum(int[] nums, int target) {

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
