class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")

        ctw, wtc = {}, {}

        if len(pattern) != len(words):
            return False

        for char, word in zip(pattern, words):
            if char in ctw and ctw[char] != word:
                return False
            if word in wtc and wtc[word] != char:
                return False

            ctw[char] = word
            wtc[word] = char
        
        return True
            
