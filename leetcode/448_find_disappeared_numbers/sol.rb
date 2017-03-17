def find_disappeared_numbers(nums)
  res = []

  nums.each do |num|
    index = num.abs - 1
    nums[index] = -(nums[index].abs)
  end

  nums.each_with_index { |num, i| res << i+1 if num > 0 }
  res
end

puts find_disappeared_numbers([4,3,2,7,8,2,3,1]) #=> [5,6]
