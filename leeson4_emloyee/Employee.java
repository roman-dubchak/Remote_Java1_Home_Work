package repo_java1_Home_Work.leeson4_emloyee;

public class Employee {
    private String fio;
    private float salary;
    private int age;

    Employee(){
        this.fio = "Dubchak Roman Anatolievich";
        this.salary = 150123.46f;
        this.age = 33;
    }

    public String setFio() {
        return this.fio;
    }

    public float getSalary() {
        return salary;
    }

    public int setAge() {
        return this.age;
    }
}
