package whiteboard21;

import java.util.HashSet;

public class RepeatedWord {
    public static String repeatedWord (String input) {
        HashSet<String> words = new HashSet<>();
        String[] wordsArr = input.toLowerCase().split(" ");

        String repeatedWord = null;

        for (String word : wordsArr) {
            if (!words.contains(wordsArr[Integer.parseInt(word)])) {
                words.add(wordsArr[Integer.parseInt(word)]);
            } else {
                repeatedWord = wordsArr[Integer.parseInt(word)];
                return repeatedWord;
            }
        }
        return repeatedWord;
    }
}
