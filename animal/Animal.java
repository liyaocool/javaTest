package animal;

public class Animal {
    private int id;
    private String name;
    private String str;
    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
        this.str = "呵呵~";
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    protected String getStr(){
        return this.str;
    }
    public void move() {
        System.out.println("动物在移动");
    }
}
