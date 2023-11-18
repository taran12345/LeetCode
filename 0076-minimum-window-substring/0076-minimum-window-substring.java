class Solution {
    public String minWindow(String str, String pattern) {
    Map<Character, Integer> charCounts = new HashMap<Character, Integer>();


   for (int i = 0; i < pattern.length(); i++) {
       charCounts.put(pattern.charAt(i), charCounts.getOrDefault(pattern.charAt(i), 0) + 1);
   }


   int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE;
   int count = charCounts.size(); //


   while (end < str.length()) {
       char endChar = str.charAt(end);
       if (charCounts.containsKey(endChar)) {
           charCounts.put(endChar, charCounts.get(endChar) - 1);
           if (charCounts.get(endChar) == 0) {  
               count--;           		  	       
           }   						                    	
       }							  
       end++;

       while (count == 0) {
           if (end - start < minLen) {
               minStart = start;
               minLen = end - start;
           }


           char startChar = str.charAt(start);
           if (charCounts.containsKey(startChar)) { 
               charCounts.put(startChar, charCounts.get(startChar) + 1);
               if (charCounts.get(startChar) > 0) {	
                   count++;
               }
           }
           start++;
       }
      
   }
   String s = minLen == Integer.MAX_VALUE ? "" : str.substring(minStart, minStart + minLen);
   return s;
    }
}