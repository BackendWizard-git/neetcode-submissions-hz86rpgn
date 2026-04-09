class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> intList=new ArrayList<>();
        List<Integer> resultSet=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();  
        int[] arr = new int[k];
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        List<Integer> top2Keys = new ArrayList<>();

for (int i = 0; i < Math.min(k, list.size()); i++) {
    top2Keys.add(list.get(i).getKey());
}
 for(int l=0;l<k;l++){
    arr[l]=top2Keys.get(l);
 }
 return arr;
    }
}
