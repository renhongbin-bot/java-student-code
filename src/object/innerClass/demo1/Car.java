package object.innerClass.demo1;

public class Car {
    String carName;
    int carAge;
    String carColor;
    class Engine{
        String engineName;
        int engineAge;
        public void show() {
            System.out.println(engineName);
        }
    }
}
