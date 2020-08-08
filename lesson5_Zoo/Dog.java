package repo_java1_Home_Work.lesson5_Zoo;

public class Dog extends Animal {
    static float swimLen;

    Dog(String name, float runLen, float swimLen, float jumpHeig) {
        super(name, runLen, jumpHeig);
        this.swimLen = swimLen;
    }

    @Override
    public float run(float length) {
        return 150;
    }

    protected float swimming(float lengthObs) {
        return lengthObs;
    }
}


