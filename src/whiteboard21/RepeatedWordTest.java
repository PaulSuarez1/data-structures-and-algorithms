package whiteboard21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedWordTest {

    @Test
    void repeatedWord() {
        String input = "Once upon a time, there was a brave princess who...";
        String expected = "a";
        System.out.println(RepeatedWord.repeatedWord(input));
        String result = RepeatedWord.repeatedWord(input);

        assertEquals(expected, result);
    }
}