class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        brackets = {
            '(': ')',
            '[': ']',
            '{': '}'
        }
        for c in s:
            if c in brackets.keys():
                stack.append(c)
            if c in brackets.values():
                if len(stack) < 1 or brackets.get(stack.pop()) != c:
                    return False
        return len(stack) == 0
    