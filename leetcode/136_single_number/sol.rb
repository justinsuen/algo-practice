def single_number(nums)
  # O(n) time and space
  # hash = Hash.new(0)
  # nums.each { |n| hash[n] += 1 }
  # hash.each { |k,v| return k if v == 1 }

  # O(n) time and O(1) space
  res = 0
  nums.each { |n| res = res^n }
  res
end

puts single_number([1,1,2,2,5])
