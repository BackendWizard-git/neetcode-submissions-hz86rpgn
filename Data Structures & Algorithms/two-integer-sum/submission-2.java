class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> intList=new ArrayList<>();
        int[]resultArray=new int[2];
        for(int i=0;i<nums.length;i++){
                intList.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(intList.contains(complement)){
               int index1=i;
               int index2=intList.indexOf(complement);
                if(index1==index2){
                    index2=intList.lastIndexOf(complement);
                }
              if (index1 != index2) {
                    resultArray[0] = index1;
                    resultArray[1] = index2;
                    break;
            }
        }
        }
        return resultArray;
    }
}
