package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    //Method that returns a message depending on the input number
    public String fizzBuzz(Integer number) {

        String stringRepresentation = String.valueOf(number);

        boolean isFakeDeluxe = numberIsFakeDeluxe(number, stringRepresentation);
        boolean isDeluxe = numberIsDeluxe(number, stringRepresentation);
        boolean isFizz = numberIsFizz(number, stringRepresentation);
        boolean isBuzz = numberIsBuzz(number, stringRepresentation);

        //CASE fizz buzz fake deluxe
        if (numberIsFizzBuzzFakeDeluxe(number, stringRepresentation))
            return "fizz buzz fake deluxe";

        //CASE: fizz buzz deluxe
        if (numberIsFizzBuzzDeluxe(number, stringRepresentation))
            return "fizz buzz deluxe";

        //CASE: fizz fake deluxe
        if (numberIsFizzDeluxe(number, stringRepresentation) && (number % 2 == 1))
            return "fizz fake deluxe";

        //CASE: fizz deluxe
        if (numberIsFizzDeluxe(number, stringRepresentation))
            return "fizz deluxe";

        //CASE: buzz fake deluxe
        if (numberIsBuzzDeluxe(number, stringRepresentation) && (number % 2 == 1))
            return "buzz fake deluxe";

        //CASE: buzz deluxe
        if (numberIsBuzzDeluxe(number, stringRepresentation))
            return "buzz deluxe";

        //CASE: fizz buzz
        if (numberIsFizz(number, stringRepresentation) && numberIsBuzz(number, stringRepresentation))
            return "fizz buzz";

        /*
        //CASE: fake deluxe
        if (isFakeDeluxe)
            return "fake deluxe";
            */

        /*
        //CASE: deluxe
        if (numberIsDeluxe(number, stringRepresentation))
            return "deluxe";
            */
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

    public boolean numberIsFakeDeluxe(Integer number, String stringRepresentation) {
        boolean isDeluxe = numberIsDeluxe(number, stringRepresentation);

        return (isDeluxe && (number % 2 == 1));
    }

    //A number is "fizz" if it is divisible by 3 or if it has a 3 in it
    public boolean numberIsFizz(Integer number, String stringRepresentation) {
        if ((number % 3 == 0) || (stringRepresentation.contains("3")))
            return true;
        return false;
    }

    public boolean numberIsFizzDeluxe(Integer number, String stringRepresentation) {
        if ((number % 3 == 0) && (stringRepresentation.contains("3")))
            return true;
        return false;
    }

    public boolean numberIsBuzzDeluxe(Integer number, String stringRepresentation) {
        if ((number % 5 == 0) && (stringRepresentation.contains("5")))
            return true;
        return false;
    }

    public boolean numberIsFizzBuzzFakeDeluxe(Integer number, String stringRepresentation) {
        boolean firstCase = numberIsFizzDeluxe(number, stringRepresentation) && (number % 5 == 0);
        boolean secondCase = numberIsBuzzDeluxe(number, stringRepresentation) && (number % 3 == 0);
        if ((firstCase || secondCase) && (number % 2 == 1))
            return true;
        return false;
    }

    public boolean numberIsFizzBuzzDeluxe(Integer number, String stringRepresentation) {
        boolean firstCase = numberIsFizzDeluxe(number, stringRepresentation) && (number % 5 == 0);
        boolean secondCase = numberIsBuzzDeluxe(number, stringRepresentation) && (number % 3 == 0);
        if ((firstCase || secondCase) && (number % 2 == 0))
            return true;
        return false;
    }

    //A number is "buzz" if it is divisible by 3 or if it has a 3 in it
    public boolean numberIsBuzz(Integer number, String stringRepresentation) {
        if ((number % 5 == 0) || (stringRepresentation.contains("5")))
            return true;
        return false;
    }

}
