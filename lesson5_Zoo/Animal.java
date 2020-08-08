package repo_java1_Home_Work.lesson5_Zoo;

public class Animal {
    protected String name;
    protected float runLen;
    protected float jumpHeig;

    protected Animal (String name, float runLen, float jumpHeig){
        this.name = name;
        this.runLen = runLen;
        this.jumpHeig =jumpHeig;
    }

    protected float run(float lengthObs){
        return lengthObs;
    }

    protected float jump(float heightObs){
        return heightObs;

    }

}
