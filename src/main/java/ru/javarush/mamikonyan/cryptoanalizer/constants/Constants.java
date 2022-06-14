package ru.javarush.mamikonyan.cryptoanalizer.constants;

public class Constants {

  private static final String RUS = "ёйцукенгшщзхъфывапролджэячсмитьбю";
  private static final String PUNCTUATION = " .,:;!?-—";
  public static final String ALPHABET = RUS + RUS.toUpperCase() + PUNCTUATION;
}
