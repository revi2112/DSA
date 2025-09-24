def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        freq_dict = {}
        res = 0
        flag = False
        for i in s:
            freq_dict[i] = freq_dict.get(i,0) + 1 
        
        for value in freq_dict.values():
            if value%2 == 0:
                res+= value
            else: #odd
                falg = True
                res += value - 1 
        
        if flag:
            return res + 1

        return res