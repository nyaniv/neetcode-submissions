class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        result = result.toLowerCase();
        int k = result.length() - 1;
        for (int i = 0; i < result.length(); i++){
            if(result.charAt(i) != result.charAt(k)){
                return false;
            }
            k--;
        }
        return true;
    }
}
