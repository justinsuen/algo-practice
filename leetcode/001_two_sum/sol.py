def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """

    # Brute force
    # for i in range(0, len(nums)):
    #     for j in range(i+1, len(nums)):
    #         if nums[i] + nums[j] == target:
    #             return [i, j]

    # Hash Table
    my_dict = {}
    for i in range(0, len(nums)):
        if (target - nums[i]) in my_dict:
            if my_dict[target - nums[i]] != i or target - nums[i] != nums[i]:
                return [my_dict[target - nums[i]], i]
        my_dict[nums[i]] = i

print twoSum([3,2,4], 6)
print twoSum([3,3], 6)
