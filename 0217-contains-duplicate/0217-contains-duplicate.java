class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> newset=new HashSet<>();
        for(int i:nums){
        /*{
           if(newset.contains(i))
            {
                return true;
            }
            newset.add(i);
        }
        return false;*/
        newset.add(i);
        }
        return newset.size()<nums.length;
    }
}