package repo_java1_Home_Work.lesson5_Zoo;

public abstract class Animal {
    protected final String name;
    protected final float runLen;
    protected final float jumpHeig;

    protected Animal (String name, float runLen, float jumpHeig){
        this.name = name;
        this.runLen = runLen;
        this.jumpHeig = jumpHeig;
    }

    protected boolean run(float lengthObs){
        return runLen >= lengthObs;
    }

    protected boolean jump(float heightObs){
        return jumpHeig >= heightObs;
    }

    protected abstract boolean swimming(float lengthObs);

}
