package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    //method that returns a message depending on the input number

    public String fizzBuzz(Integer number) {

        String stringRepresentation = String.valueOf(number);

        //CASE: fizz buzz deluxe
        if (numberIsFizz(number, stringRepresentation) && numberIsBuzz(number, stringRepresentation) && numberIsDeluxe(number, stringRepresentation))
            return "fizz buzz deluxe";

        //CASE: fizz buzz
        if (numberIsFizz(number, stringRepresentation) && numberIsBuzz(number, stringRepresentation))
            return "fizz buzz";

        //CASE: fizz
        if (numberIsFizz(number, stringRepresentation))
            return "fizz";

        //CASE: buzz
        if (numberIsBuzz(number, stringRepresentation))
            return "buzz";

        //CASE: none of the above
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
