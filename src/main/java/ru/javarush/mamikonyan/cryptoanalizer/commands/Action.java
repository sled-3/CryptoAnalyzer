package ru.javarush.mamikonyan.cryptoanalizer.commands;

import ru.javarush.mamikonyan.cryptoanalizer.entity.Result;

public interface Action {
  Result execute(String[] parameters);
}
