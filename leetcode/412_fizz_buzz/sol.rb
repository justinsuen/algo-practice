def fizz_buzz(n)
  res = []

  (1..n).each do |num|
    if num % 15 == 0
      res << "FizzBuzz"
    elsif num % 3 == 0
      res << "Fizz"
    elsif num % 5 == 0
      res << "Buzz"
    else
      res << "#{num}"
    end
  end

  res
end
