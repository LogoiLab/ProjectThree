package pkg;

public class OutputBuffer{
  private static final OutputBuffer instance = new OutputBuffer();
  private static String output = "";

  //private constructor to avoid client applications to use constructor
  private OutputBuffer(){}

  public static synchronized OutputBuffer getInstance(){
    return instance;
  }

  public static void add(String str) {
    if (output.equals("")) {
      output = str;
    } else {
      output = output + "\n" + str;
    }
  }

  public static String getOutput() {
    String out = output;
    output = "";
    return out;
  }

  public static void clear() {
    output = "";
  }
}