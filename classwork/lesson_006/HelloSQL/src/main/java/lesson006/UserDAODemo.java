package lesson006;

import java.sql.SQLException;
import java.util.List;

public class UserDAODemo {

  public static void main(String[] args) throws SQLException {
    UserDAO userDAO = new UserDAO(MyDataSource.getDataSource());
    User user = userDAO.findById(1);
//    System.out.println(user);
    List<User> users = userDAO.findAll();
    System.out.println(users.size());
    userDAO.delete(1);
    users = userDAO.findAll();
    System.out.println(users.size());

    User user1 = userDAO.add(new User(138,"testUSer","qwert007"));
    System.out.println(user1);
    List<User> usersAfterAdd = userDAO.findAll();
    System.out.println(usersAfterAdd);
    System.out.println(users.size());
  }
}
