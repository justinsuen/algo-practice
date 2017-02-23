def find_words(words)
  letter_dict = {
    q: 0, w: 0, e: 0, r: 0, t: 0, y: 0, u: 0, i: 0, o: 0, p: 0,
    a: 1, s: 1, d: 1, f: 1, g: 1, h: 1, j: 1, k: 1, l: 1,
    z: 2, x: 2, c: 2, v: 2, b: 2, n: 2, m: 2
  }

  res = []

  words.each do |word|
    letters = word.downcase.split("")
    f = letter_dict[letters.first.to_sym]

    letters.each_with_index do |l, i|
      break unless letter_dict[l.to_sym] == f
      res << word if letters.length - 1 == i
    end
  end

  res
end

# Test
print find_words(["Hello", "Alaska", "Dad", "Peace"]) # => ["Alaska", "Dad"]
