class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String,List<String>> hashMap=new HashMap<>();
      List<List<String>> resultSet=new ArrayList<>();
      for(String str:strs){
        char[]cc=str.toCharArray();
        Arrays.sort(cc);
        String sortedString=new String(cc);
        hashMap.putIfAbsent(sortedString, new ArrayList<>());
        hashMap.get(sortedString).add(str);
      }
      resultSet.addAll(hashMap.values());
      return resultSet;
    }
}
