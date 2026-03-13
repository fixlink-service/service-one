public class User {
  private String name;

  public String getNameUpperCase(){
    return name == null? null: name.toUpperCase(); // NPE bug
  }
}
