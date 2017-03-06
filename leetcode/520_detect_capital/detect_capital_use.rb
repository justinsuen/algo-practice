def detect_capital_use(word)
  # letters_ord = word.split("").map(&:ord)
  # return true if letters_ord.all? { |l| l < "a".ord }
  # return true if letters_ord.all? { |l| l >= "a".ord }
  # return true if letters_ord[0] < "a".ord &&
  #                letters_ord[1..-1].all? { |l| l >= "a".ord }
  # false

  word == word.upcase || word == word.downcase ||
  (word[0] == word[0].upcase && word[1..-1] == word[1..-1].downcase)
end

puts detect_capital_use("USA") # => true
puts detect_capital_use("FlaG") # => false
puts detect_capital_use("Google") # => true
puts detect_capital_use("leetcode") # => true
puts detect_capital_use("leEtcode") # => false
