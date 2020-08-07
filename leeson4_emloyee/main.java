package repo_java1_Home_Work.leeson4_emloyee;

public class main {
     public static void main(String[] args) {
         Employee employee = new Employee("Roman  D.A.", 1200.00f, 33);
         employee.getFio();
         employee.getAge();
         System.out.println("Employee: " + employee.getFio() + ";"
                 + " age: " + employee.getAge() + ".");
         System.out.println();

         Employee[] staff = new Employee[5];
         staff[0] = employee;
         staff[1] = new Employee("Petr A.N.", 1200.00f, 45);
         staff[2] = new Employee("Arkagy S.C.", 1200.00f, 48);
         staff[3] = new Employee("Dmytriy A.R.", 1200.00f, 39);
         staff[4] = new Employee("Artem P.V.", 1200.00f, 32);

         System.out.println("Employees over 40 years of age: ");
         for (int i = 0; i < staff.length; i++) {
             if (staff[i].getAge() > 40)
                 System.out.println("Employee: "+ staff[i].getFio() +
                         ";" + " age: " + staff[i].getAge() +
                         ";" + " salary: " + staff[i].getSalary());
         }
         System.out.println();

         employee.salaryUp(staff);
         employee.averageSalary(staff);
         employee.averageAge(staff);
     }
}