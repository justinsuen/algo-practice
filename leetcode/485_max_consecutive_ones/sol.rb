def find_max_consecutive_ones(nums)
  max_ones = 0
  curr = 0

  nums.each do |num|
    if num == 1
      curr += 1
      max_ones = curr if curr > max_ones
    else
      curr = 0
    end
  end

  max_ones
end
