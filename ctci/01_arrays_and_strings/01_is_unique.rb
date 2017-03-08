def is_unique(s)
  # O(n) time and O(1) space
  hash = Hash.new(0)
  s.each_char do |c|
    hash[c] += 1
    return false if hash[c] > 1
  end
  true

  # O(nlogn) time and O(1) space
  # s = s.chars.sort.join
  # s.chars.each_with_index do |c, idx|
  #   next if idx == 0
  #   return false if c == s[idx - 1]
  # end
  # true
end

puts is_unique("string") # => true
puts is_unique("hippo") # => false
