class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> ints=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ints.add(nums[i]);
        }
    Set<Integer> sett=new HashSet<>(ints);
    if(sett.size()!=ints.size()){
        return true;
    }else{
        return false;
    }
    }
}