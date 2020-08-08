package repo_java1_Home_Work.leeson4_emloyee;

public class Employee {

    private static final int CURRENT_YEAR = 2020;

    private String fio;
    private float salary;
    private int age;
    private int birthYear;
    boolean isSalaryChanged;
    private static int id = 0; // статик хронит занчение в классе
    public int uid; // хронит занчение id++ в созданом объекте


    Employee(String fio, float salary, int birthYear){
        this.fio = fio;
        this.salary = salary;
        this.birthYear = birthYear;
        this.uid = id++;
    }

    public String getFio() {
        return this.fio;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    public void setUpSalary(float dif){
        this.salary += dif;
    }

    String getFullInfo(){
        return " id " +
                this.uid + "; " +
                this.fio + "; " +
                this.getAge() + " years old" + ". Salary is " +
                this.salary + " RUR.";

    }
}