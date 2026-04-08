class Solution {
    public boolean isAnagram(String s, String t) {
       int length1=s.length();
       int length2=t.length();
       Map<Character,Integer>map=new HashMap<>();
       Map<Character,Integer> mapp=new HashMap<>();
       if(length1!=length2){
        return false;
       }else{
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
         for(char c:t.toCharArray()){
            mapp.put(c,mapp.getOrDefault(c,0)+1);
        }
       }
       if(map.equals(mapp)){
        return true;
       }
       else{
        return false;
       }
    }
}
