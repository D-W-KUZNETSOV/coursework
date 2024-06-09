public class Main {



  public static void main(String[] args) {

    EmployeeBook book = new EmployeeBook();


    book.addEmployee(new Employee(1, "Иванов Иван Иванович", 50000));
    book.addEmployee(new Employee(1, "Петров Сергей Семёнович", 100000));
    book.addEmployee(new Employee(3, "Савельев Пётр Андреевич", 70000));
    book.addEmployee(new Employee(2, "Кузьмин Артём Николаевич", 55000));
    book.addEmployee(new Employee(3, "Зюзин Николай Петрович", 68000));
    book.addEmployee(new Employee(4, "Подопригора Фёдор Анатольевич", 90000));
    book.addEmployee(new Employee(2, "Смирнов Александр Андреевич", 65000));
    book.addEmployee(new Employee(4, "Самойлов Филип Анатольевич", 87000));
    book.addEmployee(new Employee(5, "Хуань Ли Цзы", 100000));
    book.addEmployee(new Employee(5, "Хвостов Сидор Александрович", 88000));






    book.printEmployees();
    System.out.println("=============");
    book.countSalarySumm();
    System.out.println("countSalarySumm() = " + book.countSalarySumm());
    System.out.println("==============");
    book.countMinSalary();
    System.out.println("countMinSalary() = " + book.countMinSalary());
    System.out.println("===============");
    book.countMaxSalary();
    System.out.println("countMaxSalary() = " + book.countMaxSalary());
    System.out.println("===============");
    book.countMediumSalary();
    System.out.println("countMediumSalary() = " + book.countMediumSalary());
    System.out.println("===============");
    book.FIO();
    System.out.println("================");
    book.printEmployees();
    System.out.println("================");
    book.increaseSalaryPrint(5);
    System.out.println("=================");
    book.printDeptFIO(2);
    book.printDeptFIO(5);
    System.out.println("==================");
    book.lessThanNumber(50000);
    System.out.println( "=================");
    book.countDeptMaxSalary(3);
    System.out.println(book.countDeptMaxSalary(3));
    System.out.println("==================");
    book.increaseDeptSalaryPrint(3,5);
    System.out.println("==================");
    System.out.println(book.countDeptMinSalary(5));
    System.out.println("===================");
    System.out.println(book.countDepMediumSalary(4));
    System.out.println("====================");
    book.moreThanNumber(100000);



  }




}





