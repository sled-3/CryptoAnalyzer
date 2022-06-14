package ru.javarush.mamikonyan.cryptoanalizer.commands;

import static ru.javarush.mamikonyan.cryptoanalizer.constants.Constants.ALPHABET;

public class Encoder implements Action {

  @Override
  public void execute(String[] parameters) {
    int key = Integer.parseInt(parameters[0]) % ALPHABET.length();
    String sourceFileName = parameters[1];
    String targetFileName = parameters[2];
    String shiftedAlphabet = ALPHABET.substring(ALPHABET.length() - key) + ALPHABET.substring(0, ALPHABET.length() - key);

    Decoder.codingText(sourceFileName, targetFileName, shiftedAlphabet);

  }
}
