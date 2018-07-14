package whiteboard5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricTest {

    @Test
    void rotateTest() {
        int[][] aa = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        int result = Matrix.Matrix(aa);

        int[][] expected = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        assertEquals(expected, result);
    }

}