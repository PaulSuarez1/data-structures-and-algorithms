package whiteboard15;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class EeneyMeeneyMineyMoeTest {

    @Test
    void eenyMeenyMineyMoe1() {
        Queue<String> test1 = new LinkedList<>();

        test1.add("player1");
        test1.add("player2");
        test1.add("player3");
        test1.add("player4");
        test1.add("player5");

        String expected = "player2";
        String result = EeneyMeeneyMineyMoe.EenyMeenyMineyMoe(test1, 4);

        assertEquals(expected, result);

    }

    @Test
    void eenyMeenyMineyMoe2() {
        Queue<String> test1 = new LinkedList<>();

        test1.add("player1");
        test1.add("player2");
        test1.add("player3");
        test1.add("player4");
        test1.add("player5");

        String expected = "player4";
        String result = EeneyMeeneyMineyMoe.EenyMeenyMineyMoe(test1, 2);

        assertEquals(expected, result);

    }

    @Test
    void eenyMeenyMineyMoe3() {
        Queue<String> test1 = new LinkedList<>();

        test1.add("player1");
        test1.add("player2");
        test1.add("player3");
        test1.add("player4");
        test1.add("player5");
        test1.add("player6");

        String expected = "player5";
        String result = EeneyMeeneyMineyMoe.EenyMeenyMineyMoe(test1, 6);

        assertEquals(expected, result);

    }

    @Test
    void eenyMeenyMineyMoe4() {
        Queue<String> test1 = new LinkedList<>();

        test1.add("player1");
        test1.add("player2");
        test1.add("player3");
        test1.add("player4");
        test1.add("player5");

        String expected = "player4";
        String result = EeneyMeeneyMineyMoe.EenyMeenyMineyMoe(test1, 5);

        assertEquals(expected, result);

    }
}