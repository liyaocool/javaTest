import hero.Hero;


public class Index {
    public static void main(String[] args) {
        Hero Nuoke = new Hero();
        Nuoke.initialAttr(1, "诺克萨斯之手");
        Nuoke.initialSkill(0,"血滴子", 20.0, "技能和普攻附带流血效果");
        Nuoke.initialSkill(1,"大杀四方", 150.0, "向四周挥动板斧造成伤害");
        Nuoke.initialSkill(2,"致残打击", 100.0, "板斧重击敌方,并减速");
        Nuoke.initialSkill(3,"无情铁手", 50.0, "用板斧拉回敌人到自己身边,并减速");
        Nuoke.initialSkill(4,"断头台", 300.0, "斩杀生命值低于20%的敌人");


        //测试释放技能
        Nuoke.ReleaseSkill(3);
    }


}