package repo_java1_Home_Work.lesson5_Zoo;

public class Dog extends Animal {
    protected final float swimLen;

    Dog(String name, float runLen, float jumpHeig, float swimLen) {
        super(name, runLen, jumpHeig);
        this.swimLen = swimLen;
    }

    @Override
    protected boolean swimming(float lengthObs) {
        return swimLen >= lengthObs;
    }
}


