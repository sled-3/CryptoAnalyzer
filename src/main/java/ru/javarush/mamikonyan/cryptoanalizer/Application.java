package ru.javarush.mamikonyan.cryptoanalizer;

import java.util.Arrays;
import ru.javarush.mamikonyan.cryptoanalizer.controllers.MainController;
import ru.javarush.mamikonyan.cryptoanalizer.entity.Result;
import ru.javarush.mamikonyan.cryptoanalizer.exceptions.AppException;

public class Application {

  private MainController mainController;

  public Application() {
    mainController = new MainController();
  }

  public Result run(String[] args) {
    if (args.length > 0) {
      String action = args[0];
      String[] parameters = Arrays.copyOfRange(args, 1 , args.length);
      return mainController.doAction(action, parameters);
    }
     else throw new AppException();

  }
}
