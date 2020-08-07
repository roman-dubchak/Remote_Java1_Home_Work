package repo_java1_Home_Work.leeson4_emloyee;

public class Employee {
    private String fio;
    private float salary;
    private int age;
    private int id;


    Employee(String fio, float salary, int age){
        this.fio = fio;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return this.fio;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    private float getUpSalary(){
        return this.salary += 5000.00f; // можно содать сеттер с заданым дополнительным полем "Премия" = 5000.00f
    }

    void salaryUp (Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 45) {
                arr[i].getUpSalary();
                System.out.println("For employee: " + arr[i].getFio() + " " + arr[i].getAge() + " years" // for check
                        + " the new salary: " + arr[i].getSalary() + "!");
            }
        }
    }

    float averageSalary (Employee[] arr){
        float sumSalary = 0.0f, averageS = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSalary = sumSalary + arr[i].getSalary();
        }
        averageS = sumSalary / arr.length;
        System.out.println("The average salary of all employees is " + averageS);
        return averageS;
    }

    float averageAge (Employee[] arr){
        float sumAge = 0.0f, averageA = 0;
        for (int i = 0; i < arr.length; i++) {
            sumAge = sumAge + arr[i].getAge();
        }
        averageA = sumAge / arr.length;
        System.out.println("The average age of all employees is " + averageA);
        return averageA;
    }
}