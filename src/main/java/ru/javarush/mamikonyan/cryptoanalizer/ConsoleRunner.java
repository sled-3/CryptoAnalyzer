package ru.javarush.mamikonyan.cryptoanalizer;

public class ConsoleRunner {

  public static void main(String[] args) {
    Application application = new Application();
    application.run(args);

//    String currentDirectory =  System.getProperty("user.dir");
//    String sourceFileName = currentDirectory + "\\source.txt";
//    String targetFileName = currentDirectory + "\\target.txt";
//    int key = 5 % ALPHABET.length();
//    String shiftedAlphabet1 = ALPHABET.substring(key) + ALPHABET.substring(0, key) ;
//    String shiftedAlphabet2 = ALPHABET.substring(ALPHABET.length() - key) + ALPHABET.substring(0, ALPHABET.length() - key);
//
//    try (BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
//        FileWriter fileWriter = new FileWriter(targetFileName)) {
//      while (br.ready()) {
//        String line = br.readLine();
//        for (int i = 0; i < line.length(); i++) {
//          char curr = line.charAt(i);
//          char currShifted = ALPHABET.charAt(shiftedAlphabet2.indexOf(curr));
//          fileWriter.write(currShifted);
//        }
//        fileWriter.write('\n');
//      }
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }

  }
}

