public class EmployeeBook {

  private final Employee[] employees = new Employee[10];

  public void printEmployees() {
    for (Employee employee : employees) {
      System.out.println("employee = " + employee);
    }
  }

  public int countSalarySumm() {
    int sum = 0;
    for (Employee employee : employees) {

      sum += employee.getSalary();
    }
    return sum;
  }

  public int countDeptSalarySumm(int department) {
    int sum = 0;
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {

      }

      sum += employee.getSalary();
    }
    return sum;
  }

  public Employee countMinSalary() {
    Employee min = employees[0];
    for (Employee employee : employees) {
      if (employee.getSalary() < min.getSalary()) {
        min = employee;
      }
    }
    return min;
  }

  public Employee countDeptMinSalary(int department) {
    Employee min = employees[0];
    for (Employee employee : employees) {
      if (employee.getDepartment() == department && employee.getSalary() < min.getSalary()) {
        min = employee;
      }
    }
    return min;
  }

  public Employee countMaxSalary() {
    Employee max = employees[0];
    for (Employee employee : employees) {
      if (employee.getSalary() > max.getSalary()) {
        max = employee;
      }
    }
    return max;
  }

  public Employee countDeptMaxSalary(int department) {
    Employee max = employees[0];
    for (Employee employee : employees) {
      if (employee.getDepartment() == department && employee.getSalary() > max.getSalary()) {
        max = employee;
      }
    }
    return max;
  }

  public int countMediumSalary() {
    return countSalarySumm() / employees.length;

  }

  public double countDepMediumSalary(int department) {
    int countInDept = 0;
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        countInDept++;
      }
    }
    return (double) countDeptSalarySumm(department) / countInDept;
  }

  public void FIO() {
    for (int i = 0; i < employees.length; i++) {
      System.out.println("employees[i].getFullName() = " + employees[i].getFullName());

    }
  }

  public void increaseSalaryPrint(double persent) {
    for (Employee employee : employees) {
      double increasePersent = 1 + persent / 100d;
      employee.setSalary((int) (employee.getSalary() * increasePersent));
      System.out.println(employee);
    }
  }

  public void increaseDeptSalaryPrint(int department, double persent) {
    for (Employee employee : employees) {
      double increasePersent = 1 + persent / 100d;
      if (employee.getDepartment() == department) {
        employee.setSalary((int) (employee.getSalary() * increasePersent));
        System.out.println(employee);
      }
    }

  }

  public void printDeptFIO(int department) {
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        System.out.printf("%d,%s,%d %n", employee.getId(), employee.getFullName(),
            employee.getSalary());
      }
    }
  }

  public void moreThanNumber(int salary) {
    for (Employee employee : employees) {
      if (employee.getSalary() >= salary) {
        System.out.printf("%d,%s,%d %n", employee.getId(), employee.getFullName(),
            employee.getSalary());
      }
    }
  }

  public void lessThanNumber(int salary) {
    for (Employee employee : employees) {
      if (employee.getSalary() < salary) {
        System.out.printf("%d,%s,%d %n", employee.getId(), employee.getFullName(),
            employee.getSalary());
      }
    }
  }

  public boolean addEmployee(Employee employee) {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] == null) {
        employees[i] = employee;
        return true;
      }
    }
    return false;
  }

  public void deliteEmployee(int id) {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getId() == id) {
        employees[i] = null;
        break;
      }
    }
  }

  public void print() {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] != null) {
        System.out.println(employees[i]);
      }
    }
  }

  public Employee get(int id) {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getId() == id) {
        return employees[i];
      }
    }
    return null;
  }

}