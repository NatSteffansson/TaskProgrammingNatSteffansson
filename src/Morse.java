import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        String input;
        MorseConverter morseConverter = new MorseConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to translate English, numbers, or symbols to Morse Code.");
        System.out.println("Enter 2 to translate Morse Code to English.");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    System.out.println("Enter English text, numbers, or symbols to translate to Morse Code: ");
                    input = scanner.nextLine();
                    String morseCode = morseConverter.convertToMorseCode(input);
                    if (morseCode.isEmpty()) {
                        System.out.println("Error. Invalid input. Try again.");
                    } else {
                        System.out.println("Your translation to Morse Code is: " + morseCode);
                    }
                    break;
                case 2:
                    System.out.println("Enter Morse Code to translate to English: ");
                    input = scanner.nextLine();
                    String convertedToEnglish = morseConverter.convertToEnglish(input);
                    if (convertedToEnglish.isEmpty()) {
                        System.out.println("Error. Invalid input. Try again.");
                    } else {
                        System.out.println("Your translation to English is: " + convertedToEnglish);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice. Please enter 1 or 2." + e.getMessage());
        }
    }
}
