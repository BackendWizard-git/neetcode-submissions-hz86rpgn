class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> hashMap=new HashMap<>();
       int[]arr=new int[k];
       for(int i=0;i<nums.length;i++){
        hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
       }
       List<Map.Entry<Integer,Integer>> list=new ArrayList<>(hashMap.entrySet());
       list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
       List<Integer> topkList=new ArrayList<>();
       for(int i=0;i<Math.min(k,list.size());i++){
        topkList.add(list.get(i).getKey());
       }
       for(int l=0;l<k;l++){
        arr[l]=topkList.get(l);
       }
 return arr;
    }
}
