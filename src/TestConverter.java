import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter {
    @Test
    public void testEtoMorse() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "E";
        String expected = "*";
        String actual = morseConverter.convertToMorseCode(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testLowerCaseToMorse() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "l";
        String expected = "*-**";
        String actual = morseConverter.convertToMorseCode(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToMorseGapBtw() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "HI";
        String expected = "**** **";
        String actual = morseConverter.convertToMorseCode(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToMorseGapBtwWords() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "HI THERE";
        String expected = "**** **  - **** * *-* *";
        String actual = morseConverter.convertToMorseCode(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToMorseToUpperCase() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "hi there";
        String expected = "**** **  - **** * *-* *";
        String actual = morseConverter.convertToMorseCode(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToMorseLetterNumber() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "hi number 1";
        String expected = "**** **  -* **- -- -*** * *-*  *----";
        String actual = morseConverter.convertToMorseCode(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToMorseException() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "äää";
        String expected = "";
        String actual = morseConverter.convertToMorseCode(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToEnglishToLowerCase() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "*-";
        String expected = "a";
        String actual = morseConverter.convertToEnglish(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToEnglishLettersWithoutGap() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "**** **";
        String expected = "hi";
        String actual = morseConverter.convertToEnglish(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToEnglishWordsWithGapBtw() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "**** **  - **** * *-* *";
        String expected = "hi there";
        String actual = morseConverter.convertToEnglish(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToEnglishWithNumber() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "**** **  - **** * *-* *  *****";
        String expected = "hi there 5";
        String actual = morseConverter.convertToEnglish(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToEnglishWithNumberSymbol() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "**** **  -* **- -- -*** * *-*  *---- *-*-*-";
        String expected = "hi number 1.";
        String actual = morseConverter.convertToEnglish(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testToEnglishException() {
        MorseConverter morseConverter = new MorseConverter();
        String testData = "> !";
        String expected = "";
        String actual = morseConverter.convertToEnglish(testData);
        assertEquals(expected, actual);
    }
}
