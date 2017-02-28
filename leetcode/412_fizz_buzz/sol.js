const fizzBuzz = n => {
  const res = [];

  let i = 1;
  while (i <= n) {
    if (i % 15 === 0) {
      res.push("FizzBuzz");
    } else if (i % 3 === 0) {
      res.push("Fizz");
    } else if (i % 5 === 0) {
      res.push("Buzz");
    } else {
      res.push(`${i}`);
    }
    i += 1;
  }

  return res;
};
