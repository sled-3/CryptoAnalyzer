package ru.javarush.mamikonyan.cryptoanalizer;

import java.util.Arrays;
import ru.javarush.mamikonyan.cryptoanalizer.controllers.MainController;
import ru.javarush.mamikonyan.cryptoanalizer.exceptions.AppException;

public class Application {

  private final MainController mainController;

  public Application() {
    mainController = new MainController();
  }

  public void run(String[] args) {
    if (args.length > 0) {
      String action = args[0];
      String[] parameters = Arrays.copyOfRange(args, 1, args.length);
      mainController.doAction(action, parameters);
    } else {
      throw new AppException("Неправильное количество переданных параметров");
    }
  }
}
