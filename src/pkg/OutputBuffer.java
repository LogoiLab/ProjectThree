package pkg;

public class OutputBuffer{
  private static final OutputBuffer instance = new OutputBuffer();

  //private constructor to avoid client applications to use constructor
  private OutputBuffer(){}

  public static OutputBuffer getInstance(){
    return instance;
  }
}