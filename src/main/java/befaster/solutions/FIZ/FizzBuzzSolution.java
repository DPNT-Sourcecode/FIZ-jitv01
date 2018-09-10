package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    //method that returns a message depending on the input number

    public String fizzBuzz(Integer number) {

        String stringRepresentation = String.valueOf(number);

        //CASE deluxe when number is greater than 10 ad all the digits are identical

        //CASE (number % 3 == 0 OR number contains 3) AND (number % 5 == 0 OR number contains 5)
        if (((number % 3 == 0) || (stringRepresentation.contains("3"))) && ((number % 5 == 0) || (stringRepresentation.contains("5"))))
            return "fizz buzz";

        //CASE number % 3 == 0 OR numbber contains 3
        if ((number % 3 == 0) || (stringRepresentation.contains("3")))
            return "fizz";

        //CASE number % 5 == 0 numbber contains 3
        if (number % 5 == 0 || stringRepresentation.contains("5"))
            return "buzz";

        //number is not divisible by neither 3 or 5
        return String.valueOf(number);

    }

    public boolean numberIsDeluxe(Integer number) {
        String stringRepresentation = String.valueOf(number);

        boolean hasTheSameDigits = true;

        for (int i =0; i < stringRepresentation.length(); i ++) {
            if (stringRepresentation.charAt(i) != stringRepresentation.charAt(0))
                return false;
        }

        if (number > 10)
            return true;

        return false;
    }

}
