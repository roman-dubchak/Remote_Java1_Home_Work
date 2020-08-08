package repo_java1_Home_Work.lesson5_Zoo;

public class main {
    public static void main(String[] args) {
        Dog d = new Dog("Bobick", 500f, 10f, 0.5f);
        Cat c = new Cat ("Gera", 200f,  2f);

        d.run(150);
        c.run(100);
    }
}
