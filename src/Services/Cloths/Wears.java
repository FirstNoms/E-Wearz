package Cloths;

public class Wears {
    private Category category;
    private double price;
    private int size;
    private Gender gender;
    private Type type;

    public Wears() {
    }

    public Wears(double price, int size, Category category, Gender gender, Type type) {
        this.price = price;
        this.size = size;
        this.category = category;
        this.gender = gender;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
