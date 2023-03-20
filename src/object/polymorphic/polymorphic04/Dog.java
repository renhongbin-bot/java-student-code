package object.polymorphic.polymorphic04;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "2岁的" + getColor() + "颜色的狗两只前腿死死拖住" + something +"猛吃");
    }
    public void lookHom() {
        System.out.println("狗在看家");
    }
}
