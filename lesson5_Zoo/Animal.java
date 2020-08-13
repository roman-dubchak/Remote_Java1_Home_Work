package repo_java1_Home_Work.lesson5_Zoo;

import java.util.Random;

public class Animal {
    static final int SWM_YES = 1;
    static final int SWM_NO = 0;
    static final int SWM_WTF = -1;

    protected final String name;
    protected final float runLen;
    protected final float jumpHeig;
    protected final float swimLen;
//    private final Random random = new Random();

    protected Animal(String name, float runLen, float jumpHeig, float swimLen) {
        this.name = name;
        this.runLen = runLen;
        this.jumpHeig = jumpHeig;
        this.swimLen = swimLen;

    }

//    Animal(String type, String name, float maxJump, float maxRun, float maxSwim) {
//        float jumpDiff = random.nextFloat() * maxJump - (maxJump / 2);
//        float runDiff = random.nextFloat() * maxRun - (maxRun / 2);
//        float swimDiff = random.nextFloat() * maxSwim - (maxSwim / 2);
//
//        this.type = type;
//        this.name = name;
//        this.maxJump = maxJump + jumpDiff;
//        this.maxRun = maxRun + runDiff;
//        this.maxSwim = maxSwim + swimDiff;
//    }

    protected boolean run(float lengthObs) {
        return runLen >= lengthObs;
    }

    protected boolean jump(float heightObs) {
        return jumpHeig >= heightObs;
    }

    protected int swimming(float lengthObs) {
    return  (swimLen >= lengthObs) ? SWM_YES : SWM_NO;
    }

    String getName(){
        return this.name;
    }

    float getRunLen(){
        return this.runLen;
    }

    float getJumpHeig(){
        return this.jumpHeig;
    }

    float getSwimLen(){
        return this.swimLen;
    }
}
