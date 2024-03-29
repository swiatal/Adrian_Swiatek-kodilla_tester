Feature:  Is it Fizz or Buzz?
  Scenario Outline: The number is or isn't divisible by three and five
    Given the number is <number>
    When I ask whether it's Fizz or Buzz
    Then I return <answer>
    Examples:
      | number | answer |
      | 0 | "FizzBuzz" |
      | 1 | "None" |
      | 2 | "None" |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 9 | "Fizz" |
      | 10 | "Buzz" |
      | 15 | "FizzBuzz" |
