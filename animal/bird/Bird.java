package animal.bird;

import animal.Animal;

public class Bird extends Animal {
    private int id;
    private String name;

    public Bird(int id, String name) {
        super(id, name);
        this.id = id;
        this.name = name;
    }

    public void move() {
        System.out.println(this.name + this.id + "号" + "在翱翔");
    }
}
