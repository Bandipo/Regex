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


    //Using The Caret character '^'
    System.out.println();
    System.out.println("Using the Caret");
    System.out.println(string.replaceAll("^I am"," You are "));
// to match from beginnning to the end use Caret and Dollar sign '$''

    System.out.println(string.replaceAll("^I am$","You are"));

    //use String.matches(regex) to check if the String contains a regex
    
    System.out.println(string.matches("I am"));

    // Using Square bracket


  }
}