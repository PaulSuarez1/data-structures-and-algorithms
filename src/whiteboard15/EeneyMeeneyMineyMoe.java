package whiteboard15;

import java.util.Queue;

public class EeneyMeeneyMineyMoe {

    public static String EenyMeenyMineyMoe (Queue<String> listyboi, int input){

        int count = input;
        while (listyboi.size() > 1) {
            for (int total = 0; total < count; total++) {
                String player = listyboi.remove();
                listyboi.add(player);
            }
            String loser = listyboi.remove();
        }
        String winner = listyboi.remove();
        System.out.println(winner);
        return winner;
    }

}
