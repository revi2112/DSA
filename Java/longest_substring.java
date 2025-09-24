class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*

        with out dups each char occurs only once

        brute 

        iterate for each char from its next and break when same char occurs 

        two pointer approch // have a hash map to store the index of the charecer to figure out the length
        two pointer a and b, b will keep moving 

        */

        HashSet<Character> hset = new HashSet<>();
        int left = 0;
        int res = 0; 

        for(int right = 0; right<s.length(); right++){

            // char is dup
            // update window and check window
            while(hset.contains(s.charAt(right))){
                // update window and remove dup element
                hset.remove(s.charAt(left));
                left+=1;
            }
            
            hset.add(s.charAt(right));
            res = Math.max(res, right-left+1);
        }

        return res;

    }
}