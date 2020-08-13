package repo_java1_Home_Work.lesson5_Zoo;

public class Cat extends Animal{

    Cat (String name, float runLen, float jumpHeig, float swimLen) {
        super(name, runLen, jumpHeig, swimLen);
    }

    @Override
    protected int swimming(float lengthObs){
        return Animal.SWM_WTF;
    }
}
