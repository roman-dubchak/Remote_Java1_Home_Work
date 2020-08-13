package repo_java1_Home_Work.lesson5_Zoo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class main {
    public static void main(String[] args) {
        Dog d = new Dog("Bobick", 500f, 10f, 0.5f);
        Cat c = new Cat("Gera", 200f, 2f, 0.1f);

        Animal[] zoo = {d, c};
        Float lengthObsJump = 3.2f;
        Float lengthObsRun = 250f;
        Float lengthObsSwim = 0.4f;

        for (int i = 0; i < zoo.length; i++) {

            String nameAn = (zoo[i].name + " can ran " + zoo[i].getRunLen() + " m.");
            String runAn = (zoo[i].run(lengthObsRun)) ? (zoo[i].name + " ran!") : (zoo[i].name + " not ran!");
            System.out.println(nameAn + " Results: " + runAn);

            nameAn = (zoo[i].name + " can jump " + zoo[i].getJumpHeig() + " m.");
            String jumpAn = (zoo[i].jump(lengthObsJump)) ? (zoo[i].name + " jumped!") : (zoo[i].name + " not jumped!");
            System.out.println(nameAn + " Results: " + jumpAn);

            nameAn = (zoo[i].name + " can swim " + zoo[i].getSwimLen() + " m.");
            String swimAn = (zoo[i].swimming(lengthObsSwim) == Animal.SWM_YES) ? (zoo[i].name + " crossed!") : (zoo[i].name + " not crossed!");
            if (zoo[i].swimming(lengthObsSwim) == Animal.SWM_WTF) {
                swimAn = zoo[i].name + " did't swim!";
            }
            System.out.println(nameAn + " Results: " + swimAn);
        }
    }
}