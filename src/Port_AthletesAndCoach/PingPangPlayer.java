package Port_AthletesAndCoach;

public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃牛肉，和牛奶");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
