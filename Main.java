public class Main {
  public static void main(String[] args) {
    String[] dogs = { "beagle", "bulldog", "dachshund", "italian greyhound", "pug", "shiba inu", "siberian husky",
        "german shorthaired pointer", "chocolate Retriever", "dalmatian" };

    for (int i = 0; i < 9; i++) {
      System.out.println(dogs[i]);
    }

    dogs[7] = "siberian husky";

    System.out.println(" \n here is my updated dog array \n");

    for (int i = 1; i < 10; i++) {
      System.out.println(dogs[6]);
    }
  }
}