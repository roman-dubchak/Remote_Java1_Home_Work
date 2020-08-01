package repo_java1_Home_Work.lesson1;

public class lesson1 {


    public static void main(String[] args) {
        System.out.println("Result Task 1 = " + methodTask1(2, 7, 10, 3));
        System.out.println("Result Task 2 = " + methodTask2(16, 9));
        System.out.println("Result Task 2 = " + methodTask2_1(16, 9));
        System.out.println("Result Task 3 = " + methodTask3(-1));
        System.out.println("Result Task 3 = " + methodTask3_1(-1));
        System.out.println(methodTask4("Роман"));
        System.out.println(methodTask5(400));
    }

    public static float methodTask1(int a, int b, int c, int d) { // task 1
        float dd = d;
        return a * (b + (c * 1.0f / dd));
    }

    public static boolean methodTask2(int i, int g) { // task 2
        if (i + g >= 10 && i + g <= 20) {
            return true;
        } else return false;
    }

    public static boolean methodTask2_1(int i1, int g1) { // task 2
        int sum = i1 + g1;
        return sum <= 20 && sum >= 10;
    }

    public static String methodTask3(int h) { // task 3
        if (h >= 0) {
            return "Positive number";
        } else return "Negative number";
    }

    public static boolean methodTask3_1(int a) { // task 3 через булиан
        return a >= 0;
    }

    public static String methodTask4(String name) { // task 4
        return "Привет, " + name + "!";
    }

    public static boolean methodTask5(int year) { // task 5*
        return (year % 4 == 0 && year % 100 == 0 || year % 400 == 0);
    }
}