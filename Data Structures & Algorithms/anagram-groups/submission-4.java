class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> resultSet=new ArrayList<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
           resultSet.addAll(map.values());
           return resultSet; 
    }
}
