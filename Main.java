class Main {
  public static void main(String[] args) {
    String string = "I am a String. I am";
    String newString = string.replaceAll("I", "you");
    System.out.println(string);
    System.out.println(newString);
    String newString1 = newString.replaceAll("am", "are");
    System.out.println(newString1);

    //Using the wildcard character '.'
    System.out.println("Using the wildcard character '.' ");
    System.out.println(string.replaceAll(".am", "are"));
    System.out.println(string.replaceAll(".", "*"));
  }
}