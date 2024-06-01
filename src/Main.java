public class Main {

  private static final Employee[] employees = new Employee[10];

  public static void main(String[] args) {
    employees[0] = new Employee(1, "Иванов Иван Иванович", 50000);
    employees[1] = new Employee(1, "Петров Сергей Семёнович", 100000);
    employees[2] = new Employee(3, "Савельев Пётр Андреевич", 70000);
    employees[3] = new Employee(2, "Кузьмин Артём Николаевич", 55000);
    employees[4] = new Employee(3, "Зюзин Николай Петрович", 68000);
    employees[5] = new Employee(4, "Подопригора Фёдор Анатольевич", 90000);
    employees[6] = new Employee(2, "Смирнов Александр Андреевич", 65000);
    employees[7] = new Employee(4, "Самойлов Филип Анатольевич", 87000);
    employees[8] = new Employee(5, "Хуань Ли Цзы", 100000);
    employees[9] = new Employee(5, "Хвостов Сидор Александрович", 88000);

    employees[2].setSalary(150000);
    employees[3].setDepartment(5);
    printEmployees();
    countSalarySumm();
    countMinSalary();
    countMaxSalary();
    countMediumSalary();
    FIO();

  }

  public static void printEmployees() {
    for (Employee employee : employees) {
      System.out.println("employee = " + employee);
    }
  }

  public static void countSalarySumm() {
    int sum = 0;
    for (int i = 0; i < employees.length; i++) {
      sum += employees[i].getSalary();
    }
  }

  public static Employee countMinSalary() {
    int minSalary = employees[0].salary;
    int index = 0;
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getSalary() < minSalary) {
        minSalary = employees[i].getSalary();
        index = i;
      }
    }
    return employees[index];
  }

  private static Employee countMaxSalary() {
    int maxSalary = employees[0].salary;
    int index = 0;
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getSalary() > maxSalary) {
        maxSalary = employees[i].getSalary();
        index = i;
      }
    }
    return employees[index];
  }

  public static int countMediumSalary() {
    int sum = 0;
    int medium;
    for (int i = 0; i < employees.length; i++) {
      sum += employees[i].getSalary();
    }
    medium = sum / employees.length;
    return medium;
  }

  public static void FIO() {
    for (int i = 0; i < employees.length; i++) {
      System.out.println("employees[i].getFullName() = " + employees[i].getFullName());

    }
  }

}
