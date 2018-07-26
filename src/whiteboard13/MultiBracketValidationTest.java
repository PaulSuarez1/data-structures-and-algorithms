package whiteboard13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiBracketValidationTest {

    @Test
    void charPairs1() {
        //testing obvious true
        String input = "[{()}]";

        boolean expected = true;
        boolean result = MultiBracketValidation.charPairs(input);

        System.out.println("test 1 result " + MultiBracketValidation.charPairs(input));

        assertEquals(expected, result);

    }

    @Test
    void charPairs2() {
        // testing with letters
        String input = "[a{b(c)d}e]";

        boolean expected = true;
        boolean result = MultiBracketValidation.charPairs(input);

        System.out.println("test 2 result " + MultiBracketValidation.charPairs(input));

        assertEquals(expected, result);

    }

    @Test
    void charPairs3() {
        // testing with letters and extra )
        String input = "[a{b(c()))d}e]";

        boolean expected = false;
        boolean result = MultiBracketValidation.charPairs(input);

        System.out.println("test 3 result " + MultiBracketValidation.charPairs(input));

        assertEquals(expected, result);

    }

    @Test
    void charPairs4() {
        // testing with no brackets for the heck of it
        String input = "I love Java!";

        boolean expected = true;
        boolean result = MultiBracketValidation.charPairs(input);

        System.out.println("test 4 result " + MultiBracketValidation.charPairs(input));

        assertEquals(expected, result);

    }
}