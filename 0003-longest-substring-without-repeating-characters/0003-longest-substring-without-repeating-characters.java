class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0, ans=0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                ans = Math.max(set.size(), ans);
                while(set.contains(c)){
                set.remove(s.charAt(j));
                j++;
                }
            }
            set.add(c);
        }
        if(set.size()>ans) return set.size();
        else return ans;
    }
}