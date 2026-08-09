class Solution:
    def validPalindrome(self, s: str) -> bool:
     
        
        def check(l,r) :   
            while l<r:
                if s[l]!=s[r]:
                    return False
                l=l+1
                r=r-1

            return True
        
        left =0
        right=len(s)-1

        while left < right:
            if s[left]==s[right]:
                left+=1
                right-=1
            else:
                return check(left+1,right) or check(left,right-1)
        return True            
    




        