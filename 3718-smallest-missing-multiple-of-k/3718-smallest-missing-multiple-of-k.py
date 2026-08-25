class Solution(object):
    def missingMultiple(self, nums, k):
        for i in range(1,102):
            if(k*i not in nums):
                 return k*i

        