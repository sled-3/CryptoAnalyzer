package ru.javarush.mamikonyan.cryptoanalizer.controllers;

import ru.javarush.mamikonyan.cryptoanalizer.commands.BrutForce;
import ru.javarush.mamikonyan.cryptoanalizer.commands.Decoder;
import ru.javarush.mamikonyan.cryptoanalizer.commands.Encoder;
import ru.javarush.mamikonyan.cryptoanalizer.exceptions.ActionException;

public class MainController {

  public void doAction(String action, String[] parameters) {
    switch (action) {
      case "1" -> {
        Encoder encoder = new Encoder();
        encoder.execute(parameters);
      }
      case "2" -> {
        Decoder decoder = new Decoder();
        decoder.execute(parameters);
      }
      case "3" -> {
        BrutForce brutForce = new BrutForce();
        brutForce.execute(parameters);
      }
      default -> throw new ActionException("Выбрано неправильное действие");
    }
  }
}
