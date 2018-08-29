package whiteboard23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftJoin {

    public static Map<String, List<Object>> mergeMaps (Map<String, String> firstMap, Map<String, String>  secondMap) {
//        firstMap = new HashMap<>();
//        secondMap = new HashMap<>();

        Map<String, List<Object>> joinedMap = new HashMap<>();


        for (String oo : firstMap.keySet()) {
            List<Object> bothValues = new ArrayList<>();

                bothValues.add(firstMap.get(oo));
                bothValues.add(secondMap.get(oo));

                joinedMap.put(oo, bothValues);

        }
        return joinedMap;
    }


}
