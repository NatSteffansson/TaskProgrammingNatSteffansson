import java.util.HashMap;
import java.util.Map;

public class MorseConverter {
    private Map<Character, String> englishMorse;
    private Map<String, Character> morseEnglish;

    public MorseConverter() {
        englishMorse = new HashMap<>();
        englishMorse.put('A', "*-");
        englishMorse.put('B', "-***");
        englishMorse.put('C', "-*-*");
        englishMorse.put('D', "-**");
        englishMorse.put('E', "*");
        englishMorse.put('F', "**-*");
        englishMorse.put('G', "--*");
        englishMorse.put('H', "****");
        englishMorse.put('I', "**");
        englishMorse.put('J', "*---");
        englishMorse.put('K', "-*-");
        englishMorse.put('L', "*-**");
        englishMorse.put('M', "--");
        englishMorse.put('N', "-*");
        englishMorse.put('O', "---");
        englishMorse.put('P', "*--*");
        englishMorse.put('Q', "--*-");
        englishMorse.put('R', "*-*");
        englishMorse.put('S', "***");
        englishMorse.put('T', "-");
        englishMorse.put('U', "**-");
        englishMorse.put('V', "***-");
        englishMorse.put('W', "*--");
        englishMorse.put('X', "-**-");
        englishMorse.put('Y', "-*--");
        englishMorse.put('Z', "--**");
        englishMorse.put('1', "*----");
        englishMorse.put('2', "**---");
        englishMorse.put('3', "***--");
        englishMorse.put('4', "****-");
        englishMorse.put('5', "*****");
        englishMorse.put('6', "-****");
        englishMorse.put('7', "--***");
        englishMorse.put('8', "---**");
        englishMorse.put('9', "----*");
        englishMorse.put('0', "-----");
        englishMorse.put('.', "*-*-*-");
        englishMorse.put(',', "--**--");
        englishMorse.put('?', "**--**");
        morseEnglish = new HashMap<>();
        for (Character key : englishMorse.keySet()) {
            morseEnglish.put(englishMorse.get(key), key);
        }
    }

    public String convertToMorseCode(String input) {
        String morseCode = "";
        String[] words = input.toUpperCase().split("\\s+");
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (englishMorse.containsKey(letter)) {
                    morseCode += englishMorse.get(letter) + " ";
                }
            }
            morseCode += " ";
        }
        return morseCode.trim();
    }

    public String convertToEnglish(String input) {
        String englishWord = "";
        Character englishLetter = ' ';
        String[] morseCodeWords = input.split("\\s{2}");
        for (String morseCodeWord : morseCodeWords) {
            String[] morseCodeLetters = morseCodeWord.split(" ");
            for (String morseCodeLetter : morseCodeLetters) {
                if (morseEnglish.containsKey(morseCodeLetter)) {
                    englishLetter = morseEnglish.get(morseCodeLetter);
                }
                englishWord += englishLetter.toString();
            }
            englishWord+=" ";

        }return englishWord.toLowerCase().trim();
    }
}
