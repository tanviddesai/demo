import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tanvi on 10/16/15.
 */
public class Test {
  public static void main(String[] args) {

    List<User> users =
        Lists.newArrayList(new User(1, "ABC"), new User(2, "PQR"), new User(3, "XYZ"));

    //for (User user : users) {
    //  if (user.getId() % 2 != 0) {
    //    System.out.println(user.getName());
    //  }
    //}

    System.out.println(
        users.stream().filter(u -> u.getId() % 2 != 0).map(User::getName).collect(
            Collectors.toList()));

    List<Employee> employees = Lists.newArrayList(
        new Employee(1, "tanvi", 1000), new Employee(2, "desai", 2000),
        new Employee(3, "Rohit", 4000));

    for (Employee employee : employees) {
      if (employee.getSalary() > 4000) {
        System.out.println(employee.getName());
      }
    }
  }
}

class User {
  private int id;
  private String name;

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Employee {
  private int id;
  private String name;
  private int salary;

  public Employee(int id, String name, int salary) {

    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
