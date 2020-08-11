package repo_java1_Home_Work.lesson5_Zoo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class main {
    public static void main(String[] args) {
        Dog d = new Dog("Bobick", 500f, 0.5f, 10f);
        Cat c = new Cat("Gera", 200f, 2f);

        Animal[] zoo = {d, c};
        for (int i = 0; i < zoo.length; i++) {
            String runAn = (zoo[i].run(150)) ? (zoo[i].name + " ran!") : (zoo[i].name + " not ran!");
            String jumpAn = (zoo[i].jump(2)) ? (zoo[i].name + " jumped!") : (zoo[i].name + " not jumped!");
            System.out.println("Results run: " + runAn + " Results jump: " + jumpAn);
            if (zoo[i] instanceof Dog) {
                ((Dog) zoo[i]).swimming(10);
                String swimAn = (zoo[i].swimming(10)) ? (zoo[i].name + " crossed!") : (zoo[i].name + " not crossed!");
                System.out.println("Results swimming: " + swimAn);
            }
        }
    }
}