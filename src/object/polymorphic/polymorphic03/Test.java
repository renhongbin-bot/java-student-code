package object.polymorphic.polymorphic03;

import object.advanced.advance05.Dog;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        Cat d = (Cat) a;
        d.look();
//        判断类型
//        if(a instanceof Dog) {
//            Dog d = (Dog) a;
//            d.chai();
//        } else if(a instanceof Cat){
//            Cat c = (Cat) a;
//        }
//        新特新
//        if(a instanceof Cat c) {
//            c.look();
//        } else if(a instanceof Dog d) {
//            d.chai();
//        } else {
//            System.out.println("没有该类型");
//        }
    }
}
class Animal {
    public void eat() {
        System.out.println("动物吃东西");
    }
}
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }
    public void look() {
        System.out.println("好看的猫");
    }
}


