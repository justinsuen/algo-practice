def reverse_string(s)
  # long way
  str_arr = s.split("")
  str_arr.each_index do |i|
    break if i >= str_arr.length / 2
    str_arr[i], str_arr[str_arr.length - i - 1] = str_arr[str_arr.length - i - 1], str_arr[i]
  end
  str_arr.join("")

  # cheat with reverse!
  # s.reverse!
end
