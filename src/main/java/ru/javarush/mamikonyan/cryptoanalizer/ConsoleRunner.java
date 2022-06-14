package ru.javarush.mamikonyan.cryptoanalizer;

import ru.javarush.mamikonyan.cryptoanalizer.entity.Result;

public class ConsoleRunner {

  public static void main(String[] args) {

    Application application = new Application();
    Result result = application.run(args);
  }
}
