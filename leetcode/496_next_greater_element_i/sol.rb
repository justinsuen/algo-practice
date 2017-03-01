def next_greater_element(find_nums, nums)
  my_dict = Hash.new
  nums.each_with_index do |el, i|
    if i == nums.length - 1
      my_dict[el] = -1
      break
    end

    j = i + 1

    while j <= nums.length - 1
      if nums[j] > el
        my_dict[el] = nums[j]
        break
      end

      my_dict[el] = -1 if j == nums.length - 1
      j += 1
    end
  end

  find_nums.map { |el| my_dict[el] }
end
