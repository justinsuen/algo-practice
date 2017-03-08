def is_permutation(s1, s2)
  return false if s1.length != s2.length
  hash = Hash.new(0)

  s1.each_char { |c| hash[c] += 1 }
  s2.each_char { |c| hash[c] -= 1 }

  hash.each { |_,v| return false if v != 0 }
  true
end

puts is_permutation("string", "trngis") # => true
puts is_permutation("a", "abc") # => false
puts is_permutation("abb", "aab") # => false
