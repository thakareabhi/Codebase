class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> s1=new HashSet<Character>();
        while(j<s.length()){
            if(s1.contains(s.charAt(j))){
                s1.remove(s.charAt(i));
                i++;
            }else{
                s1.add(s.charAt(j));
                max=Math.max(s1.size(),max);
                j++;
            }
        }
        return max;
    }
}