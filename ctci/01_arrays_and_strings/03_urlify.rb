def urlify(s, s_length)
  s = s.split(" ")
  s.join("%20")
end

puts urlify("Mr John Smith    ", 13)
