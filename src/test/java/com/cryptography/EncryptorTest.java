package com.cryptography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptorTest {

    @Test
    public void testSingleWordFiveLetters() {
        assertEquals("72olle", Encryptor.encryptThis("Hello"), "Test for a single word with five letters.");
    }

    @Test
    public void testSingleWordFourLetters() {
        assertEquals("103doo", Encryptor.encryptThis("good"), "Test for a single word with four letters.");
    }

    @Test
    public void testMultipleWords() {
        assertEquals("104olle 119drlo", Encryptor.encryptThis("hello world"), "Test for a message with multiple words.");
    }

    @Test
    public void testSingleLetterWord() {
        assertEquals("72", Encryptor.encryptThis("H"), "Test for a single letter word.");
    }

    @Test
    public void testTwoLetterWord() {
        assertEquals("72H", Encryptor.encryptThis("HH"), "Test for a two-letter word.");
    }

    @Test
    public void testEmptyMessage() {
        assertEquals("", Encryptor.encryptThis(""), "Test for an empty message.");
    }

    @Test
    public void testMessageWithMultipleSpaces() {
        assertEquals("72olle  119drlo", Encryptor.encryptThis("Hello  world"), "Test for a message with multiple spaces between words.");
    }

    @Test
    public void testWordWithSpecialCharacters() {
        assertEquals("33dorlw", Encryptor.encryptThis("!world"), "Test for a word starting with a special character.");
        assertEquals("119!rldo", Encryptor.encryptThis("world!"), "Test for a word ending with a special character.");
    }

    @Test
    public void testMessageWithNumbers() {
        assertEquals("49eno 51 5244", Encryptor.encryptThis("1one 3 444"), "Test for a message containing numbers.");
    }

    @Test
    public void testWordWithMixedCasing() {
        assertEquals("72oLLe", Encryptor.encryptThis("HeLLo"), "Test for word with mixed casing.");
    }

    @Test
    public void testWordWithOnlyTwoCharacters() {
        assertEquals("97z", Encryptor.encryptThis("az"), "Test for a word with only two characters.");
    }

    @Test
    public void testLongWord() {
        assertEquals("99yyptographr", Encryptor.encryptThis("cryptography"), "Test for a longer word.");
    }

    @Test
    public void testFullSentence() {
        String expected = "84sih 105s 97n 101eamplx 115entence";
        String actual = Encryptor.encryptThis("This is an example sentence");
        assertEquals(expected, actual, "Test for a full sentence.");
    }
}
