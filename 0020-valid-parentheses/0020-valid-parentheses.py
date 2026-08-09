class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mp = {')': '(', '}': '{', ']': '['}

        for ch in s:
            if ch in mp.values():  
                stack.append(ch)
            else:
                if not stack or stack[-1] != mp[ch]:
                    return False
                stack.pop()

        return stack == []


