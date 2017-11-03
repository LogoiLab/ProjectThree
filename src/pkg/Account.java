package pkg;

public interface Account {
  public int getPermLevel();
  public String getUserName();
  public void setUserName(String userName);
  public boolean checkHash();

}
