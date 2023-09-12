package lesson006;

public class User {
  private Integer id;
  private String name;
  private String password;

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", password='" + password + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public Integer getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

  public User(Integer id, String name, String password) {
    this.id = id;
    this.name = name;
    this.password = password;
  }

    public void setId(int anInt) {
    }
}
