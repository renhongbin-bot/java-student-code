package objectTest;

public class Car {
    private String name;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{name = " + name + ", price = " + price + ", color = " + color + "}";
    }
}
