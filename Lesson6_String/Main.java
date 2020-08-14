package repo_java1_Home_Work.Lesson6_String;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            PrintStream ps1 = new PrintStream(new FileOutputStream("File1.txt"));
            PrintStream ps2 = new PrintStream(new FileOutputStream("File2.txt"));
            ps1.print("Scarlett O’Hara was not beautiful, but men seldom realized ");
            ps2.print("it when caught by her charm as the Tarleton twins were.");
            ps1.flush();
            ps1.close();
            ps2.flush();
            ps2.close();

            FileInputStream fis2 = new FileInputStream("File2.txt");
            int b;
            while (((b = fis2.read()) != -1)) {
                // System.out.print((char) b); for check
                PrintStream ps3 = new PrintStream(new FileOutputStream("File1.txt", true));
                ps3.print((char) b);
            }
            fis2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

//    private static void writeFile1() {
//        StringBuilder sb1 = new StringBuilder();
//        if (sb1 != null) {
//            for (int i = 65; i < 91; i++) {
//                sb1.append((char) i);
//            }
//        }
//    }
//
//    private static void writeFile2 () {
//        StringBuilder sb2 = new StringBuilder();
//        if (sb2 != null) {
//            for (int i = 97; i < 123; i++) {
//                sb2.append((char) i);
//            }
//        }
//    }
}
