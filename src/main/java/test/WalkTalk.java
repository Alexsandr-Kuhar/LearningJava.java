package main.java.test;

public class WalkTalk {
    public static void main(String[] args) {
        TalkThread  talk = new TalkThread();
        Thread walk =new Thread(new WalkRunnable());
        talk.start();
        walk.start();
    }
}
