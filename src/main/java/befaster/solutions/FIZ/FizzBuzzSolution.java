package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    //method that returns a message depending on the input number

    public String fizzBuzz(Integer number) {

        String stringRepresentation = String.valueOf(number);

        //CASE deluxe when number is greater than 10 ad all the digits are identical

        if (numberIsFizz(number, stringRepresentation) && numberIsBuzz(number, stringRepresentation) && numberIsDeluxe(number, stringRepresentation))
            return "fizz buzz deluxe";

        if (numberIsFizz(number, stringRepresentation) && numberIsBuzz(number, stringRepresentation))
            return "fizz buzz";

        if (numberIsFizz(number, stringRepresentation))
            return "fizz";

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

    //number is considered to be "deluxe" if it is greater than 10 and all the digits are identical
    public boolean numberIsDeluxe(Integer number, String stringRepresentation) {

        boolean hasTheSameDigits = true;

        for (int i =0; i < stringRepresentation.length(); i ++) {
            if (stringRepresentation.charAt(i) != stringRepresentation.charAt(0))
                return false;
        }

        if (number > 10)
            return true;

        return false;
    }

    //A number is "fizz" if it is divisible by 3 or if it has a 3 in it
    public boolean numberIsFizz(Integer number, String stringRepresentation) {
        if ((number % 3 == 0) || (stringRepresentation.contains("3")))
            return true;
        return false;
    }

    //A number is "buzz" if it is divisible by 3 or if it has a 3 in it
    public boolean numberIsBuzz(Integer number, String stringRepresentation) {
        if ((number % 3 == 0) || (stringRepresentation.contains("3")))
            return true;
        return false;
    }

}
