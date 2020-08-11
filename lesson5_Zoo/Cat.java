package repo_java1_Home_Work.lesson5_Zoo;

public class Cat extends Animal{

    Cat (String name, float runLen, float jumpHeig){
        super (name, runLen, jumpHeig);
    }

    @Override
    protected boolean swimming(float lengthObs){
        return false;
    }
}
