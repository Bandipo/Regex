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
     System.out.println("-".repeat(40));
    System.out.println(newString1);
// all occurences of 'a' is replaced with '*'
    System.out.println(newString1.replaceAll("[a]","*"));
    // all occurences of 'a' followed by 'r' . dont add space between [a] and [r]
    System.out.println(newString1.replaceAll("[a][r]", "*"));

    // more on boundary replacement
    // replace a word whether is starts with Upper or Lower case

    String sentence = "We are Decadevs";
    System.out.println(sentence.replaceAll("[Dd]ecadevs", "decadevs"));

    //

    //replace every occurences of 'e' in the string with '*'
    System.out.println(sentence.replaceAll("[e]", "*"));
    // Making your own character classes

    String alphanumeric = "abcdefg123456ABCDEFG8910";
    System.out.println(alphanumeric);
    System.out.println(alphanumeric.replaceAll("[abcABC123]","*"));
    // or you could do

    System.out.println(alphanumeric.replaceAll("[a-cA-B1-3]", "+"));

    // do the samething for a-c and 1-3, only ignore case

    System.out.println(alphanumeric.replaceAll("(?i)[a-c]", "*"));

    System.out.println("-".repeat(40));
     //Repalce all digits in alphanumeric with '*' using \\d
    System.out.println("Replacing all digits in "+alphanumeric);
    System.out.println(alphanumeric.replaceAll("\\d","*"));
    //replace all non Digits
    System.out.println("Replacing all non-digits in "+alphanumeric);
    System.out.println(alphanumeric.replaceAll("\\D","*"));

  }
}