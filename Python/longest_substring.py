class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        """
        approch :
        sliding window  have two pointer to indicate starting and ending of the substring.
        a dict to start the charecter and index of it as we iterate through the string

        """

        last_seen = set()
        left =0 # starting of the substring
        res = 0

        for right, char in enumerate(s):
            while char in last_seen:
                # we found an occurence so we can move on next window 
                # remove/update the begining of the window 
                # while loop to check the rest the current window
                last_seen.remove(s[left])
                left += 1
            #new char caluclate length
            last_seen.add(char)
            res = max(res, right-left+1)
            
        return res

        