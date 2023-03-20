package object.interfaceA.test;

public class PingpangStorper extends Storter implements English{
    public PingpangStorper() {
    }

    public PingpangStorper(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员再说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习如何打乒乓球");
    }
}
