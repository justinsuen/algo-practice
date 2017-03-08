def is_perm_palin(s)
  h = Hash.new(0)
  s.downcase.each_char { |c| h[c] += 1 }

  odd_count = 0
  h.each do |k,v|
    next if k == " "
    odd_count += 1 if v % 2 == 1
    return false if odd_count > 1
  end
  true
end

puts is_perm_palin("Tact coa") # => true
puts is_perm_palin("poop  ") # => true
puts is_perm_palin("Mighty warrior") # => false
