import java.util.Objects;

public class Employee {

  public int salary;
  private final String fullName;
  public int department;
  public int id;
  public static int count = 1;

  public Employee(int department, String fullName, int salary) {
    this.fullName = fullName;
    this.salary = salary;
    this.department = department;
    this.id = count++;
  }

  public String getFullName() {
    return fullName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getDepartment() {
    return department;
  }

  public void setDepartment(int department) {
    this.department = department;
  }

  public int getId() {
    return count;
  }

  public void setId(int id) {
    this.id = count;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "salary=" + salary +
        ", fullName='" + fullName + '\'' +
        ", department=" + department +
        ", id=" + id +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return salary == employee.salary && department == employee.department && id == employee.id
        && Objects.equals(fullName, employee.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salary, fullName, department, id);
  }
}


