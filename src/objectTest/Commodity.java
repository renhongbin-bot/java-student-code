package objectTest;

public class Commodity {
    private int id;
    private String name;
    private double price;
    private int residue;

    public Commodity() {
    }

    public Commodity(int id, String name, double price, int residue) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.residue = residue;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return residue
     */
    public int getResidue() {
        return residue;
    }

    /**
     * 设置
     * @param residue
     */
    public void setResidue(int residue) {
        this.residue = residue;
    }

    public String toString() {
        return "Commodity{id = " + id + ", name = " + name + ", price = " + price + ", residue = " + residue + "}";
    }
}
