package whiteboard23;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinTest {

    @Test
    void mergeMapsTest1() {

        Map<String, String> firstMap = new HashMap<>();
        Map<String, String> secondMap = new HashMap<>();

        firstMap.put("1" , "a");
        firstMap.put("2" , "b");
        firstMap.put("3" , "c");
        firstMap.put("4" , "d");

        secondMap.put("1" , "A");
        secondMap.put("2" , "B");
        secondMap.put("3" , "C");
        secondMap.put("4" , "D");

        System.out.println(firstMap);
        System.out.println(secondMap);

        System.out.println(LeftJoin.mergeMaps(firstMap, secondMap));

        String expected = "{1=[a, A], 2=[b, B], 3=[c, C], 4=[d, D]}";
        String result = LeftJoin.mergeMaps(firstMap, secondMap).toString();

        assertEquals(expected, result);

    }

    @Test
    void mergeMapsTest2() {

        Map<String, String> firstMap = new HashMap<>();
        Map<String, String> secondMap = new HashMap<>();

        // test with uneven maps
        firstMap.put("1" , "a");
        firstMap.put("2" , "b");
        firstMap.put("3" , "c");
        firstMap.put("4" , "d");
        firstMap.put("5" , "5");

        secondMap.put("1" , "A");
        secondMap.put("2" , "B");
        secondMap.put("3" , "C");
        secondMap.put("4" , "D");


        System.out.println(firstMap);
        System.out.println(secondMap);

        System.out.println(LeftJoin.mergeMaps(firstMap, secondMap));
    }

    @Test
    void mergeMapsTest3() {

        Map<String, String> firstMap = new HashMap<>();
        Map<String, String> secondMap = new HashMap<>();

        firstMap.put("1" , "a");
        firstMap.put("2" , "b");
        firstMap.put("3" , "c");
        firstMap.put("4" , "d");
        firstMap.put("5" , "e");
        secondMap.put("6" , "f");

        secondMap.put("1" , "A");
        secondMap.put("2" , "B");
        secondMap.put("3" , "C");
        secondMap.put("4" , "D");
        secondMap.put("5" , "E");


        System.out.println(firstMap);
        System.out.println(secondMap);

        System.out.println(LeftJoin.mergeMaps(firstMap, secondMap));
    }


}