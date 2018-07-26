package whiteboard13;

import java.util.HashMap;
import java.util.Stack;

public class MultiBracketValidation {

    public static boolean charPairs(String input) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            System.out.println(currentChar);

            if (map.keySet().contains(currentChar)) {
                stack.push(currentChar);

            } else if (map.values().contains(currentChar)) {
                if (map.get(stack.peek()) == currentChar) {
                    stack.pop();

                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
