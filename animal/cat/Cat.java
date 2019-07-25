package animal.cat;

import animal.Animal;

public class Cat extends Animal {
    private int id;
    private String name;

    public Cat(int id, String name) {
        super(id, name);
        this.id = id;
        this.name = name;
    }

    public void superMove() {
        System.out.print(this.name + super.getStr());
        super.move();
    }

    public void move() {
        System.out.println(this.name + this.id + "号" + "在走猫步");
    }

    public void toDo() {
        System.out.println("小猫捉到老鼠!");
    }
}
