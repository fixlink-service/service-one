public class User {
  private String name;

  public String getNameUpperCase(){
    return name.toUpperCase(); // NPE bug
  }
}
