package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    //method that returns a message depending on the input number

    public String fizzBuzz(Integer number) {

        //CASE number % 3 == 0 AND number % 5 == 0
        if ((number % 3 == 0) && (number % 5 == 0))
            return "fizz buzz";

        //CASE number % 3 == 0
        if (number % 3 == 0)
            return "fizz";

        //CASE number % 5 == 0
        if (number % 5 == 0)
            return "buzz";

        //number is not divisible by neither 3 or 5
        return String.valueOf(number);

    }

}
