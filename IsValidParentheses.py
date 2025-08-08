class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        li=['{','[','('] 
        for i in s:
            if i in li:
                stack.append(i)
            else:
                if not stack:
                    return False
                popped= stack.pop()
                if popped=='(' and  i!=')':
                    return False
                if popped=='[' and i!=']':
                    return False
                if popped=='{' and i!='}':
                    return False
        if stack:
            return False
        return True
           
