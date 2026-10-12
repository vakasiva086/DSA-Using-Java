class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> newset=new HashSet<>();
        for(int i:nums){
        newset.add(i);
        }
        return newset.size()<nums.length;
    }
}