package langObjectTest.test01;

public class Star {
    private String id;
    private String name;

    public Star(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println(this.id + "--" + this.name);
    }

    public String toString() {
        String str = this.id + "明星" + this.name;
        return str;
//        if(this.id != id && this.name != name) {
//            return false;
//        }
//        return true;
    }

    public boolean equals(Object obj) {
        //自反性：对于任意的对象x，x.equals(x)返回true(自己一定等于自己)；
        if(this == obj) return true;
        //非同一类型,直接排除
        if(!(obj instanceof Star)) return false;
        //强制类型转换
        Star star = (Star) obj;
        //比较属性值
        return star.id.equals(id)  && star.name.equals(name);
    }
}
