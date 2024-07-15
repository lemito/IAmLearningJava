package ru.lemito;

class Car{
    private String brand;
    private String color;
    private String type = "спорт кар";
    private int maxSpeed;

    /**
     * Выводит красивую строчечку
     */
    public void present(){
        System.out.printf("Это %s %s, цвет - %s. Максималка - %d\n", type, brand, color, maxSpeed);
    }

    // сгенерировано intellij idea
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // перегруз конструкторов

    /**
     * Пустой конструктор
     */
    Car(){}

    /**
     * Конструктор с брендом
     * @param brand
     */
    Car(String brand){
        this.brand = brand;
    }

    /**
     * Конструктор с брендом, цветом и макс. скоростью
     * @param brand
     * @param color
     * @param maxSpeed
     */
    Car( String brand,
     String color,
     int maxSpeed){
        this(brand);
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Конструктор со всеми атрибутами
     * @param brand
     * @param color
     * @param maxSpeed
     * @param type
     */
    Car(String brand,
        String color,
        int maxSpeed, String type){
        this(brand, color, maxSpeed);
        this.type = type;
    }
    //=====================
}

public class OOP0 {
    public static void main(String[] args){
        Car first = new Car();
        first.setBrand("Ferrari");
        first.setColor("Red");
        first.setMaxSpeed(400);
        first.present();
        Car second = new Car("Audi", "Yellow", 125, "Sedan");
        second.present();

    }
}
