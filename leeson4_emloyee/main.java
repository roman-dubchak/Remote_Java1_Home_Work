package repo_java1_Home_Work.leeson4_emloyee;

public class main {
     public static void main(String[] args) {
         Employee employee = new Employee("Roman  D.A.", 1200.00f, 1987);
         employee.getFio();
         employee.getAge();
         System.out.println("Employee: " + employee.getFio() + ";"
                 + " age: " + employee.getAge() + ".");
         System.out.println();

         System.out.println("--------------------------------------------------");

         Employee[] staff = new Employee[5];
         staff[0] = employee;
         staff[1] = new Employee("Petr A.N.", 1200.00f, 1975);
         staff[2] = new Employee("Arkagy S.C.", 1200.00f, 1972);
         staff[3] = new Employee("Dmytriy A.R.", 1200.00f, 1981);
         staff[4] = new Employee("Artem P.V.", 1200.00f, 1988);

         for (int i = 0; i < staff.length; i++) {
             System.out.println(staff[i].getFullInfo());
         }

         System.out.println("--------------------------------------------------");

         System.out.println("Employees over 40 years of age: ");
         for (int i = 0; i < staff.length; i++) {
             if (staff[i].getAge() > 40)
                 System.out.println(staff[i].getFullInfo());
         }
         System.out.println("--------------------------------------------------");

         SalaryUp(staff,(byte) 45,5000f);
         for (int i = 0; i < staff.length; i++) {
             if(staff[i].isSalaryChanged){
                 System.out.println(staff[i].getFullInfo());
             }
         }

         System.out.println("--------------------------------------------------");

         System.out.println("The average age of all employees is " + averageAge(staff) + " years!");
         System.out.println("The average salary of all employees is " + averageSalary(staff) + " RUR!");
     }

    public static void SalaryUp (Employee[] arr, byte age, float incrim) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > age) {
                arr[i].setUpSalary(incrim);
                arr[i].isSalaryChanged = true;
            }
        }
    }

    private static float averageSalary (Employee[] arr){
        float sumSalary = 0.0f;
        for (int i = 0; i < arr.length; i++) {
            sumSalary = sumSalary + arr[i].getSalary();
        }
        return sumSalary / arr.length;
    }

    private static float averageAge (Employee[] arr){
        float sumAge = 0.0f;
        for (int i = 0; i < arr.length; i++) {
            sumAge = sumAge + arr[i].getAge();
        }
        return sumAge / arr.length;
    }
}