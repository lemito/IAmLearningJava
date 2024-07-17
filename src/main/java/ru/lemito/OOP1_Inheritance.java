package ru.lemito;

import java.util.LinkedList;

/**
 * Интерфейсы - тоже приколюха аля .h -> #define для переменных и перечисление методов
 */

interface IAnimal {
    void present();
}

interface IHuman {
    int COUNT_LEGS = 2;
    void speak();
    void think();
    void move();
    void jump();
    void create();
}

/**
 * Родительский класс
 */
class Animal implements IAnimal{
    protected String name;
    protected String age;
    protected double weight;
    protected String coveringColor;

    /**
     * null-constructor
     */
    Animal() {}

    /**
     * full-constructor
     * @param name
     * @param age
     * @param weight
     * @param coveringColor
     */
    Animal(String name, String age, double weight,String coveringColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.coveringColor = coveringColor;
    }

    public void present(){
        System.out.printf("Name = %s, age = %s, weight = %f, color = %s\n", name, age, weight, coveringColor);
    }
}

abstract class Mammals extends Animal {
    protected int legsCount;

    Mammals() {
    }

    Mammals(String name, String age, double weight, String color, int legsCount) {
        super(name, age, weight, color);
        this.legsCount = legsCount;
    }

    /**
     * Абстрактный метод - заглушка. Он есть, но реализация только в наследника, в родителе - пустота (аля .h в С)
     */
    abstract void eatFood();

    abstract void feedWithMilk();
}

class Birds extends Animal{
    protected double wingSpan;
    Birds(){}

    Birds(String name, String age, double weight,String coveringColor, double wingSpan){
        super(name, age, weight, coveringColor);
        this.wingSpan = wingSpan;
    }

    @Override
    public void present(){
        super.present();
        System.out.printf("wingSpan = %f\n", wingSpan);
    }
}

class Fishes extends Animal{
    // лососевый => икра красная... тип отличия
    protected boolean isTuna;

    Fishes(){}

    Fishes(String name, String age, double weight,String coveringColor, boolean isTuna){
        super(name, age, weight, coveringColor);
        this.isTuna = isTuna;
    }

    @Override
    public void present(){
        super.present();
        System.out.printf("Is tuna? -> %s\n", isTuna);
    }
}

// от Human не может быть extends
final class Human  extends Mammals implements IHuman{
    int iq;
    Human(){};
    Human(String name, String age, double weight,String coveringColor, int IQ){
        super(name, age, weight, coveringColor, COUNT_LEGS);
        this.iq = IQ;
    }

    /**
     *
     */
    @Override
    void eatFood() {
        System.out.println("Человек ест");
    }

    /**
     *
     */
    @Override
    void feedWithMilk() {
        System.out.println("Человек кормит детей молоком");
    }

    @Override
    public void present(){
        super.present();
        System.out.printf("Iq =  %s\n", iq);
    }

    /**
     *
     */
    @Override
    public void speak() {

    }

    /**
     *
     */
    @Override
    public void think() {

    }

    /**
     *
     */
    @Override
    public void move() {

    }

    /**
     *
     */
    @Override
    public void jump() {

    }

    /**
     *
     */
    @Override
    public void create() {

    }
}

public class OOP1_Inheritance
{
    public static void main(String[] args) {
        LinkedList<Animal> zoo = new LinkedList<>();
        Human hu = new Human("Vova", "19", 60, "pink", 201);
        Birds parrot = new Birds("Poo", "1", 14, "yellow", 16);
        zoo.add(hu);
        zoo.add(parrot);

        for (Animal elem: zoo){
            elem.present();
        }
    }
}
