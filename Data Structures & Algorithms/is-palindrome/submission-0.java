class Solution {
    public boolean isPalindrome(String s) {
        String replacedString=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverseString=new StringBuilder(replacedString).reverse().toString();
        return reverseString.equals(replacedString);
    }
}
