class Solution(object):
    def isPalindrome(self, s):
        s = s.lower()
        s = ''.join(ch for ch in s if ch.isalnum())  
        return s == s[::-1]
   