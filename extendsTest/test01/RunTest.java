package extendsTest.test01;

import extendsTest.test01.bird.Bird;
import extendsTest.test01.cat.Cat;

public class RunTest {
    public static void main(String[] args) {
        Animal animal = new Animal(1, "普通动物");
        animal.move();

        Animal catAnimal = new Cat(1, "小菊");
        catAnimal.move();

        Animal birdAnimal = new Bird(1,"黄鹂");
        birdAnimal.move();
    }
}
